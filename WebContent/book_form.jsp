<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

<!-- jQuery and JS bundle w/ Popper.js -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
</head>
<body>
	<div class = "container-fluid d-flex justify-content-center mt-5">
		<form action = "book.jsp" class = "d-flex flex-column w-25">
			<div class = "text-center">
				<p class = "font-weight-bold">BOOKING DETAILS</p>	
			</div>
			<input type = "text" class = "form-control my-2" placeholder = "Enter username" name = "name">
			<input type = "number" class = "form-control my-2" placeholder = "No. of seats" name = "bookedSeats">
			<input type = "number" class = "form-control my-2" placeholder = "contact" name = "contact">
			<input type = "submit" class = "btn btn-outline-primary my-2" value = "Enter">
	    </form>
	</div>
</body>
</html>