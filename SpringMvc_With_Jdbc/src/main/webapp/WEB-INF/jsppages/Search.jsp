<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<spring:url value="/js/jquery-1.11.1.js" var="jqueryJs" />
<spring:url value="/js/homepage.js" var="homejs" />
<script type="text/javascript" src="${jqueryJs}"></script>

<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.2.js"> </script>
 <script type="text/javascript" src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"> </script>
<script type="text/javascript" src="${homejs}">

</script>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" />

<title>Insert title here</title>
</head>
<body>
<pre>

</pre>
<div align="center">
<form action="viewed" method="post">
    Enter Id : <td><input type="text" id="employeeId" name="employeeId" onkeydown="return isNumberKey(event)"
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
    </form>
</div>
</body>
</html>