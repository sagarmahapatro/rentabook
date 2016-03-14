package com.rentabook.webapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("**/people")
public class AuthenticateUserController {
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String show(@PathVariable("id") Long id, ModelMap modelMap) {
		// business logic to retrieve a Person entity
		return "person";
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public String delete( @PathVariable("id") Long id) {
		// business logic to delete a Person entity and
		// return the appropriate view goes here
		
		return "";
	}
}
