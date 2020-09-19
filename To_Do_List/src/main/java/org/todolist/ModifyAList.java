package org.todolist;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ModifyAList")
public class ModifyAList extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		request.setAttribute("TITLE", CreateAListObject.todo);
		RequestDispatcher rd = request.getRequestDispatcher("/DisplayList.jsp");
		rd.forward(request, response);

	}
}