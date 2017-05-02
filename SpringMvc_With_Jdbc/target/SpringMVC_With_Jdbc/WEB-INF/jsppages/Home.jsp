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
</head>
<body>
<form>
<h1></h1>
<br>
<div align="center">
<!-- <h1 style="color:blue">Welcome to Dhatri Info Solutions</h1> -->
</div>
<br>
<h2 align="center">
<!-- Step:4 -Receives a request from intial controller -->
<!-- Step:5 - registration request will go to modular controller by matching @requestmapping url in the method --> 
<a href="registration" >Add Employee</a> |
<a href="Delete" >Delete</a> |
<a href="update">Update</a>  |
<a href="Search" >Search</a>
<div>
<pre>
</pre>
<%
Object obj=request.getAttribute("display");
if(obj!=null)
{
String emp=(String)obj;
out.println(emp);
}/* if{
	request.removeAttribute("display");
} */
%>
</div>
</h2>
<!-- <div align="center">
<iframe style="border:none;" name="about" align="middle" width="1000" height="1000"></iframe>
<iframe style="border:none;" name="about" align="middle" width="1000" height="1000"></iframe>
</div> -->
</form>
</body>
</html>