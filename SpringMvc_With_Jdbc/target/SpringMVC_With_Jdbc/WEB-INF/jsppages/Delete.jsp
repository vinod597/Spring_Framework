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
<%
String employeeId=(String)session.getAttribute("employeeId");
//String empId=(String)session.getAttribute("empId");
if(employeeId !=null){
out.print("Employee deleted Sucessfully : " +employeeId);
}else {
   out.print("No Data");
}
%>
<div align="center">
<form action="Deleted" method="post">
    Enter Id : <input type="text" placeholder="Enter id" name="employeeId" required> <input type="submit"  value= "Delete" >
    </form>
   </div>
</body>
</html>