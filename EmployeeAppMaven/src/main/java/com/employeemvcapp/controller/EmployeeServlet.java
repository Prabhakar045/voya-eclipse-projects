package com.employeemvcapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.employee.model.Employee;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/employeeControllers")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String employeeName = request.getParameter("employeename");
			String city = request.getParameter("city");
			String empId = request.getParameter("employeeid");
			Integer employeeid  = Integer.parseInt(empId);
			String sal = request.getParameter("salary");
			Double salary =Double.parseDouble(sal);
			

			Employee employee= new Employee();
			employee.setCity(city);
			employee.setEmployeeId(employeeid);
			
			employee.setEmployeeName(employeeName);
			
			employee.setSalary(salary);
			
			request.setAttribute("employee", employee);
			request.setAttribute("message", "great day!");
			
			HttpSession session = request.getSession();
			session.setAttribute("message1", "welcome to exp lang");
			session.setAttribute("message2", "session scope");
			
			PrintWriter writer = response.getWriter();
			RequestDispatcher dispatcher = request.getRequestDispatcher("empexlang.jsp");
			dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
