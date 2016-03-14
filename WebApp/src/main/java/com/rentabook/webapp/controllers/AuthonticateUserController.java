package com.rentabook.webapp.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthonticateUserController {
	private static final Logger logger = Logger.getLogger(AuthonticateUserController.class);
	@RequestMapping( value = "/", method = RequestMethod.GET )
    public String index()
    {
		logger.debug(" index() method is called  "); 
        return "index";
    }

}
