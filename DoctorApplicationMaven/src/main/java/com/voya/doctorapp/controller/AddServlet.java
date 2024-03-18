package com.voya.doctorapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.voya.doctorapp.model.Doctor;
import com.voya.doctorapp.service.DoctorServiceImpl;
import com.voya.doctorapp.service.IDoctorService;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {
	//creating object
	IDoctorService doctorService = new DoctorServiceImpl();
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String doctorname = request.getParameter("doctorname");
		String speciality = request.getParameter("speciality");
		double fees = Double.parseDouble(request.getParameter("fees"));
		int ratings = Integer.parseInt(request.getParameter("ratings"));
		int experience = Integer.parseInt(request.getParameter("experience"));
		
		Doctor doctor = new Doctor();
		doctor.setDoctorName(doctorname);
		doctor.setSpeciality(speciality);
		doctor.setFees(fees);
		doctor.setRatings(ratings);
		doctor.setExperience(experience);
		
		doctorService.addDoctor(doctor);
		
//		request.setAttribute("doctorname", doctorname);
        RequestDispatcher dispatcher = request.getRequestDispatcher("addDoctor.jsp");
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
