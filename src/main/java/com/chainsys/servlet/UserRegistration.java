package com.chainsys.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.chainsys.Registration.Registration;
import com.chainsys.Registration.implementRegistration;
import com.chainsys.Service.RegistrationService;

@WebServlet("/UserRegistration")
public class UserRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("Name");
		String emailid = request.getParameter("EmailId");
		String password = request.getParameter("Password");
		long contact = Long.parseLong(request.getParameter("Contact"));
		Registration reg1 = new Registration();
		RegistrationService reg2 = new RegistrationService();
		reg1.setName(name);
		reg1.setEmailId(emailid);
		reg1.setPassword(password);
		reg1.setContact(contact);
		int rows = 0;
		try {

			rows = reg2.addRegistration(reg1);
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp?res=" + rows);
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}