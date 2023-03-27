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

				
				<a href="index.jsp">Home</a>
				
			</div>
			
		</nav>
		
		<h1>Enter Transformer details....</h1>
		
		<c:forEach items="${errors}" var="e">
		 <h4>${e.message}</h4>
		</c:forEach>
		<form action="energy" method="post">
		
		<pre>
		
		Brand<select name="brand" >
		<option value="">Select</option>
		<c:forEach items="${brand}" var = "com">
		<option value="${com}">${com}</option>
		</c:forEach>
		</select>
		
		Type<input type="text" name="type">
		
		Phases<input type="number" name="phases" >
		
		Quality Standards<select name="qualityStandards" >
		<option value="">Select</option>
		<c:forEach items="${qS}" var = "qss">
		<option value="${qss}">${qss}</option>
		</c:forEach>
		</select>
		
		CoilType<input type="text" name="coilType" >
		
		KVA<input type="number" name="kva" >
		
		Weight<input type="text" name="weight" >
		
		Type of Cooling<input type="text" name="typeOfCooling" >
		
		Cost<input type="number" name="cost">
		
		<input type="submit" value="Send" class="btn btn-primary">
		
		
		</pre>
		
		
		
		
		
		
		
		</form>
		
		


</body>
</html>