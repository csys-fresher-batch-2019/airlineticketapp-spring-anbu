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
<body style="background-color: skyblue;">
<div align ="right">
<h2><a href = "index.jsp">Logout</a></h2>
</div>
<center>
<h3>DELETE AIRLINE</h3>
 <form action ="DeleteAirLineServlet">
<img src="assets/images/plane.png.png"
 width="350" height="150"
 alt="Plane"/>


<h3>DELETE AIRLINE</h3>

<br/>

AirlineId : <input type = "text" name="AirlineId">
<br/>
<button type = "DELETE">DELETE</button>
</center>
</form>
</body>
</html>