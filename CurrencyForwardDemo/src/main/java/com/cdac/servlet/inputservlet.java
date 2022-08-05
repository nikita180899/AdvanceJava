package com.cdac.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getdata")

public class inputservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String choice = request.getParameter("radCurrency");
		String pageUrl = "";
		
		switch(choice) {
			case "d":
					pageUrl = "dollarservlet";
					break;
			case "p":
					pageUrl = "poundservlet";
					break;		
		}
		
		//server side redirection
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher(pageUrl);
		dispatcher.forward(request, response);
	
	}

}
