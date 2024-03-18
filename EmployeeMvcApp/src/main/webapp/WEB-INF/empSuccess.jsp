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

<%
  Employee employee =(Employee) request.getAttribute("employee");
  
	String name = employee.getEmployeeName();
	out.println("welcome "+name +"<br>");
	String city = employee.getCity();
	out.println("city "+city +"<br>");
	
	Integer employeeId = employee.getEmployeeId();
	out.println("employeeId "+employeeId +"<br>");
	
  

%>
</body>
</html>