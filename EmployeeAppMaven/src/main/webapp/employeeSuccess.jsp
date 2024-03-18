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
       
       		Employee employee = (Employee) request.getAttribute("employee");
       
       		String employeeName =employee.getEmployeeName();
            out.println(employeeName);
            String city =(String) request.getAttribute("city");
            out.println(city);
            String employeeId =(String) request.getAttribute("employeeid");
            out.println(employeeId);
            String salary =(String) request.getAttribute("salary");
            out.println(salary);
            
       
       
       %>
</body>
</html>