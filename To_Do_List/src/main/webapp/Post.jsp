<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create a List</title>
</head>
<body>
	<form action="CreateANewList" method="post">
<table>
<tr><td>Title:</td><td><input type="text" name="title"></td></tr>
<tr><td>Date:</td><td><input type="text" name="date"></td></tr>
<tr><td>Time:</td><td><input type="text" name="time"></td></tr>
<tr><td>Venue:</td><td><input type="text" name="venue"></td></tr>
<tr><td>Topic:</td><td><input type="text" name="topic"></td></tr>
<tr><td>Speaker:</td><td><input type="text" name="speaker"></td></tr>
<tr><td></td><td><input type="submit" value="save"></td></tr>
</table>
</form>
</body>
</html>