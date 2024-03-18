<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="errorHandler.jsp"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to JS</h1>
	<%
	
		String name = "Prabhakar"; 
		out.println(name);
	%>
	<% int x=10; int y=20; %>
	<% out.println("<br>  sum: "+ (x+y)); %>
	<%= "<br>  sum: "+(x+y) %>
	
	<% int counter=0; %>
	you are visitor no: <%= counter %>
	<br>
	<%! String greet(){
		return "welcome back";
	} 
	
	%>
	<%= greet() %>
	

	
	<%
		pageContext.setAttribute("message", "welcome");
		request.setAttribute("message", "good day in request");
		session.setAttribute("message", "good day in session");
		application.setAttribute("message", "good day in appl");
	
	
	%>
	<%
	
		String msg1= (String)request.getAttribute("message");   //HttpServlet
	%>
	
	<% 	
		${message}
		${requestScope.message}
		${sessionScope.message}
		${applicationScope.message}
	%>
</body>
</html>