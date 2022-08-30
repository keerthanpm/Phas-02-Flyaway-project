package com.simplilearn.flight.web;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplilear.flight.model.Flight_Details;
import com.simplilearn.flight.dao.FlightsDao;

/**
 * Servlet implementation class FlightListServlet
 */
@WebServlet("/flightlist")
public class FlightListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  public FlightListServlet() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String from = request.getParameter("ffrom");
		String to = request.getParameter("fto");
		String d = request.getParameter("fdate");
		
		 FlightsDao flightsDao = new FlightsDao();
		List<Flight_Details> flightlist = flightsDao.getAllFlights();
		
		//request.setAttribute("flightslist",flightlist);
		System.out.println(flightlist);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("flightsAvailable.jsp");
		dispatcher.forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
