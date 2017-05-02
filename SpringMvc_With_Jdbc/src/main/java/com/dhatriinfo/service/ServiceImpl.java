package com.dhatriinfo.service;

import java.util.List;

import com.dhatriinfo.bean.Employee;

public interface ServiceImpl {
	public abstract boolean inserData(Employee emp);
	public abstract boolean updateData(Employee emp);
	public abstract boolean deleteData(Employee emp);
	public abstract List<Employee> searchData(Employee emp);
	public abstract List<String> searchDao1(String id);
	

}
