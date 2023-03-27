<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>X-Workz</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<a class="navbar-brand" href="#"> <img
			src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
			width="85" height="50" alt="">
		</a> <a class="navbar-brand" href="#">Navbar</a>  
		<a href="index.jsp">Home</a>
	</nav>
</head>

<h1>Aeroplane  Search Here...!</h1>

<h3>
	<span style="color: red;">${message}</span>
</h3>
<form action="search" method="get">
	Search By Id <input type="text" name="id" /> <input type="submit"
		value="search" class="btn btn-primary" />
</form>
<div>


	<h3 style="color: blue;">Search Results</h3>
	Name : ${dto.name } <br> Company Name : ${dto.company } <br>
	Cost : ${dto.cost } <br> Type : ${dto.type } <br> Country : ${dto.country }
</div>
</body>
</html>