<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

</head>
<body>
	<nav class="navbar navbar-dark bg-dark">
		<!-- Navbar content -->
		<div class="container-fluid">
			<img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="90" height="60" class="d-inline-block align-text-top">

			<a href="energy">Transformer</a> <a href="Search.jsp">Search by
				Id</a> <a href="SearchByBrand.jsp">Search by Brand</a> <a
				href="index.jsp">Home</a>


		</div>

	</nav>



	<h5>
		<span style="color: red:">${message}</span>
	</h5>

	<form action="findByTwo" method="get">
		Enter Quality Standard <input type="text" name="qualityStandards" />
		 Type
		of cooling<input type="text" name="typeOfCooling" /> <input
			type="submit" value="search" class="btn btn-primary" />
	</form>



	<div>

		<table class="table table-bordered">

			<tr>
				<th>Id</th>
				<th>Brand</th>
				<th>Type</th>
				<th>Phases</th>
				<th>Quality Standards</th>
				<th>Coil Type</th>
				<th>KVA</th>
				<th>Weight</th>
				<th>Type Of Cooling</th>
				<th>Cost</th>
				<th>Edit</th>
				<th>Delete</th>

			</tr>

			<c:forEach items="${list1}" var="l">


				<tr>
					<td>${l.id}</td>
					<td>${l.brand}</td>
					<td>${l.type}</td>
					<td>${l.phases}</td>
					<td>${l.qualityStandards}</td>
					<td>${l.coilType}</td>
					<td>${l.kva}</td>
					<td>${l.weight}</td>
					<td>${l.typeOfCooling}</td>
					<td>${l.cost}</td>
					<td><a href="update?id=${l.id}">Edit</a></td>
					<td><a href="delete?id=${l.id}">Delete</a></td>



				</tr>


			</c:forEach>


		</table>




	</div>
</body>
</html>