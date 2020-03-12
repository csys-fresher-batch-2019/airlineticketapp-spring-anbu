<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.chainsys.AIRLINEINFO.implementairlineinfo"%>
<%@page import="com.chainsys.AIRLINEINFO.interfaceairlineinfo"%>
<%@page import="com.chainsys.AIRLINEINFO.airlineinfo"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String email = (String) session.getAttribute("value");
		if (email != null) {
	%>
	<div align="right">
		<h2>
			<a href="index.jsp">Logout</a> <a href="MybookingsServlet">My
				Bookings</a>
		</h2>
	</div>
	<%
		}
	%>
	<%
		interfaceairlineinfo dao = new implementairlineinfo();
		ArrayList<airlineinfo> lists = dao.viewairlineinfo();
		//int n=1;
	%>
	<table border="1">
		<thead>
			<td>AirlineId</td>
			<td>Airlinename</td>
			<td>Totalseats</td>
			<td>No.of.seats.available</td>
			<td>From-to</td>
			<td>Date</td>
			<td>Price</td>
			<%
				if (email != null) {
			%>
			<td>Action</td>
			<%
				}
			%>
		</thead>
		<tbody>
			<c:set var="airlineinfo" value="<%=lists%>"></c:set>
			<c:forEach items="${airlineinfo}" var="b">
				<tr>
					<td>${b.airlineid}</td>
					<td>${b.airlinename}</td>
					<td>${b.totalseats}</td>
					<td>${b.noofseatsavailable}</td>
					<td>${b.fromto}</td>
					<td>${b.journeydate}</td>
					<td>${b.price}</td>


					<%
						if (email != null) {
					%>
					<td><a href="passenger.jsp?AirlineId=${b.airlineid}">Book
					</a></td>
					<%
						}
					%>



				</tr>
			</c:forEach>

		</tbody>
	</table>
	<%
		String rest = (String) request.getParameter("result");
		if (rest != null) {
	%>
	<script>
		alert("Tickets Booked")
	</script>
	<%
		} else if (rest != null && rest.equals(1)) {
	%>
	<script>
		alert("Action failed")
	</script>
	<%
		}
	%>


</body>
</html>