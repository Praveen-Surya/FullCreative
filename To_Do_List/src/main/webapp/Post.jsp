<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create a List</title>
</head>
<body>
	<form action="/CreateAList" method="post">
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