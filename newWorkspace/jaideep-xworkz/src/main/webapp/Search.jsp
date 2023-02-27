<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

				
				<a href="index.jsp">Home</a>
				
			</div>
			
		</nav>

<h1> Search Here...!</h1>

<h3>
	<span style="color: red;">${message}</span>
</h3>
<form action="search" method="get">
	Search By Id <input type="text" name="id" /> <input type="submit"
		value="search" class="btn btn-primary" />
</form>
<div>


	<h3 style="color: black;">Search Results</h3>
	Type : ${dto.type} <br> Phase : ${dto.phases } <br>
	Quality Standards : ${qualityStandards} <br> Coil Type : ${dto.coilType } <br>
	KVA : ${dto.kva }<br>TypeOfCooling:${dto.typeOfCooling}
	 <br>
	Waight : ${dto.weight }
	 <br>
	Cost : ${dto.cost }
	
</div>


</body>
</html>