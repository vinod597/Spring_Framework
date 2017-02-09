<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<jsp:include page="Home.jsp"></jsp:include>
</head>

<!--Step:9 -it recieves a req from modular by using InternalResolver.
           - when submitting it will forward the response to homecontroller by mapping @RequestMapping url -->
<body bgcolor="pink">
<form action="registered" method="post" >
<h1 align="center">Welcome to <b style="color:blue" >R</b>egistration</h1>
<p align="center"><b>Marked with <b style="color:red" >*</b> are mandatory</b></p>
<table align="center">
<tr>
<th>id:<sup style="color:red">*</sup><td><input type="text" name="employeeId"></td></th>
</tr>
<tr>
<th>Name:<sup style="color:red">*</sup><td><input type="text" name="employeeName"></td></th>
</tr>
<tr>
<th>Salary:<sup style="color:red">*</sup><td><input type="text" name="employeeSalary"></td></th>
</tr>
<tr>
<th>Experiance:<sup style="color:red">*</sup><td><input type="text" name="employeeExperiance"></td></th>
</tr>
<tr>
<th>Location:<sup style="color:red">*</sup><td><input type="text" name="employeeLocation"></td></th>
</tr>
<tr>
		<td align="right"><input type="submit" value="Submit" ></td>
        </tr>
</table>
</form>

</body>
</html>