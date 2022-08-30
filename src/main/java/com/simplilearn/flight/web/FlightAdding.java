package com.simplilearn.flight.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplilear.flight.model.Flight_Details;
import com.simplilearn.flight.dao.FlightsDao;

/**
 * Servlet implementation class FlightAdding
 */
@WebServlet("/flightadd")
public class FlightAdding extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    /**
     * @see HttpServlet#HttpServlet()
     */   
    public FlightAdding() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("fname");
        String from = request.getParameter("ffrom");
        String to = request.getParameter("fto");
        String date = request.getParameter("fdate");
        float price = Float.parseFloat(request.getParameter("fprice"));
        String time = request.getParameter("ftime");
        Flight_Details flight = new Flight_Details(name, from, to, price, date, time);
        FlightsDao flightsDao = new FlightsDao();
        flightsDao.saveFlight(flight);
       response.sendRedirect("AdminAdd.jsp");
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
