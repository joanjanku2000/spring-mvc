<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
	<p> Result = <%= request.getAttribute("result") %> </p>
	
	<p> Prodhimi = ${product} </p>
</body>
</html>