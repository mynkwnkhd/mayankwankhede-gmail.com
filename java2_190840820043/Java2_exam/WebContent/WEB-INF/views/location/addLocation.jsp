<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- String address, String city, int pincode -->
<table>
		<form  action="" method="POST">
			<tr>
				<td>Enter Address</td>
				<td><input type="text" name="addr"></td>
			</tr>
			<tr>
				<td>Enter City</td>
				<td><input type="text" name="city"></td>
			</tr>
			<tr>
				<td>Enter pincode</td>
				<td><input type="number" name="pin"></td>
			</tr>
			<tr>
				<td><button type="submit">Add</button></td>
			</tr>
		</form>
	</table>
</body>
</html>