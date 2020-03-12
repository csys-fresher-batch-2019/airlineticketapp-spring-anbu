package com.chainsys.servlet;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.Service.adminloginService;
import com.chainsys.adminlogin.implementadminlogin;

@WebServlet("/Adminlogin")
public class Adminlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				String email=request.getParameter("Username");
		String password=request.getParameter("Password");
        adminloginService alog=new adminloginService();
        	try {
				int returned=alog.admin(email, password);
				System.out.println("value retunred:"+returned);
				if(returned==1)
				{
					RequestDispatcher dispatcher =request.getRequestDispatcher("Admin_index.jsp");
					dispatcher.forward(request,response);
				}
				else {
					RequestDispatcher dispatcher =request.getRequestDispatcher("adminlogin.jsp");
					dispatcher.forward(request,response);
				
					
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        
	}



}
