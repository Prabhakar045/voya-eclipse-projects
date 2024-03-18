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

    
    welcome ${employee.employeeName }
    city: ${employee.city }
    salary: ${employee.salary }
    id: ${employee.employeeId }
    
    <br>
    
    ${ message } <br>
     ${ message1 } <br>
      ${ message2 }
</body>
</html>