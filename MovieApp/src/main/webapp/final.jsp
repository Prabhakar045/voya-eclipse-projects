<%@ page import="java.util.List" %>
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
	
	       List<String> movies = (List<String>)request.getAttribute("movies");
         
		    for(String moviesList:movies){
		           out.println("Movies: "+moviesList);
		    }
         
		    out.println("session id: "+session.getId() +"<br>");
			out.println("session id: "+session.getMaxInactiveInterval() +"<br>");
			out.println("session id: "+session.getCreationTime()+"<br>");
			
     
	%>
</body>
</html>