package com.dhatriinfo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.dhatriinfo.bean.Employee;

public class EmployeeDaoOld {
	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	  
	public Boolean saveEmployeeByPreparedStatement(final Employee emp)
	{  
	    String query="insert into employee values(?,?,?,?,?)";  
	    return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
	     
	    public Boolean doInPreparedStatement(PreparedStatement ps)  
	            throws SQLException, DataAccessException {  
	              
	        ps.setString(1,emp.getEmployeeId());  
	        ps.setString(2,emp.getEmployeeName());  
	        ps.setFloat(3,emp.getEmployeeSalary());
	        ps.setFloat(4, emp.getEmployeeExperiance());
	        ps.setString(5, emp.getEmployeeLocation());
	              
	        return ps.execute();  
	              
	    }  
	    });  
	}  
	
	//delete employee
	public Boolean deleteEmployee(final Employee emp)
	{
		String query="delete from employee where employeeId=?";
		return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
		     
		    public Boolean doInPreparedStatement(PreparedStatement ps)  
		            throws SQLException, DataAccessException {
		    	
		    	 ps.setString(1,emp.getEmployeeId()); 
		    
		return ps.execute();
		
	}

}); 
	}
	
	//Search employee
	public List<Employee> getAllEmployees(Employee emp) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from employee where employeeId='"+emp.getEmployeeId()+"'",new ResultSetExtractor<List<Employee>>(){  
		    public List<Employee> extractData(ResultSet rs) throws SQLException,  
		            DataAccessException {  
		      
		        List<Employee> list=new ArrayList<Employee>();  
		        while(rs.next()){  
		        Employee e=new Employee();  
		        e.setEmployeeId(rs.getString(1));  
		        e.setEmployeeName(rs.getString(2));  
		        e.setEmployeeSalary(rs.getFloat(3));  
		        e.setEmployeeExperiance(rs.getFloat(4));
		        e.setEmployeeLocation(rs.getString(5));
		        list.add(e);  
		        }  
		        return list;  
		        }  
		    });   
	} 
	
	//Update the employee datails based on id by passing id from @homeController
	
	public Boolean updateEmployeeByPreparedStatement(final Employee emp)
	{  
	    String query="update employee set employeeName=?,employeeSalary=?,employeeExperiance=?,employeeLocation=? where employeeId=?";  
	    return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
	     
	    public Boolean doInPreparedStatement(PreparedStatement ps)  
	            throws SQLException, DataAccessException {  
	              
	        ps.setString(5,emp.getEmployeeId());  
	        ps.setString(1,emp.getEmployeeName());  
	        ps.setFloat(2,emp.getEmployeeSalary());
	        ps.setFloat(3, emp.getEmployeeExperiance());
	        ps.setString(4, emp.getEmployeeLocation());
	              
	        return ps.execute();  
	              
	    }  
	    });  
}
}
