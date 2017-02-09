package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException; 
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import bean.EmployeeBean;

public class EmployeeResult {
	private JdbcTemplate jdbcTemplate;  
	  
	
	  
		public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	public List<EmployeeBean> getAllEmployees(){ 
		String query="select * from employee";
	 return jdbcTemplate.query(query,new ResultSetExtractor<List<EmployeeBean>>(){  
	    @Override  
	     public List<EmployeeBean> extractData(ResultSet rs) throws SQLException,  
	            DataAccessException {  
	      
	        List<EmployeeBean> list=new ArrayList<EmployeeBean>();  
	        while(rs.next()){  
	        	EmployeeBean e=new EmployeeBean();  
	        e.setId(rs.getInt(1));  
	        e.setName(rs.getString(2));  
	        e.setSalary(rs.getInt(3));  
	        list.add(e);  
	        }  
	        return list;  
	        }  
	    });  
	  }  
}
