<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign In</title>
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
	
	
	<h1>Enter Your Id and Password here for Login</h1>
	
	<div align="center">
	
	<h5 style="color: red;">${fail}</h5>
        <h5 style="color: red;">${lock}</h5>
        <h4 style="color: red">${msg}</h4>
        <h4 style="color: red">${msgs}</h4>
	
	<form action="aj" method="post">
	
	User Id<input type="text" name="userId" id="sIUserId" onchange="nameValidation()" /> 
		<span id="nameError" style="color: red">${error}</span> 
		<!--  <span id="displayUserId" style="color: red">${error}</span>-->
		<br>
		
		Password<input type="password" name="password" id="sIPassword" onchange="passwordValidation()"/>
		<span id="passwordError" style="color:red">${error}</span>
	
	<div>
		<button type="submit" >Sign In</button>
        </div>
        <div> <h6> <a href="ResetPassword.jsp">Forgot Password</a></h6></div>
	</form>
	
	</div>
	
	<script >
	
	function nameValidation() {
		var user = document.getElementById('sIUserId');
		var userValue = user.value;
		console.log(userValue);
		if (userValue != null && userValue != "" && userValue.length > 2
				&& userValue.length < 30) {
			cosole.log("Valid User Id");	
			document.getElementById('nameError').innerHTML ='';
		<!--	const xhttp = new XMLHttpRequest();
		console.log('Running ajax');
		console.log(userValue);
		xhttp.open("GET", "http://localhost:8080/xworkz-jaideep-cm/userId/"	+ userValue);
		xhttp.send();
		xhttp.onload = function() {
			consol.log(this);
			document.getElementById('displayUserId').innerHTML = this.responseText
		}-->
		}else {
			console.log('Invalid User Id or Password');
			document.getElementById('nameError').innerHTML = 'User Id or Password is Wrong';
		}				
	
	}
function passwordValidation() {
	var sip=document.getElementById('sIPassword');
	var sipValue=sp.value;		
	
	if(sipValue!=null&&sipValue!=""&&sipValue.length>=4&&sipValue.length<=10){
		console.log('Password validated')
				
		document.getElementById('passwordError').innerHTML='';
	}else{
		console.log(' Password is Invalidated ')
		document.getElementById('passwordError').innerHTML='Please enter valid password ';
	}
}

</script>		
	
	
	

</body>
</html>