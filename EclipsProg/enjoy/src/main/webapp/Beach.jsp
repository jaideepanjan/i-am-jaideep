<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous"/
	>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
</head>
<body style="color: blue">>
<nav class="navbar bg-body-tertiary">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				width="80" height="48" class="d-inline-block align-text-top">
			</a> <a href="index.jsp">Home</a>
		</div>
	</nav>

	<h1>Fill details ticket booking for Beach</h1>

	<form action="samudra" method="get">

<div class="mb-3">
			<label for="exampleFromControlInput1" class="from-label">
				 Beach Name</label> <input type="text" class="form-control" name="beachName"
				id="exampleFormControlInput1" placeholder="Enter Beach name" />
		</div>
		
		<div class="mb-3">
			<label for="exampleFromControlInput1" class="from-label">
				Location</label> <input type="text" class="form-control" name="location"
				id="exampleFormControlInput1" placeholder="Enter location" />
		</div>
		
		<div class >
		</div>
		
	
		
<button type="submit" class="btn btn-success">Send</button>
 

</body>
</html>