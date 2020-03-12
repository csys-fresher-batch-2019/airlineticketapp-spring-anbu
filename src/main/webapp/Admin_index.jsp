<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
<body background="assets/images/admin_img.jpg"/>
<div align ="right">
<h2><a href = "index.jsp">Logout</a></h2>
</div>
<center>
<h2>ADMIN_FEATURES</h2>
<ul>
 <a href="Airlinemanagement.jsp"><h1 style="font-size:150%;">ADD_AIRLINE</h1></a><br>
<a href="Deleteairlines.jsp"><h1 style="font-size:150%;">DELETE_AIRLINE</h1></a><br>
</center>
	<%
		String res1 = (String) request.getParameter("res");
	
		if (res1!=null && res1.equals("0")) {
	%>
	<script>
		alert("Action failed")
	</script>
	<%
		} else if(res1!=null && res1.equals("1")) {
	%>
	<script>
		alert("Airline Added successfully")
	</script>
	<%
		}
	%>
	
	
	
	<%
		String res2 = (String) request.getParameter("rest");
	
		if (res2!=null && res2.equals("0")) {
	%>
	<script>
		alert("Action failed")
	</script>
	<%
		} else if(res2!=null && res2.equals("1")) {
	%>
	<script>
		alert("Airline Deleted successfully")
	</script>
	<%
		}
	%>


</ul>
</body>