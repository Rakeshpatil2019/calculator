package com.practise;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class one extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int num1= Integer.parseInt(request.getParameter("num1"));
		
		int num2=Integer.parseInt(request.getParameter("num2"));
		
		int result=num1+num2;
		
//		out.print(result);
		
		request.setAttribute("result", result);
		
		if(result>0)
		{
			RequestDispatcher rd=request.getRequestDispatcher("sss");
			rd.forward(request, response);
		}
		else
		{
			out.print("Please Enter the number greater than Zero");
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.forward(request, response);
		}
		
		out.close();
		
		
		
		
		
		
		
	}

}
