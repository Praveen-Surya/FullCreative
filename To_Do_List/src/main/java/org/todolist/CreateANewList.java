package org.todolist;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CreateANewList")

public class CreateANewList extends HttpServlet {
	
	
	
	@Override
	  protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	      throws IOException,ServletException {
		
		ArrayList ar = new ArrayList();

		StringBuffer title = new StringBuffer(request.getParameter("title"));
		int date = Integer.parseInt(request.getParameter("date"));
		int time = Integer.parseInt(request.getParameter("time"));
		StringBuffer venue = new StringBuffer(request.getParameter("venue"));
		StringBuffer topic =new StringBuffer( request.getParameter("topic"));         
		StringBuffer speaker = new StringBuffer(request.getParameter("speaker")); 
		
		
		ar.add(title);
		ar.add(date);
		ar.add(time);
		ar.add(venue);
		ar.add(topic);
		ar.add(speaker);
		//RequestDispatcher rd= request.getRequestDispatcher("index.html");
		//rd.forward(request, response);
		//response.getWriter().print(ar);
        response.sendRedirect("Result.html");
		//response.getWriter().print("Successfully Added to the List");
		
	}  
}
