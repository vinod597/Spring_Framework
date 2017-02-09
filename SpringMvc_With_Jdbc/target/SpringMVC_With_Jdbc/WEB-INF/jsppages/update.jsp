<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.Iterator"%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.dhatriinfo.bean.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dhatriinfo.dao.EmployeeDaoOld"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<jsp:include page="Home.jsp"></jsp:include>
</head>
<h1></h1>
<div align="center">
<form action="updatesearch" method="post">
<tr><td>Enter Id </td><td align="center"><input type="text" name="employeeId"></td></tr>
<tr><td align="right"><input type="submit" value="Fetch" ></td></tr>
</form>
</div>
<body bgcolor="cyan">	

<%
Object obj=request.getAttribute("searchlist");

if(obj!=null)
{
	%>
	<form action="updatesearch" method="post">
	<% 
	ArrayList<Employee> emplist= (ArrayList)obj;
	
		Iterator<Employee> iteratore=emplist.iterator();
		Employee empBean=null;
		
		 while(iteratore.hasNext())
		 {
	         
			 empBean=(Employee)iteratore.next();
			 System.out.println("out put is"+empBean.getEmployeeExperiance()+"and"+empBean.getEmployeeLocation());
			%>

<table align="center" cellspacing="0" cellpadding="8" borders="1" width="40%">
<tr><td colspan="2" align="center"><h2>Update Employee Details</h2></td></tr>
<tr>
<th>Id:<td><input type="text" name="employeeId" value=<%=empBean.getEmployeeId()%> readonly></td></th></tr>
<tr>
<th>Name:<sup style="color:red">*</sup><td><input type="text" name="employeeName" value=<%=empBean.getEmployeeName() %>></td></th>
</tr>
<tr>
<th>Salary:<sup style="color:red">*</sup><td><input type="text" name="employeeSalary" value=<%=empBean.getEmployeeSalary() %>></td></th>
</tr>
<tr>
<th>Experiance:<sup style="color:red">*</sup><td><input type="text" name="employeeExperiance" value=<%=empBean.getEmployeeExperiance() %>></td></th>
</tr>
<tr>
<th>Location:<sup style="color:red">*</sup><td><input type="text" name="employeeLocation"value=<%=empBean.getEmployeeLocation() %>></td></th>
</tr>
<tr>
		<td align="right"><input type="submit" value="Submit" ></td>
        </tr>
</table>
</form>
			
			<%
		}
		
	}
	

%>

</body>
</html>