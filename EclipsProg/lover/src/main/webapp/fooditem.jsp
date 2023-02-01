<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>

</head>
<body style="color: red">

	<nav class="navbar bg-body-tertiary">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				width="80" height="48" class="d-inline-block align-text-top">
			</a> <a href="index.jsp">Home</a>
		</div>
	</nav>

	<h1>Page send to Food item...</h1>

	<form action="bojanam" method="get">

		<div class="mb-3">
			<label for="exampleFromControlInput1" class="from-label">Food
				item name</label> <input type="text" class="form-control" name="foodName"
				id="exampleFormControlInput1" placeholder="food item" />
		</div>


		<div>
			<select class="form-select" aria-label="Default select example"
				name="type">
				<option selected>Select food type</option>
				<option value="veg">Veg</option>
				<option value="non-Veg">Non-Veg</option>
				<option value="both">Both</option>
			</select>
		</div>
		<div>
			<label for="customRangel" class="form-label">Food quantity</label> <input
				type="range" class="form-range" id="customRangel1" name="quantity">
		</div>
		<div class="mb-3">
			<label for="exampleFromControlInput1" class="form-label">Food
				item price</label> <input type="text" class="form-control" name="price"
				id="exampleFormControlInput1" placeholder="food item price" />

		</div>
		<button type="submit" class="btn btn-success">Book</button>
	</form>

</body>
</html>