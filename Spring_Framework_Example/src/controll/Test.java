package controll;

import java.sql.ResultSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmployeeDao;
import dao.EmployeePreparedDao;
import dao.EmployeeResult;
import bean.*;

public class Test {
	public static void main(String[] args) {  
		Scanner scanner=new Scanner(System.in);
	    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContect.xml");  
	    // simple JDBCTemplate example  
	    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
	    // for insertion
	      
	    System.out.println("Enter the No. Of Employees to insert");
	    int no_ofRecords=scanner.nextInt();
	    for(int i=1;i<=no_ofRecords;i++)
	    {
	    	System.out.println("Enter " + i +" Record");
	    EmployeeBean empbean=new EmployeeBean();
	    System.out.println("Enter The Id");
	    empbean.setId(scanner.nextInt());
	    System.out.println("enter the employee name");
	    empbean.setName(scanner.next());
	    System.out.println("Enter the salary");
	    empbean.setSalary(scanner.nextFloat());
	    int status=dao.saveEmployee(empbean); 
	    System.out.println(status + " inserted");  
	    }
	    
	    // for update
	   /* System.out.println("Enter the No. Of Employees to Update");
	    int no_ofRecords_update=scanner.nextInt();
	    for(int i=1;i<=no_ofRecords_update;i++)
	    {
	    	System.out.println("Enter " + i +" Record");
	    EmployeeBean empbean=new EmployeeBean();
	    System.out.println("Enter The Id to update details");
	    empbean.setId(scanner.nextInt());
	    System.out.println("enter the employee name");
	    empbean.setName(scanner.next());
	    System.out.println("Enter the salary");
	    empbean.setSalary(scanner.nextFloat());
	    int status=dao.updateEmployeeBean(empbean); 
	    if(status==1)
	    {
	    System.out.println(status + " Updated");  
	    }
	    else
	    {
	    	System.out.println(empbean.getId() + " Id is invalid");
	    }
	    }*/
	    
	    //Delete Example
	   /* EmployeeBean empbean=new EmployeeBean();
	    System.out.println("Enter the id you want to delete");
	    empbean.setId(scanner.nextInt()); 
	    int status=dao.deleteEmployeeBean(empbean); 
	    if(status==1)
	    {
	    	System.out.println(status+ " Record Deleted");
	    }
	    else
	    {
	    System.out.println(empbean.getId()+ " Id is Invalid");
	    }*/
	    
	    //Delete All
	    /*int status=dao.deleteAllEmployeeBean();
	    System.out.println(status);*/
	    
	    
	    // preparedstatement example
	    
	   /* EmployeePreparedDao pdao=(EmployeePreparedDao)ctx.getBean("edao1");  
	    EmployeeBean bean=new EmployeeBean();
	    bean.setId(1990);
	    bean.setName("Narsingh");
	    bean.setSalary(30000);
	    pdao.saveEmployeeByPreparedStatement(bean); */
	    
	    // ResultSet Example
	    
	    /*EmployeeResult rdao=(EmployeeResult)ctx.getBean("edao2");  
	    List<EmployeeBean> list=rdao.getAllEmployees();  
	          
	    for(EmployeeBean e:list)  
	        System.out.println(e.getId()+ "\t "+e.getName()+ "\t "+e.getSalary());  
	    */
	}

}
