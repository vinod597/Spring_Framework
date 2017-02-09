package com.dhatriinfo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*Step:3 - recieves a request from cfg.xml by finding @controller then it returns the jsp page*/
@Controller
public class IntialController {
	Logger log = Logger.getLogger(getClass());
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String init(HttpServletRequest request,HttpServletResponse response){
		log.info("init() started");
		System.out.println("intializer home");
		return "Home";
		
	}

}
