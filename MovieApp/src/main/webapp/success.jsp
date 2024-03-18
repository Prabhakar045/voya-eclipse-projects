<%@page import="com.movieapp.service.MovieDetails"%>
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
	
	out.println("session id: "+session.getId() +"<br>");
	out.println("session id: "+session.getMaxInactiveInterval() +"<br>");
	out.println("session id: "+session.getCreationTime()+"<br>");
	
	String username = (String)request.getAttribute("username");

	
	if(username!=null){
		out.println("login successfull for user:  "+username );
	}
	
	%>
	
	<form action="movieServlet">
            
            Language: 
            <select name="category">
                <option value="kannada">kannada</option>
                <option value="english">english</option>
                <option value="hindi">hindi</option>
                <option value="marathi">marathi</option>
                <input type="submit" value="submit">
            </select>

         </form>
         
         
</body>
</html>