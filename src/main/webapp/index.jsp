<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>

	<center>
		<body background="assets/images/picsart.png" />




		<h2>AIRLINE MANAGEMENT</h2>




		<a href="adminlogin.jsp"><h1 style="font-size: 150%;">ADMIN_LOGIN</h1></a><br>
		<a href="UserLogin.jsp"><h1 style="font-size: 150%;">USER_LOGIN</h1></a><br>
		<a href="ViewlistAirline.jsp"><h1 style="font-size: 150%;">VIEW-AIRLINES</h1></a><br>
		<a href="UserRegistration.jsp"><h1 style="font-size: 150%;">USER_REGISTRATION</h1></a><br>


	</center>
	<%
		String res = (String) request.getParameter("res");
		if (res!=null) {
	%>
	<script>
		alert("Registration Successfull")
	</script>
	<%
		} else if(res!=null && res.equals(1)) {
	%>
	<script>
		alert("Registration failed")
	</script>
	<%
		}
	%>
</body>
</html>
