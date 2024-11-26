<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1 style="text-align: center">Hello, ${loginuser.fullName }</h1>
	<div style="text-align: center">
		<a href="logout">Logout</a>
	</div>
</body>
</html>