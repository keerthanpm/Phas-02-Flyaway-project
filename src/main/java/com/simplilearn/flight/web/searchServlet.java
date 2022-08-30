package com.simplilearn.flight.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.simplilear.flight.model.Flight_Details;
import com.simplilearn.flight.dao.FlightsDao;

/**
 * Servlet implementation class searchServlet
 */
@WebServlet("/searchServlet")
public class searchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String from = request.getParameter("ffrom");
		String to = request.getParameter("fto");
		String date = request.getParameter("fdate");
		String ntraveller = request.getParameter("ftraveller");
		session.setAttribute("ftraveller", ntraveller);
		
		 FlightsDao flightsDao = new FlightsDao();
		List<Flight_Details> flightlist = flightsDao.getSerachedFlights(from, to, date);
		session.setAttribute("flightlist", flightlist);
		System.out.println(flightlist);
	response.sendRedirect("userDetails.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
