<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><c:out value="${title}">CountryListPage</c:out></title>
</head>
<body>
<div>
<h3>Country List</h3>
	
	<table border="1" cellpadding="2" cellspacing="2">
		<tr>
			<th>id</th>
			<th>countryCode</th>
			<th>countryName</th>
		</tr>
		<c:forEach  items="${CountryList}"  var="c">
			<tr>
				<td>${c.id}</td>
				<td>${c.countryCode }</td>
				<td>${c.countryName }</td>
			</tr>
		</c:forEach>
	</table>
</div>
	
	

</body>
</html>