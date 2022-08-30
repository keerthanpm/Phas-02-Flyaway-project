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
import com.simplilearn.flight.dao.FlightsDao;

/**
 * Servlet implementation class UpdatePassword
 */
@WebServlet("/UpdatePassword")
public class UpdatePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = 1;
        String name = "admin";
        String password = request.getParameter("apassword");
        PrintWriter out = response.getWriter();
        
        FlightsDao fdao = new FlightsDao();
        AdminDetails adminde = new AdminDetails(id,name,password);
		fdao.updateAdminPassword(adminde);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("ForgotPassword.jsp");
		
		dispatcher.include(request, response);
		out.print("<center> Updated password successfully</center><br><br>");
		out.print("<center><a href=AdminPage.jsp> click here to Login as Admin</a></center><br>");
	}

}
