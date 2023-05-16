<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"rel="stylesheet"integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"crossorigin="anonymous">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"/>
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
				<a href="index.jsp">Home</a>
				
				
				
			</div>
			
		</nav>
		<h1>You can update here..</h1>
		
		<c:forEach items="${errors}" var="e"></c:forEach>
		<br>
		<span style="color:red;">${e.message}</span>
		
		<form action="update" method="post" >
		
		<pre>
		
		<div>
		
		<div class="mb-3">
		<label for="formateFile" class="form-label">Id</label>
		<input type="text" class="form-control" name="id" readOnly value="${dto.id}">		
		</div>
		</div>
		
		
		<div>
		 
		Brand<select class="form-select" aria-label = "Default select example" name="brand" required="required">
		
		<option selected value="${dto.brand}">${dto.brand}</option>
		<c:forEach items="${brand}" var="v"> 
		<option value="${v}">${v}</option>
		</c:forEach>		
		</select>
		</div>
		
		<div>
		<div class="mb-3">
		<label for="formateFile" class="form-label">Type</label>
		<input type="text" class="form-control" name="type"  value="${dto.type}">		
		</div>
		</div>
		<div class="mb-3">
		<label for="formateFile" class="form-label">Phase</label>
		<input type="text" class="form-control" name="phases"  value="${dto.phases}">		
		</div>
		
		<div>
		Quality Standrads<select class="form-select" aria-label = "Default select example" name="qualityStandards" required="required">
		
		<option selected value="${dto.qualityStandards}">${dto.qualityStandards}</option>
		<c:forEach items="${qS}" var="q"> 
		<option value="${q}">${q}</option>
		</c:forEach>
		</select>
		</div>
		
		
		
		<div>
		<div class="mb-3">
		<label for="formateFile" class="form-label">Coil Type</label>
		<input type="text" class="form-control" name="coilType"  value="${dto.coilType}">		
		</div>
		</div>
		
		
		<div>
		<div class="mb-3">
		<label for="formateFile" class="form-label">KVA</label>
		<input type="text" class="form-control" name="kva"  value="${dto.kva}">		
		</div>
		</div>
		<div class="mb-3">
		<label for="formateFile" class="form-label">Weight</label>
		<input type="text" class="form-control" name="weight"  value="${dto.weight}">		
		</div>
		
		<div>
		<div class="mb-3">
		<label for="formateFile" class="form-label">Type of cooling</label>
		<input type="text" class="form-control" name="typeOfCooling"  value="${dto.typeOfCooling}">		
		</div>
		</div>
		
		<div>
		<div class="mb-3">
		<label for="formateFile" class="form-label">Cost</label>
		<input type="text" class="form-control" name="cost"  value="${dto.cost}">		
		</div>
		</div>
		
		
		<input type="submit" value="update" />
		</pre>
		</form>
		</body>
</html>