<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"rel="stylesheet"integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"crossorigin="anonymous">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"/>


</head>
<body>

<nav class="navbar navbar-dark bg-dark">
			<!-- Navbar content -->
			<div class="container-fluid">
				<img
					src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
					alt="" width="90" height="60" class="d-inline-block align-text-top">

			
				
				<a href="energy">Transformer</a>
				<a href="SearchByBrand.jsp">Search by Brand</a>
				<a href="Search.jsp">Search by Id</a>
				<a href="DisplayTable.jsp">Display Table</a>
				<a href="FindByTwo.jsp">Search By Two</a>
				<a href="index.jsp">Home</a>
				
				
				
			</div>
			
		</nav>
		<h1>Upload Image </h1>
		
		<h3 style="color: green;">${successMessage}</h3>
		<h3 style="color: red;">${errorMessage}</h3>
		
		<form action="upload" method="post" enctype="multipart/form-data">
		Upload : <input type="file" name="pic" />
		<input type="submit" value="Upload"  />
		
		</form>

</body>
</html>