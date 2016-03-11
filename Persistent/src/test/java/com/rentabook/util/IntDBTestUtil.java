package com.rentabook.util;

import java.sql.Connection;

import javax.sql.DataSource;



import liquibase.Liquibase;
import liquibase.database.jvm.HsqlConnection;
import liquibase.resource.ClassLoaderResourceAccessor;

public class IntDBTestUtil {

	private DataSource dataSource;
	
	public  void initializeDB(String changeLogFile) throws Exception {
		
		  Connection conn = dataSource.getConnection();
	      Liquibase liquibase = new Liquibase(changeLogFile,
	              new ClassLoaderResourceAccessor(), new HsqlConnection(conn));
	      // Uncomment the following line when testing with mysql database
	      /*
	       * Liquibase liquibase = new Liquibase(changeLogFile, new
	       * ClassLoaderResourceAccessor(), new JdbcConnection(conn));
	       */
	 
	      liquibase.update("");
	      conn.close();
	}
	
	public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	  }
}
