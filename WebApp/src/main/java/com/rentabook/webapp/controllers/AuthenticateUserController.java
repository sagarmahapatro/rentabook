package com.rentabook.webapp.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rentabook.dtos.UserInfoDTO;
import com.rentabook.services.IUserManagmentService;

@Controller
public class AuthenticateUserController {
	private static final Logger logger = Logger.getLogger(AuthenticateUserController.class);

	@Autowired
	@Qualifier("usermanagmentservice")
	IUserManagmentService userManagmentService = null;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		logger.debug(" index() method is called  ");
		return "index";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
		logger.debug(" home() method is called  ");
		return "index";
	}

	@RequestMapping(value = "/signout", method = RequestMethod.GET)
	public String signout() {
		logger.debug(" signout() method is called  ");
		return "index";
	}

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup() {
		logger.debug(" signup() method is called  ");
		return "signup";
	}

	@RequestMapping(value = "/adduser", method = RequestMethod.POST)
	public String adduser(@RequestParam(value = "firstName") String firstName,
			@RequestParam(value = "lastName") String lastName, @RequestParam(value = "email") String email,
			@RequestParam(value = "password") String password, @RequestParam(value = "repassword") String repassword) {

		logger.debug(" adduser() method is called  ");
		logger.debug(" argument name : firstName value " + firstName + "  ");
		logger.debug(" argument name : lastName value " + lastName + "  ");
		logger.debug(" argument name : email value " + email + "  ");
		logger.debug(" argument name : password value " + password + "  ");
		logger.debug(" argument name : repassword value " + repassword + "  ");

		if (!password.equals(repassword)) {
			return "signup";
		} else {
			userManagmentService.registerUser(firstName, lastName, email, repassword);
			return "redirect:mainapp";
		}

	}

	@RequestMapping(value = "/authuser", method = RequestMethod.POST)
	public String adduser(@RequestParam(value = "email") String email,	@RequestParam(value = "password") String password) {
		
		boolean val = false;
		val = userManagmentService.authonticateUser(email, password);
		if (val) {
			if(userManagmentService.isAAdminUser(email)){
				logger.debug(" user is admin ");
			}else if(userManagmentService.isASuperUser(email)){
				logger.debug(" user is a superuser ");
			}else{
				return "redirect:mainapp";
			}
			return "redirect:mainapp";
		} else {
			return "signup";
			
		}
	}

}
