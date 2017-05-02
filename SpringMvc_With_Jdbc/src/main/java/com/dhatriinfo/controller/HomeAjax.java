package com.dhatriinfo.controller;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dhatriinfo.bean.Employee;
import com.dhatriinfo.json.JsonResponse;
import com.dhatriinfo.service.ServiceImpl;
import com.google.gson.Gson;

@Controller
@RequestMapping("/HomeAjax")
public class HomeAjax {
	@Autowired
	ServiceImpl serviceImpl;
	Logger log = Logger.getLogger(getClass());

	@RequestMapping(value = "/getZips", method = RequestMethod.GET)
	public @ResponseBody
	void getTags(@RequestParam("term") Employee emplopyeeId,HttpServletRequest request,HttpServletResponse response) throws IOException {
		log.info("getTags() started");
		List<Employee> listString=serviceImpl.searchData(emplopyeeId);
			String result = new Gson().toJson(listString);
			
			 response.getWriter().write(result);
			 
		}
	
	@RequestMapping(value = "/getData", method = RequestMethod.GET)
	public @ResponseBody
	void getZipData(@RequestParam("term") Employee emplopyeeId,HttpServletRequest request,HttpServletResponse response) throws IOException {
		log.info("getData() started");
		JsonResponse jsonResponse=new JsonResponse();
		Employee empBean=new Employee();
		//search
		List<Employee> listZipBean=serviceImpl.searchData(emplopyeeId);
		Iterator<Employee> iterator=listZipBean.iterator();
		while(iterator.hasNext())
		{
			jsonResponse.setStatus("SUCCESS");
			empBean=(Employee)iterator.next();
			jsonResponse.setResultObject(empBean);
		}
			
			String result = new Gson().toJson(jsonResponse);
			 response.getWriter().write(result);
			
		}
			
	
}
