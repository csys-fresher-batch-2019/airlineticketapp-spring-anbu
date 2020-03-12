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
<body style="background-color: skyblue;">

<img src="assets/images/userlogin.png"
 width="150" height="150"
 alt="login"/>
 <form action ="userlogin">

<h3>USER-LOGIN</h3>
<br/>
EmailId : <input type="text" name="EmailId"
						pattern="[a-zA-Z0-9.-_]{1,}@[a-zA-Z.-]{2,}[.]{1}[a-zA-Z]{2,}"
						title="Example:xyz@gmail.com" placeholder="Enter emailid "
						required /><br/><br>
<br/>
Password : <input type = "password" name="Password" placeholder="Enter Password" required>
<br/>
<button type = "SUBMIT">SUBMIT</button>
</center>
</form>
</body>
</html>