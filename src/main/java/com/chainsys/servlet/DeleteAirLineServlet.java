package com.chainsys.servlet;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.AIRLINEINFO.airlineinfo;
import com.chainsys.AIRLINEINFO.implementairlineinfo;


@WebServlet("/DeleteAirLineServlet")
public class DeleteAirLineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String airlineId=request.getParameter("AirlineId");
		implementairlineinfo im=new implementairlineinfo();
		airlineinfo a=new airlineinfo();
		a.setAirlineid(airlineId);
		int rowss=0;
		try {
			rowss=im.deleteairlineinfo(a);
			RequestDispatcher dispatcher =request.getRequestDispatcher("Admin_index.jsp?rest="+rowss);
			dispatcher.forward(request,response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



}
