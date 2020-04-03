<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- String address, String city, int pincode -->
<table>
    <th>Location ID</th>
    <th>Address</th>
    <th>City</th>
    <th>Pincode</th>
<c:forEach var="c" items="${sessionScope.location_list}">
    <tr>
          <td>${c.locationId}</td>
        <td>${c.address}</td>
        <td>${c.city}</td>
        <td>${c.pincode}</td>
  		
    </tr>
    </c:forEach>
</table>
</body>
</html>