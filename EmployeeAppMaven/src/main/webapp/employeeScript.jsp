<%@page import="com.employee.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<% Employee employee = (Employee) request.getAttribute("employee"); %>
    <%= "Welcome "+employee.getEmployeeName() %> <br>
    <%= "Welcome "+employee.getCity() %> <br>
    <%= "Welcome "+employee.getSalary() %> <br>
    <%= "Welcome "+employee.getEmployeeId() %> <br>
</body>
</html>