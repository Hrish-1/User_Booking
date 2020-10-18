<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "com.service.*" %>
<%@ page import = "java.util.*" %>
<%@ page import = "com.dto.*" %>
<jsp:useBean id="user" class = "com.dto.User" scope = "session"></jsp:useBean>
<jsp:setProperty property="*" name="user"/>

<%
   UserService userService = new UserServiceImple();
   userService.insert(user);
   ArrayList<User> arr = userService.show(user.getBookingId());
%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

<!-- jQuery and JS bundle w/ Popper.js -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>

</head>
<body>
	<div class = "container">
		<div class = "text-center">
		<h1>BOOKING DETAILS</h1>
		</div>
		<table class = "table table-bordered">
		<thead class = "bg-dark">
			<tr class = "text-light">
				<th>BOOKED SEATS</th>
				<th>NAME</th>
				<th>BOOKING ID</th>
				<th>CONTACT</th>
		    </tr>
	   </thead>
	   <tbody class = "bg-light">
	   		<% for(User u : arr){ %>
				<tr class = "text-dark">
					<td><%=u.getBookedSeats()%></td>
					<td><%=u.getName()%></td>
					<td><%=u.getBookingId()%></td>
					<td><%=u.getContact()%></td>
				</tr>	
	        <% } %>
	   </tbody>
	</table>
	</div>	
</body>
</html>