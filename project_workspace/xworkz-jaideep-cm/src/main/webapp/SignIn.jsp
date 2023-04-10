<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AJ-projects</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body>


	<nav class="navbar navbar-dark bg-dark">
		<!-- Navbar content -->
		<div class="container-fluid">
			<img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="90" height="60" class="d-inline-block align-text-top">

          

			<a href="index.jsp">Home</a>
			<a href="Signup.jsp">Sign Up</a>
		</div>

	</nav>
	
	<div align="center">
	
	<h5 style="color:red">${match}</h5>
	
	<form action="aj" method="post">
	
	<table>
		<tr>
			<td>User ID</td>

		<td><input type="text" name="userId" id="userName"onchange="ValideName()">
			 <span id="nameError" style="color: red"></span> 
			 <span id="displayUserName" style="color: red"></span>
		</td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="password" id="userPassword" onblur="ValidePassword()">
				<span id="passwordError" style="color: red"></span> 
				<input type="checkbox" onclick="myFunction()">Show Password
	       </td>
		</tr>
	</table>
	<div>
	<button type="submit" class="btn btn-success">SignIN</button>
	</div>
	
	</form>
	
	</div>
	
	<script >
	
	function ValideName() {
	var userId = document.getElementById('userName');
	var value = userId.value;
	console.log(value);
	if (value != null && value != "" && value.length > 3
			&& value.length < 30) {
		console.log('valid name');
		document.getElementById('nameError').innerHTML = '';
	} else {
		console.log('invalid name');
		document.getElementById('nameError').innerHTML = 'Please enter valid name and Password';
	}
}
function myFunction() {
	var password = document.getElementById("userPassword");
	if (password.type === "password") {
		password.type = "text";
	} else {
		password.type = "password";
	}
}

</script>		
	
	
	

</body>
</html>