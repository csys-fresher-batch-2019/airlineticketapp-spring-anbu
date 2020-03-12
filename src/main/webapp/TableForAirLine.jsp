<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String AirLineID = request.getParameter("AirlineId");
		String name = request.getParameter("Airlinename");
		String airPortName = request.getParameter("AirportName");
		String totalSeats = request.getParameter("seats");
		int ts = Integer.parseInt(totalSeats);
		String seatsAvailable = request.getParameter("seatsavail");
		int sa = Integer.parseInt(seatsAvailable);
		String from = request.getParameter("from");
		String date = request.getParameter("date1");
		String price = request.getParameter("price");
		int p = Integer.parseInt(price);
	%>

	<table border="1">
		<thead>
			<td>AirlineId</td>
			<td>Airlinename</td>
			<td>AirportName</td>
			<td>Totalseats</td>
			<td>No.of.seats.available</td>
			<td>From-to</td>
			<td>Date</td>
			<td>Price</td>
		</thead>
		<tbody>
		

<c:forEach items="${BookSummary}" var="b">
<tr>
<td>${b.mailid}</td>


</tr></c:forEach>
</tbody>
	</table>


</body>
</html>