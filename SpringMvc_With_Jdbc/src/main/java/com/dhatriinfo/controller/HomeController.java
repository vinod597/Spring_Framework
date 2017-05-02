package com.dhatriinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dhatriinfo.bean.Employee;
import com.dhatriinfo.dao.EmployeeDaoOld;
import com.dhatriinfo.service.ServiceImpl;

@Controller
public class HomeController {
	
	@Autowired
	ServiceImpl serviceImpl;
	/*Step:10 - it recieves req from jsp page */
	@RequestMapping(value="registered" ,method=RequestMethod.POST )
	public ModelAndView readValues(@ModelAttribute Employee emp){
		ModelAndView modelandview= new ModelAndView();
		modelandview.setViewName("Home");
		serviceImpl.inserData(emp);
		String str=emp.getEmployeeId()+" "+emp.getEmployeeName()+" employee is inserted";
		System.out.println(str);
		modelandview.addObject("display", str);
				return modelandview;
	}
	
	@RequestMapping(value="Deleted",method=RequestMethod.POST)
	public ModelAndView readValuesForDelete(@ModelAttribute Employee emp){
		ModelAndView modelandview= new ModelAndView();
		modelandview.setViewName("Home");
		serviceImpl.deleteData(emp);
		String str=emp.getEmployeeId()+" employee deleted";
		modelandview.addObject("display", str);
				return modelandview;
}
	// for search based on id
	@RequestMapping(value="viewed",method=RequestMethod.POST)
	public ModelAndView readValuesForSearch(@ModelAttribute Employee emp){
		ModelAndView modelandview= new ModelAndView();
		modelandview.setViewName("Search");
		
		List<Employee> list =serviceImpl.searchData(emp);
		modelandview.addObject("employeeList", list);
		
				return modelandview;
}
	
	
	//getting request from formaction for update.jsp
	@RequestMapping(value="updatesearch")
	public ModelAndView readValuesForUpdate(@ModelAttribute Employee emp){
		ModelAndView modelandview= new ModelAndView();
		
		if(emp.getEmployeeName()==null){
			modelandview.setViewName("update");
			List<Employee> list =serviceImpl.searchData(emp);
			modelandview.addObject("searchlist", list);
			System.out.println("update search"+list);
		}else
		{
			modelandview.setViewName("Home");
			serviceImpl.updateData(emp);
		String str=emp.getEmployeeId()+" employee updated";
		modelandview.addObject("display", str);
		}

		return modelandview;
		
	}


}
