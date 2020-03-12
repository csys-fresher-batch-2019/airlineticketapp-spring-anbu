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
<img src="assets/images/ticket.png"
 width="150" height="150"
 alt="Ticket"/>
<h2>Airlinemanagement</h2>
<h3>Ticket</h3>
<br/>
Mailid : <input type = "text" name ="Mailid">
<br/>
Airlineid : <input type = "text" name ="Airlineid">
<br/>
Date  of Booking : <input type ="date" name="Date of Booking">
<br/>
Travel date : <input type="date" name="Travel date">
<br/>
No of Bookings : <input type="date" name="No of Bookings">
<br/>
<button type = "SUBMIT">SUBMIT</button>
<a href = "LogoutServlet">Logout</a>
</body>
</html>