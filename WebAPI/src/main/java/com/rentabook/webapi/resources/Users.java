package com.rentabook.webapi.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rentabook.dtos.UserInfoDTO;
import com.rentabook.services.IUserManagmentService;

@RestController
@RequestMapping("/user")
public class Users {
	
	@Autowired
	@Qualifier("usermanagmentservice")
	IUserManagmentService userManagmentService = null;
	
	@RequestMapping(value = "/{mailid}/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	UserInfoDTO getUsersByid(@PathVariable("mailid") String mailID, @PathVariable("username") String userName) {
		return userManagmentService.getUserInfoDTO(userName, mailID);
	}
}
