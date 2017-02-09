package com.dhatriinfo.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dhatriinfo.bean.Employee;
import com.dhatriinfo.dao.DaoImplementation;
import com.dhatriinfo.dao.EmployeeDaoOld;

public class ServiceImplementation implements ServiceImpl{

	ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
	DaoImplementation dao=(DaoImplementation)ctx.getBean("edao");
	
	public boolean inserData(Employee emp) {
		// TODO Auto-generated method stub
		return dao.insertDao(emp);
	}

	public boolean updateData(Employee emp) {
		// TODO Auto-generated method stub
		return dao.updateDao(emp);
	}

	public boolean deleteData(Employee emp) {
		// TODO Auto-generated method stub
		return dao.deleteDao(emp);
	}

	public List<Employee> searchData(Employee emp) {
		// TODO Auto-generated method stub
		return dao.searchDao(emp);
	}

}
