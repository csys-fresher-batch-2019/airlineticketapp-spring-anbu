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
<center>
<img src="assets/images/passregis.png"
 width="190" height="170"
 alt="registration"/>
<body style="background-color: skyblue;">

<h3>USER-REGISTRATION</h3>
<form action ="UserRegistration">
<br/><br>
Name : <input type = "text" name="Name" placeholder="Enter username" required>
<br/><br>
EmailId : <input type="text" name="EmailId"
						pattern="[a-zA-Z0-9.-_]{1,}@[a-zA-Z.-]{2,}[.]{1}[a-zA-Z]{2,}"
						title="Example:xyz@gmail.com" placeholder="Enter emailid "
						required /><br/><br>
Password : <input type = "Password" name="Password" placeholder="Enter Password" required>
<br/><br>
Contact : <input type="tel" id="phone" name="Contact"
						title="Please enter 10 digit mobile number"
						pattern="[6-9]{1}[0-9]{9}" placeholder=" Enter Mobile_num"
						required />
<br/><br>
<button type = "SUBMIT">SUBMIT</button>
</center>
</form>
</body>
</html>