<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Technologies</title>
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
<body>

<nav class="navbar navbar-dark bg-dark" > 
		<!-- Navbar content -->
		<div class="container-fluid">
			<img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="90" height="60" class="d-inline-block align-text-top">


            <a href="index.jsp">Home</a> 
			 
			<a href="LoginSucess.jsp">Go Back</a>	
			
				
				<img src="download?fileName=${dtoPic}" height="60" width="80">
			
		</div>
		
		<div align="center">
	<h6 style="color:white">Welcome ${userID} </h6>
	</div>
		
		

	</nav>
	
	
	
	
	<form action="search">
	
	<div>
	<div style="color:blue" align="center"> <h3>Enter Here</h3> </div>
	
	<div align="center">
	<input type="search" name="name" placeholder="name" >
	<input type="search" name="language" placeholder="language" >
	<input type="search" name="version" placeholder="version" >
	<input type="search" name="owner" placeholder="owner" >
	<input type="search" name="supportFrom" placeholder="supportFrom" >
	<input type="search" name="supportTo" placeholder="supportTo" >
	<input type="search" name="license" placeholder="license" >
	<input type="search" name="openSource" placeholder="openSource" >
	<input type="search" name="osType" placeholder="osType" ></div>
	
	<input type="hidden" name="userId" value="${userID}" >
	
	<div align="center"> <input type="submit" value="Search" > </div>
	
	
	</div>
		
	</form>
	
	
	<table class="table table-dark table-hover">
	
	<tr>
	<th>Technology Name</th>
	<th>Technology Language</th>
	<th>Technology Version</th>
	<th>Technology Owner</th>
	<th>Support From</th>
	<th>Support To</th>
	<th>License</th>
	<th>Open Source</th>
	<th>OS Type</th>
	</tr>
	
	<c:forEach items="${tecList}" var="aj">
	
	<tr>
	<td>${aj.name}</td>
	<td>${aj.language}</td>
	<td>${aj.version}</td>
	<td>${aj.owner}</td>
	<td>${aj.supportFrom}</td>
	<td>${aj.supportTo}</td>
	<td>${aj.license}</td>
	<td>${aj.openSource}</td>
	<td>${aj.osType}</td>
	
	</tr>
	
	
	</c:forEach>
	
	
	</table>
	
	
</body>
</html>