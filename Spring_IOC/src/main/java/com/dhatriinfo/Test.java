package com.dhatriinfo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Test {

	public static void main(String[] args) {
		Resource ref=new ClassPathResource("ApplictionContext.xml");
		@SuppressWarnings("deprecation")
		BeanFactory benfac=new XmlBeanFactory(ref);
		Employee emp=(Employee)benfac.getBean("emp");
		System.out.println(emp.getEmployeeid()+" "+emp.getEmployeename()+" "+emp.getEmployeesalary());
		
	}

}

