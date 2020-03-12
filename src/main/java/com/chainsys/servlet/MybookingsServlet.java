package com.chainsys.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.passenger.implementpassenger;
import com.chainsys.passenger.passenger;

@WebServlet("/MybookingsServlet")
public class MybookingsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public MybookingsServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		implementpassenger pass=new implementpassenger();
		try {
			HttpSession session = request.getSession();
			String mailid=(String)session.getAttribute("value");
			System.out.println("EmailId ="+ mailid );
			List<passenger> list=pass.findbymail(mailid);
			System.out.println(list);
			session.setAttribute("List", list);
			RequestDispatcher dispatcher=request.getRequestDispatcher("MyBookings.jsp");
			dispatcher.forward(request, response);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();

		}
		
	}

	
	

}
