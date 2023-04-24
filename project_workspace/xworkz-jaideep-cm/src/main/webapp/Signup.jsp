<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
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
			
			
			<a href="SignIn.jsp">Sign In</a> 
			



		</div>

	</nav>
	
	
	<h1>Sign Up here, by entering your proper details</h1>


	

	<h1 style="color: green;">${message}</h1>
	<br>
	<h5 style="color: red;">${messages}<br>
		<c:forEach items="${error}" var="e">${e.message} <br>
		</c:forEach>
	</h5>
	<h4 style="color: red;">${password}</h4>

	<form action="ivar" method="post" allign="center">

       
		User Id<input type="text" name="userId" id="sUserId" onchange="nameValidation()" /> 
		<span id="nameError" style="color: red">${error}</span> 
		<span id="displayUserId" style="color: red">${error}</span>
		<br>
		Email Id<input type="text"	id="sEmailId" name="email" onchange="emailValidation()" />
		  <span	id="emailError" Style="color: red">${error}</span>
		   <span id="displayEmailId" style="color: red"></span>
		   <br>
		   
		Mobile Number<input type="number" name="mobileNumber" id="sMobileNo" onchange="mobileValidateion()" />   
		<span id="mobileNoError" style="color:red">${error}</span>
		<span id="displayMobileNum" styel="color:red">${error}</span>
		<br>
		
		Password<input type="password" name="password" id="sPassword" onchange="passwordValidateion()"/>
		<span id="passwordError" style="color:red">${error}</span>
		<!-- <input type="checkbox"  > -->
		<br>
		
		Confirm Password<input type="password" name="confirmPassword" id="sConfirmPassword" onchange="cpasswordValidateion()"/>
		<span id="cPasswordError" style="color:red" >${error}</span>
		<!--  <input type="checkbox" >-->
		<br>
	    Accept Agreement<input	type="checkbox" name="acceptAgreement" id="agreementAccept"	onclick="agreementValidation()">
       <br>
       <div>
		<button type="submit" id="canClick" disabled="true" oncheck="nameValidation()">Sign Up</button>
        </div>
      

	</form>

	<script>
	

	function agreementValidation(){
		var agrement=document.getElementById('agreementAccept');
		if(agrement.checked){
			document.getElementById('canClick').disabled=false;			
			
		} else {
			console.log('Agrement not checked');
			document.getElementById('canClick').disabled='disabled';
			
		}
	}
	
	
		function nameValidation() {
			var user = document.getElementById('sUserId');
			var userValue = user.value;
			console.log(userValue);
			if (userValue != null && userValue != "" && userValue.length > 2
					&& userValue.length < 30) {
				cosole.log("Valid name");				
				const xhttp = new XMLHttpRequest();
			console.log('Running ajax');
			console.log(userValue);
			xhttp.open("GET", "http://localhost:8080/xworkz-jaideep-cm/userId/"	+ userValue);
			xhttp.send();
			xhttp.onload = function() {
				consol.log(this);
				document.getElementById('displayUserId').innerHTML = this.responseText
			}
			}else {
				console.log('Invalid User Id');
				document.getElementById('displayUserId').innerHTML = 'User Id should be min 2 and max 30 charecter';
			}				
		
		}

		function emailValidation() {
			var emailId = document.getElementById('sEmailId');
			var emailValue = emailId.value
			console.log(emailValue);
			if (emailValue != null && emailValue != "" && emailValue.length > 3
					&& emailValue.length < 30) {
				console.log('Valid Email Id');
				document.getElementById('emailError').innerHTML = '';
			} else {
				console.log('Invalid Email Id');
				document.getElementById('emailError').innerHTML = 'Email Id should be min 3 and max 30 charecter';
			}

			const xhttp = new XMLHttpRequest();
			console.log('Running Ajax');
			console.log(emailValue)
			xhttp.open("GET", "http://localhost:8080/xworkz-jaideep-cm/email/"+emailValue);
			xhttp.send();
			xhttp.onload = function() {
				consol.log(this);
				document.getElementById('displayEmailId').innerHTML = this.responseText
			}
		}
		
		function mobileValidateion(){
			var mobileNo=document.getElementById('sMobileNo');
			var mobileNoValue=mobileNo.value;
			console.log(mobileNoValue)
			if(mobileNoValue!=null&&mobileNoValue!=""&&mobileNoValue.length==10){
				console.log('Valid mobile No');
				document.getElementById('mobileNoError').innerHTML='';
			}else {
				console.log('Invalid mobile No');
				document.getElementById('mobileNoError').innerHTML='Mobile Number should be 10 digits';
			}
			
			const xhttp= new XMLHttpRequest();
			console.log('Running Ajax');
			console.log(mobileNoValue);
			xhttp.open("GET","http://localhost:8080/xworkz-jaideep-cm/mobileNumber/"+mobileNoValue);
			xhttp.sens();
			xhttp.onload=function(){
				console.log(this);
				docoment.getElementById('displayMobileNum').innerHTNL=this.responseText
			}
		}
		
		
		function passwordValidateion(){
			var sp=document.getElementById('sPassword');
			var spValue=sp.value;		
			
			if(spValue!=null&&spValue!=""&&spValue.length>=4&&spValue.length<=10){
				console.log('Password validated')
						
				document.getElementById('passwordError').innerHTML='';
			}else{
				console.log(' Password is Invalidated ')
				document.getElementById('passwordError').innerHTML='Please enter valid password the size must min4 and max 10';
			}
		}	
		
		
		
		function cpasswordValidateion(){
		var sp=document.getElementById('sPassword');
		var spValue=sp.value;
		var scp=document.getElementById('sConfirmPassword');
		var scpValue=scp.value;
		
		if(spValue==scpValue){
			console.log('Both the password are same')
			document.getElementById('cPasswordError').innerHTML='';
		}else{
			console.log('Confirm Password is Invalidated ')
			document.getElementById('cPasswordError').innerHTML='Confirm Password is not matching with Password';
		}
		
		}
	</script>


</body>
</html>