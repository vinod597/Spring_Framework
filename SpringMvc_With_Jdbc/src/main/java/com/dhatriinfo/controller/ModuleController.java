package com.dhatriinfo.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dhatriinfo.bean.Employee;
import com.dhatriinfo.dao.EmployeeDaoOld;


@Controller
public class ModuleController {
	/*Step:6 - it recieves a req from jsp page through url */
	@RequestMapping(value="registration")
	public ModelAndView openRegistration(){
		ModelAndView modelandview= new ModelAndView();
	/*Step-7 - ModelAndview will return the jsp page by using InternalResourceViewResolver internally*/	
	 modelandview.setViewName("registration");
		return modelandview;	
	}
	
	@RequestMapping(value="Delete")
	public ModelAndView openDelete(){
		ModelAndView modelandview= new ModelAndView();
		modelandview.setViewName("Delete");
		return modelandview;	
	}
	@RequestMapping(value="Search")
	public ModelAndView openSearch(){
		ModelAndView modelandview= new ModelAndView();
		modelandview.setViewName("Search");
		return modelandview;	
}
	@RequestMapping(value="update")
	public ModelAndView openUpdate(){
		ModelAndView modelandview= new ModelAndView();
		modelandview.setViewName("update");	
		return modelandview;
		
	}
	
}
