<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="errorHandler.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
	<%
	out.println("Student details: <br>");
	
	String employeeName = (String)request.getAttribute("employeeName");
	String city = (String)request.getAttribute("city");
	Double salary = (Double)request.getAttribute("salary");
	String course = (String)request.getAttribute("course");
	Long mobile = (Long)request.getAttribute("phone");
	String[] hobbies = (String[])request.getAttribute("hobbies");
	
	out.println("name: "+employeeName +"<br>");
	out.println("city: "+city  +"<br>");
	out.println("salary: "+salary  +"<br>");
	out.println("course: "+course  +"<br>");
	out.println("mobile: "+mobile  +"<br>");
	
	if(hobbies != null){
		for(String hobby:hobbies ) {
			out.print("hobbies: " + hobby.toUpperCase() +"<br>");
		}
	}
	
	
	%>
</body>
</html>