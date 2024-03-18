<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
	<% List<String> fruits=Arrays.asList("apple","guava","mango");
		session.setAttribute("fruitsList", fruits);
	
	%>
	
	<h1>Using EL</h1>
	 ${fruitsList } <br>
	 
	 <h2>Using c:foreach</h2>
	 <c:forEach items="${fruitsList}" var="fruit" step"2">
	 	${fruit} <br>
	 </c:forEach>
</body>
</html>