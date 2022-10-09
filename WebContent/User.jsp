<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Information</title>
</head>
<body>
	<form method="post" action="TimeServlet">
		<table>
			<tr>
				<td>Name of User: </td>
				<td><input type="text" name="un" value="Name"> <em>ex: Joshua Maralit</em></td>
			</tr>
			<tr>
				<td>Section: </td>
				<td><input type="text" name="sect" value="Section"> <em>ex: 2ITC</em></td>
			</tr>
			<tr>
				<td>Date Submitted: </td>
				<td><input type="text" name="date" value="Date"> <em>ex: 11/19/19</em></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit Work"></td>
			</tr>
		</table>
	</form>
</body>
</html>