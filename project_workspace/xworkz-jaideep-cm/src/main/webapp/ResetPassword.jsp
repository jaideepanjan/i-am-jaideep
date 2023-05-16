<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reset Password</title>
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



			<a href="Signup.jsp">Sign Up</a> 
			<a href="SignIn.jsp">Sign in</a> 
			<a href="index.jsp">Home</a> 
		</div>

	</nav>
	<div align="center">
	 Enter your email Id
	</div>
	
	<div align="center">
	
	<form action="reSet" method="post">
	User Email<br>
	<input type="email" name="email" id="RSemailId" onchange="emailValidation()"/><br>
	<span id="display" style="color:red"></span><br>
	
	
	
	
	
	<button type="submit" class="btn btn-success" >Send OTP</button>
	
	
	</form>
	
	<div >
	<span style="color: orange;" id="resend">${msg}  <span id="time" ></span>
	  </span>

		</div>
	 
	 
	 
	</div>
	
	
	<script>
	
	function startTimer(duration, display) {
	    var timer = duration, minutes, seconds;
	    var inter = setInterval(function () {
	        minutes = parseInt(timer / 60, 10);
	        seconds = parseInt(timer % 60, 10);

	        minutes = minutes < 10 ? "0" + minutes : minutes;
	        seconds = seconds < 10 ? "0" + seconds : seconds;

	        display.textContent = minutes + ":" + seconds;

	        if (--timer < 0) {
	            timer = duration;
	            clearInterval(inter)
	            document.getElementById("resend").innerHTML = 'Resend OTP'
	        }
	    }, 1000);
	}

	window.onload = function () {
		
		
		var message= "${msg}";
		console.log(message)
		if(message == '') {
			<!--document.getElementsByName("tim")[0].style.display = 'none'-->
			document.getElementById("time").style.display = 'none'
			
			return
		}
		
	    var twoMinutes = 60 * 2 ,
	    display = document.querySelector('#time');
	    startTimer(twoMinutes, display);
	}
	
	
	
	function emailValidation(){
		var uEmail=document.getElementById('RSemailIdS')
		var uEmailValue=uEmail.value;
		
		console.log(uEmailValue)
		
		if(uEmailValue!=null && uEmailValue !="" && uEmailValue.length>4 && uEmailValue.length<40){
			console.log('valide emale');
			
			const xhttp=new XMLHttpRequest();
			
			console.log('Running in ajax');
			console.log(uEmailValue);
			xhttp.open("GET","http://localhost:8080/xworkz-jaideep-cm/reEmail/"+uEmailValue);
			
			xhtml.send();
			
			xhtml.onload=function(){
				console.log(this);
				
				document.getElementById("display").innerHTML = this.responseText
			}
			
			dodument.getElementById("display").innerHTML='';
			
					
		}else{
			console.log('invalide email');
			document.getElementById('emailError').innerHTML='Plese enter valide email min 4 and max 40 charactes ';
		}
	}
	
	
	
	
	
	</script>
	
	
</body>
</html>