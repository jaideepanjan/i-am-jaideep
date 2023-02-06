<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X workz</title>

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

	<h1>Enter your details.....</h1>

	<form action="hudde" method="get">

		<div class="mb-3">
			<label for="exampleFromControlInput1" class="from-label">Name
			</label> <input type="text" class="form-control" name="name"
				id="exampleFormControlInput1" placeholder="Enter your name" />
		</div>

		<div class="mb-3">
			<label for="exampleFromControlInput1" class="from-label">Age
			</label> <input type="num" class="form-control" name="age"
				id="exampleFormControlInput1" placeholder="Enter your Age" />
		</div>

		<div>
			<select class="form-select" aria-label="Default select example"
				name="qualification">
				<option selected>Select your qualification</option>
				<option value="sslc">SSLC</option>
				<option value="pucOrDiploma">PUC / Diploma</option>
				<option value="postGraducation">Post Graduation</option>
				<option value="masters">Masters</option>
			</select>

		</div>

		<div>
			<select class="form-select" aria-label="Default select example"
				name="streem">
				<option selected>Select your stream</option>
				<option value="civil">Civil</option>
				<option value="electronics">Electrical</option>
				<option value="computerScience">Computer Science</option>
				<option value="mechanacal">Mechanical</option>
				<option value="informationScience">Information Science</option>

			</select>

		</div>

		<div>
			<select class="form-select" aria-label="Default select example"
				name="yearOfPassout">
				<option selected>Select year of pass out</option>
				<option value="2020">2020</option>
				<option value="2021">2021</option>
				<option value="2022">2022</option>
				<option value="2023">2023</option>


			</select>

		</div>





		<div>
			<select class="form-select" aria-label="Default select example"
				name="company">
				<option selected>Select the company</option>
				<option value="ivar">IVAR Engineers</option>
				<option value="ajTechnologies">AJ Technologies</option>
				<option value="powerItField">Power IT Field</option>
				<option value="powerItField">Swamy IT Field</option>
			</select>
		</div>

		<div class="mb-3">
			<label for="exampleFromControlInput1" class="form-label">Your
				Address</label> <input type="text" class="form-control" name="yourAddress"
				id="exampleFormControlInput1" placeholder="Enter Your Address" />

		</div>
		<button type="submit" class="btn btn-success">Submit</button>
	</form>

</body>
</html>