<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>First Servlet Page</title>
</head>
<body>
	<font color="red">${errorMessage}</font>
	<br /> Yahoo!!!! name = ${name} && Password = ${password}
	<form action="/login.do" method="post">
		Name : <input type="text" name="name" /><br /> Password : <input
			type="text" name="password" /><br /> <input type="submit"
			name="submit"><br />
	</form>

</body>
</html>