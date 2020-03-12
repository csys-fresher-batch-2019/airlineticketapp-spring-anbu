package com.chainsys.servlet;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.Service.PassengerService;
import com.chainsys.passenger.implementpassenger;
import com.chainsys.passenger.interfacepassenger;
import com.chainsys.passenger.passenger;

@WebServlet("/PassengerServlet")
public class PassengerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PassengerService dao=new PassengerService();
		
		passenger p = new passenger();
		p.setFname(request.getParameter("fname"));
		p.setLname(request.getParameter("lname"));
		p.setMailid(request.getParameter("Mailid"));
		p.setAddress(request.getParameter("Address"));
		String phone = request.getParameter("Phone");
		p.setPhone(Long.parseLong(phone));
		String age = request.getParameter("Age");
		p.setAge(Integer.parseInt(age));
		p.setGender(request.getParameter("Gender"));
		p.setClassing(request.getParameter("Classing"));
		String NoTickets = request.getParameter("NoofBookings");
		p.setNoofbookings(Integer.parseInt(NoTickets));
		p.setAirlineid(request.getParameter("AirlineId"));
		int pass=0;
		try {
			pass=dao.addpassenger(p);
			request.setAttribute("result",pass);
			RequestDispatcher dispatcher =request.getRequestDispatcher("listAirlines.jsp?result"+pass);
			dispatcher.forward(request,response);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		}

}
