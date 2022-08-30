package com.simplilearn.flight.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplilear.flight.model.AdminDetails;
import com.simplilear.flight.model.Flight_Details;
import com.simplilearn.flight.dao.FlightsDao;

/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("aname");
        String password = request.getParameter("apassword");
        System.out.println("password:"+password);
        System.out.println("name:"+name);
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        FlightsDao flightsDao = new FlightsDao();
        RequestDispatcher dispatcher = null;
        if(flightsDao.adminValidate(name, password)) {
        	dispatcher = request.getRequestDispatcher("AdminAdd.jsp");
        	dispatcher.forward(request, response);
        }else {
        	dispatcher = request.getRequestDispatcher("AdminPage.jsp");
        	dispatcher.include(request, response);
        	out.print("<center> Invalid Credential</center>");
        }
        
        
	}

}
