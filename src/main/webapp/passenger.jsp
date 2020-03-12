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
<img src="assets/images/pass.png"
 width="200" height="200"
 alt="Plane"/>
<h3>BOOK YOUR TICKETS</h3>

<form action ="PassengerServlet">
<br/>
First_Name : <input type = "text" name="fname"  placeholder="Enter Firstname "required>
<br/>
Last_Name : <input type = "text" name="lname" placeholder="Enter Lastname "required>
<br/>
MailId : <input type="text" name="Mailid"
						pattern="[a-zA-Z0-9.-_]{1,}@[a-zA-Z.-]{2,}[.]{1}[a-zA-Z]{2,}"
						title="Example:xyz@gmail.com" placeholder="Enter emailid "
						required /><br/>
Address : <input type = "text" name="Address" placeholder="Enter Address "required>
<br/>
Ph_No : <input type = "tel" name="Phone" placeholder="Enter Contact "required>
<br/>
Age : <input type = "Number" name="Age" placeholder="Age" required>
<br/>
Gender : <input type = "text" name="Gender" placeholder="Gender" required>
<br/>
Classing : <input type = "text" name="Classing" placeholder="Classing" required>
<br/>
No_of_Bookings : <input type = "Number" name="NoofBookings"  required>
<br/>
AirlineId : <input type = "text" name="AirlineId" value =<%= request.getParameter("AirlineId") %>>
<br/>
<button type = "submit">SUBMIT</button>
</form>
</center>

</body>
</html>