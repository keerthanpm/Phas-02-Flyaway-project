package com.simplilearn.flight.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.simplilear.flight.model.BookingInfo;
import com.simplilear.flight.model.UserDetails;
import com.simplilearn.flight.dao.FlightsDao;

/**
 * Servlet implementation class BookingAdd
 */
@WebServlet("/BookingAdd")
public class BookingAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
		float bprice =  (float) session.getAttribute("bfpay");
		String btraveller =  (String) session.getAttribute("ftraveller");
		UserDetails user = (UserDetails) session.getAttribute("fuser");
		BookingInfo book = new BookingInfo(btraveller,bprice, user );
		 FlightsDao flightsDao = new FlightsDao();
		 flightsDao.saveBooking(book);
		 response.sendRedirect("BookingDetails.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
