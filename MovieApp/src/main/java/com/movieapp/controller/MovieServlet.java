package com.movieapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.movieapp.service.MovieDetails;

/**
 * Servlet implementation class MovieServlet
 */

@WebServlet("/movieServlet")
public class MovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MovieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session =  request.getSession();
		PrintWriter writer = response.getWriter();
		writer.print(session.getId()+"<br>");
		writer.print(session.getCreationTime()+"<br>");
		writer.print(session.getMaxInactiveInterval()+"<br>");
		
		String langauge = request.getParameter("language");
		MovieDetails moviesList = new MovieDetails();
		List<String> movies = moviesList.showMovies(langauge);
		request.setAttribute("movies", movies);
		RequestDispatcher dispatcher = request.getRequestDispatcher("final.jsp");
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
