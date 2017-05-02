<%@page import="java.util.Iterator"%>
<%@page import="com.dhatriinfo.bean.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<jsp:include page="Home.jsp"></jsp:include>
</head>
<body>
<pre>

</pre>
<div align="center">
<form action="viewed" method="post">
    Enter Id : <input type="text" placeholder="Enter id" name="employeeId" required> <input type="submit"  value= "Search" >
    </form>
</div>
<pre>

</pre>
<div align="center">




<%
Object obj=request.getAttribute("employeeList");

if(obj!=null)
{
	%>
	<table>
<tr>
<th>EmployeeId</th>
<th>EmployeeName</th>
<th>EmployeeSalary</th>
<th>EmployeeLocation</th>
<th>EmployeeExp</th>
</tr>
	<%
	ArrayList<Employee> employeeList=(ArrayList)obj;
	Iterator iterator=employeeList.iterator();
	Employee empbean=null;
	while(iterator.hasNext())
	{
		empbean=(Employee)iterator.next();
		%>
		<tr>
<td> <%=empbean.getEmployeeId() %> </td>	
<td> <%=empbean.getEmployeeName() %>	</td>
<td> <%=empbean.getEmployeeSalary() %></td>
<td><%=empbean.getEmployeeExperiance() %></td>
<td><%=empbean.getEmployeeLocation() %></td>

		
		</tr>
		
	<%	
	}
	session.removeAttribute("employeeList");
	
}

%>
</table>

</div>


</body>
</html>