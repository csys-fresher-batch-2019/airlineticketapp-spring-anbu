package com.chainsys.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.Registration.implementRegistration;
import com.chainsys.Service.userloginService;
import com.chainsys.login.implementationLogin;
@WebServlet("/userlogin")
public class userlogin extends HttpServlet
{
private static final long serialVersionUID = 1L;
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String email=request.getParameter("EmailId");
	String password=request.getParameter("Password");
	System.out.println(email);
	System.out.println(password);

	userloginService ur=new userloginService();
		try {
			if( ur.userLogin(email, password)) {
				HttpSession session = request.getSession();
				session.setAttribute("value", email);
				RequestDispatcher rd=request.getRequestDispatcher("listAirlines.jsp");
				rd.forward(request, response);
			}else {
				response.sendRedirect("UserLogin.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("UserLogin.jsp");
		}
}
}