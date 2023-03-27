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
		<h1>Enter your chats details here.....</h1>
		
		
		<form action="" method="post">
		Shop Name <input type="text" name="shopName" />
		
		Chats<select name="chats" >
		<option value="">Select</option>
		<c:forEach items="${hgh}" var="sel">
		<option value="${sel}" >${sel}</option>		
		</c:forEach>
		</select>
		
		
		Type Of Handover<select name="typeOfHandover">
		<option value="">Select</option>
		<c:forEach items="${type}" var="tp">
		<option value="${tp}">${tp}</option>		
		</c:forEach>
		</select>
		
		Mode Of Payment
		<select name="modeOfPayment">
		<option value="">Select</option>
		<c:forEach items="${mode}" var="md">
		<option value="${md}">${md}</option>		
		</c:forEach>
		</select>
		
		Quantity<input type="number" name="quantity" />
		
		Price<input type="number" name="price" />
			
		<input type="submit" value="Submit" />	
		
	
		
		</form>

</body>
</html>