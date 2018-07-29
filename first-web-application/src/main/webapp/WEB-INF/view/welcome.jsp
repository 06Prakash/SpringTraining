<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
	<div>
		<font color="red">${errorMessage}</font>
	</div>
	<div>Welcome Hi <font color="red">${name}</font> your password is <font color="red">${password}</font></div>
</body>
</html>