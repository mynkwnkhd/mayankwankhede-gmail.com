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
<!-- String cname, String cdescription, int estYear -->
<table>
    <th>Company ID</th>
    <th>Company Name</th>
    <th>Description</th>
    <th>Est. Year</th>
<c:forEach var="c" items="${sessionScope.company_list}">
    <tr>
          <td>${c.companyId}</td>
        <td>${c.cname}</td>
        <td>${c.cdescription}</td>
        <td>${c.estYear}</td>
  		<td><a href='<spring:url value="/location/showLocation?Id=${c.companyId}"></spring:url>'>Show Location</a></td>
    	<td><a href='<spring:url value="/location/addLocation?Id=${c.companyId}"></spring:url>'>AddLocation</a></td>
    </tr>
    </c:forEach>
</table>

<a href='<spring:url value="/company/addCompany"></spring:url>'>AddCompany</a>

</body>
</html>