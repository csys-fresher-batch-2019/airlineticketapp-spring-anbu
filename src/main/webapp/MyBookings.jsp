<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<thead>
<tr>
<table border="1">
<th>FName</th>
<th>LName</th>
<th>AirlineId</th>
<th>mail_id</th>
<th>address</th>
<th>Phone</th>
<th>age</th>
<th>Gender</th>
<th>Classing</th>
<th>NoofBookings</th>
</tr>
</thead>

<tbody>
		 
<c:forEach items="${List}" var="c">
<tr>
<td>${c.fname}</td>
<td>${c.lname}</td>
<td>${c.airlineid}</td>
<td>${c.mailid}</td>
<td>${c.address}</td>
<td>${c.phone}</td>
<td>${c.age}</td>
<td>${c.gender}</td>
<td>${c.classing}</td>
<td>${c.noofbookings}</td>
</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>