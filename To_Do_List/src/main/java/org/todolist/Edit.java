package org.todolist;

import java.io.IOException;
import java.util.ConcurrentModificationException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Edit")

public class Edit extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		RequestDispatcher rd = request.getRequestDispatcher("/Put.jsp");
		rd.forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String content = request.getParameter("content");
		String id = request.getParameter("id");

		UpdateAList updateAList = new UpdateAList();
		try {
			updateAList.modify(content, id);
		} catch (ConcurrentModificationException e) {
			System.out.println("Exception Handled");
		}

		request.setAttribute("TITLE", CreateAListObject.todo);
		RequestDispatcher rd = request.getRequestDispatcher("/Result.jsp");
		rd.forward(request, response);

	}

}
