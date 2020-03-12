package com.chainsys.servlet;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.AIRLINEINFO.airlineinfo;
import com.chainsys.AIRLINEINFO.implementairlineinfo;
import com.chainsys.AIRLINEINFO.interfaceairlineinfo;
import com.chainsys.Service.AddAirlineServletService;

@WebServlet("/AddAirlineServlet")
public class AddAirlineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    		AddAirlineServletService dao = new AddAirlineServletService();
		airlineinfo a = new airlineinfo();
		a.setAirlineid(request.getParameter("AirlineId"));
		a.setAirlinename(request.getParameter("Airlinename"));
		a.setFromto(request.getParameter("from"));
		String totSeats = request.getParameter("seats");
		a.setTotalseats(Integer.parseInt(totSeats));
		String noSeats = request.getParameter("seatsavail");
		a.setNoofseatsavailable(Integer.parseInt(noSeats));
		String date = request.getParameter("date1");
		a.setJourneydate(LocalDate.parse(date));
		String price = request.getParameter("price");
		a.setPrice(Integer.parseInt(price));
		int rows=0;
		try {
			rows=dao.addairlineinfo(a);
			response.sendRedirect("Admin_index.jsp?res="+rows);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
    	}

    		
}
