package org.todolist;

import java.io.IOException;
import java.util.UUID;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CreateAList")

public class CreateAList extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		RequestDispatcher rd = request.getRequestDispatcher("/Post.jsp");
		rd.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String content = request.getParameter("content");

		Todo ref = new Todo();
		ref.setContent(content);

		UUID uuid = UUID.randomUUID();
		String uuidNumber = uuid.toString();
		ref.setId(uuidNumber);

		CreateAListObject createAListObject = CreateAListObject.getInstance();
		CreateAListObject.addTodo(ref);

		request.setAttribute("TITLE", CreateAListObject.todo);
		RequestDispatcher rd = request.getRequestDispatcher("/Result.jsp");
		rd.forward(request, response);

	}
}
