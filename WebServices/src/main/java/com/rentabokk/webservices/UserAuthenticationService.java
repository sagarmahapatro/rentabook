package com.rentabokk.webservices;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.transport.http.MessageDispatcherServlet;

@Endpoint  
public class UserAuthenticationService {

	 private static final String NAMESPACE_URI = "http://rentabook.com/hr/schemas";
	 
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "HolidayRequest")                                              (3)
    public void handleHolidayRequest(@RequestPayload Element holidayRequest) throws Exception {                        (4)
        Date startDate = parseDate(startDateExpression, holidayRequest);
        Date endDate = parseDate(endDateExpression, holidayRequest);
        String name = firstNameExpression.evaluateFirst(holidayRequest).getText() + " " + lastNameExpression.evaluateFirst(holidayRequest).getText();

        humanResourceService.bookHoliday(startDate, endDate, name);
    }
}
