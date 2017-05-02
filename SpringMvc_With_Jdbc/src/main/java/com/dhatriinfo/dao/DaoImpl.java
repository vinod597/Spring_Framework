package com.dhatriinfo.dao;

import java.util.List;

import com.dhatriinfo.bean.Employee;

public interface DaoImpl {
	public abstract Boolean insertDao(Employee emp);
	public abstract Boolean updateDao(Employee emp);
	public abstract Boolean deleteDao(Employee emp);
	public abstract List<Employee> searchDao(Employee emp);
	public abstract List<String> searchDao1(String id);

}
