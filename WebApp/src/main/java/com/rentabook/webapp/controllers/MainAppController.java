package com.rentabook.webapp.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/mainapp")
public class MainAppController {
	
	
	@RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView mainapp(HttpSession session)
    {
         return new ModelAndView("mainapp");
    }
}
