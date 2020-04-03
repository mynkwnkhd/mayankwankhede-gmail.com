<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<form method="POST">
			<tr>
				<td>Enter Company Name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Enter Company Description</td>
				<td><input type="text" name="desc"></td>
			</tr>
			<tr>
				<td>Enter Company Year</td>
				<td><input type="number" name="year"></td>
			</tr>
			<tr>
				<td><button type="submit">Add</button></td>
			</tr>
		</form>
	</table>
</body>
</html>