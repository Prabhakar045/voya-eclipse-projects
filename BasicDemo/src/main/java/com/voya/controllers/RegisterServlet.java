package com.voya.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String employeeName = request.getParameter("employeename");
		String city = request.getParameter("city");
		String sal = request.getParameter("salary");
		double salary =Double.parseDouble(sal);
		String mobile = request.getParameter("mobile");
		Long phone = Long.parseLong(mobile);
		String course = request.getParameter("course");
		String[] hobbies = request.getParameterValues("hobbies");
		
		
		PrintWriter writer = response.getWriter();
		
		
		writer.println("welcome "+ employeeName +"<br>");
		writer.println("employee name: "+employeeName);
		writer.println("city: "+city );
		writer.println("salary: "+salary );
		writer.println("mobile: "+phone );
		writer.println("course: "+course );
		
		for(String hobby:hobbies ) {
			writer.print("hobbies: " + hobby );
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
