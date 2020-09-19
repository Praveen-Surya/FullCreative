<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="org.todolist.Todo"%>
<%@ page import="org.todolist.CreateAList"%>
<%@ page import="org.todolist.CreateAListObject"%>
<%@ page import="java.util.UUID"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modify A List</title>
</head>
<body>
	<h1>Update A List</h1>


	<form action="/Edit" method="post">

		<%
			String id = request.getParameter("id");
		%>



		<input type="hidden" name="id" value="<%=request.getParameter("id")%>">
		<table>

			<tr>
				<td>Content:</td>
				<td><input type="text" name="content"></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="save"></td>
			</tr>

		</table>
	</form>
</body>
</html>