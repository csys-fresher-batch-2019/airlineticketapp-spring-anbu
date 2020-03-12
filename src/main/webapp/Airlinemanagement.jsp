<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body style="background-color: skyblue;">
<div align ="right">
<h2><a href = "index.jsp">Logout</a></h2>
</div>
<center>
<img src="assets/images/plane.png.png"
 width="350" height="150"
 alt="Plane"/>
<h3>ADD AIRLINE</h3>
<form action ="AddAirlineServlet">
<br/>

AirlineId : <input type = "text" name="AirlineId"placeholder="Enter AirlineId " required>
<br/>
Airline_name : <input type = "text" name="Airlinename" placeholder="Enter Airliname" required>
<br/>
Total_seats : <input type = "number" min="1"  name="seats" placeholder="Enter Total seats" required>
<br/>
No.of.seats.available : <input type = "number" min="1"  name="seatsavail" placeholder="Enter Avail_seats" required>
<br/>
From-to : <input type = "text" name="from" placeholder="From-to" required>
<br/>
Date : <input type ="date" name="date1"placeholder="Date" required>
<br/>
Price : <input type = "number" name="price"placeholder="Price" required>
<br/>
<button type = "Add">Add</button>
</center>
</form>
</body>
</html>