<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script type="text/javascript" src=<c:url value="/js/jquery-1.11.1.js" />></script>
<script type="text/javascript" src=<c:url value="/js/jquery-ui-1.11.1.js" />></script>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" />
<script type="text/javascript" src=<c:url value="/js/homepage.js" />></script>
<title>Insert title here</title>
</head>
<body>
<pre>

</pre>
<div align="center">
<form action="viewed" method="post">
<table><tr>
    <td>Enter Id : <input type="text" id="empId" name="employeeId" onkeydown="return isNumberKey(event)"
								onkeyup="return checkNumber()"> </td>
					<td><input type="text" id="contextpath"
								value=<%=request.getContextPath() %>></td>
						</tr>
						<tr>
							<td id="errorMsgId"><label style="color: red">
									Please Enter to Search</label></td>
						</tr>
						<tr>
						<td></td>
							<td><input type="submit" value="Search"
								onclick="return checkNumber()" /></td>	
	</table>											
    </form>
</div>
</body>
</html>