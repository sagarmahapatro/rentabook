package com.rentabook.inmemorydb;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.hsqldb.Server;
import org.hsqldb.persist.HsqlProperties;
import org.hsqldb.server.ServerAcl.AclFormatException;
import org.springframework.context.SmartLifecycle;

public class HsqlDBServer implements SmartLifecycle {

	static Logger logger = Logger.getLogger(HsqlDBServer.class);

	private HsqlProperties properties;
	private Server server;
	private boolean running = false;

	public HsqlDBServer(Properties props) {
		properties = new HsqlProperties(props);
	}
	
	public HsqlDBServer(){
		HsqlProperties p = new HsqlProperties();
		 p.setProperty("server.database.0","file:/opt/db/accounts");
		 p.setProperty("server.dbname.0","an_alias");
	}

	public boolean isRunning() {
		if (server != null)
			server.checkRunning(running);
		return running;
	}

	public void start() {
		if (server == null) {
			logger.info("Starting HSQL server...");
			server = new Server();
			try {
				server.setProperties(properties);
				server.start();
				running = true;
			} catch (AclFormatException afe) {
				logger.error("Error starting HSQL server.", afe);
			} catch (IOException e) {
				logger.error("Error starting HSQL server.", e);
			}
		}

	}

	public void stop() {
		logger.info("Stopping HSQL server...");
		if (server != null) {
			server.stop();
			running = false;
		}
	}

	public int getPhase() {
		return 0;
	}

	public boolean isAutoStartup() {
		return true;
	}

	public void stop(Runnable runnable) {
		stop();
		runnable.run();
	}

}
