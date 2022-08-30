package com.simplilearn.flight.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class paymentServlet
 */
@WebServlet("/paymentServlet")
public class paymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public paymentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
		float fprice = Float.parseFloat(request.getParameter("price"));
		int ntraveller = Integer.parseInt((String) session.getAttribute("ftraveller"));
		String name = request.getParameter("name");
		String to = request.getParameter("to");
		String from = request.getParameter("from");
		String time = request.getParameter("time");
		String date = request.getParameter("date");
		String price = request.getParameter("price");
		int fid = Integer.parseInt(request.getParameter("id"));
		session.setAttribute("bfname", name);
		session.setAttribute("bfto", to);
		session.setAttribute("bffrom", from);
		session.setAttribute("bfdate", date);
		session.setAttribute("bftime", time);
		float finalPay = fprice * ntraveller;
		session.setAttribute("bfpay", finalPay);
		RequestDispatcher dispatcher = request.getRequestDispatcher("payment.jsp");
		dispatcher.forward(request, response);
	}

}
