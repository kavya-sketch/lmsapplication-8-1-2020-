package com.lms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lms.service.UserService;

@Controller
public class RegistrationController {
	@Autowired
	public UserService userService;
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request,HttpServletResponse response) {
		ModelandView mav=new ModelAndView("register");
		mav.addObject("user",new User());
		return mav;
	}
	@RequestMapping(value="/registerProcess", method = RequestMethod.POST)
	public ModelAndView addUser(HttpServletRequest request,HttpServletResponse response,
			@ModelAttribute("user") User user) {
		userService.register(user);
		return new ModelAndView("welcome", "firstname", user.getFirstname());
	}
	
	
	

}
