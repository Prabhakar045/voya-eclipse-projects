package com.voya.doctorapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.voya.doctorapp.exception.IdNotFoundException;
import com.voya.doctorapp.model.Doctor;
import com.voya.doctorapp.service.DoctorServiceImpl;
import com.voya.doctorapp.service.IDoctorService;

/**
 * Servlet implementation class EditServlet
 */
public class EditServlet extends HttpServlet {
	
	
	//creating object
		IDoctorService doctorService = new DoctorServiceImpl();
		
		
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String doctorId = request.getParameter("doctorid");
		int doctorid = Integer.parseInt(doctorId);
//        
//        Doctor doctor = new Doctor();
//        doctor.setDoctorId(doctorid);
        
        try {
			Doctor doctor1=  doctorService.getById(doctorid);
			request.setAttribute("doctor1", doctor1);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("updateDoctor.jsp");
	        dispatcher.forward(request, response);
		} catch (IdNotFoundException e) {
			
			e.printStackTrace();
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
