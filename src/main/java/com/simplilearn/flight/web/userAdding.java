package com.simplilearn.flight.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.simplilear.flight.model.UserDetails;
import com.simplilearn.flight.dao.FlightsDao;

/**
 * Servlet implementation class userAdding
 */
@WebServlet("/userAdding")
public class userAdding extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userAdding() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String uname = request.getParameter("uname");
		
		String usex = request.getParameter("usex");
		String uaddress = request.getParameter("uaddress");
		String uemail = request.getParameter("uemail");
		double unumber = Double.parseDouble(request.getParameter("umobno"));
		String upassword = request.getParameter("upassword");
		UserDetails fuser = new UserDetails(uname, uemail, unumber, usex, uaddress, upassword);
		FlightsDao udao = new FlightsDao();
		session.getAttribute("flightlist");
		udao.saveUser(fuser);
		if(session!=null) {
			
			session.setAttribute("fuser", fuser);
			
			
		}
		response.sendRedirect("flightsAvailable.jsp");
	}

}
