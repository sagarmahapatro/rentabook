package com.rentabokk.webservices;
import org.jdom.Element;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.transport.http.MessageDispatcherServlet;

@Endpoint 
public class UserAuthenticationService {

	 private static final String NAMESPACE_URI = "http://rentabook.com/hr/schemas";
	 
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "createUser")                                              
    public void handleHolidayRequest(@RequestPayload Element holidayRequest) throws Exception { 
		
    }
}
