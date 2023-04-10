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

			<form class="d-flex">

				<a href="index.jsp">Home</a>
				<a href="SignIn.jsp">Sign In</a> 
			</form>



		</div>

	</nav>
	

	
	
	
	<div align="center">
	
	<h1 style="color: green">${message}</h1>
	<h5 style="color: red;">${messag}<br>
		<c:forEach items="${errors}" var="e">${e.message}</c:forEach>
	</h5>
	

		<form action="ivar" method="post">
			<pre>
	<table>
  <tr>
    <td>User Id </td>
    <td><input type="text" name="userId" id="userName" onchange="ValideName()" /> 
						<span id="userIdError" style="color: red"></span> 
							<span id="displayUserId" style="color: red"></span> <span id="emailError" style="color: red"></span>
		<span id="display" style="color: red"></span></td> </tr>
  <tr>
    <td>Email </td><td><input type="email" name="email" id="emailId" onchange="valideEmail()"/></td>
    
  </tr>
  <tr>
    <td>Mobile Number</td>
    <td><input type="number" name="mobileNumber" id="userMobile" onchange="ValideMobile()"/>
    <span id="mobileError" style="color: red"></span>
		<span id="displayMobileNumber" style="color: red"></span></td>
  </tr>
  <tr>
    <td>Password </td>
    <td><input type="password" name="password" id="userPassword" Onchange="validatePassword()"/>
							  <span id="passwordError"	Style="color: red"></span>
							  <input type="checkbox" onclick="myFunction1()">Show Password</td>
  </tr>
  <tr>
    <td>Confirm Password </td>
    <td><input type="password" name="confirmPassword" id="userConfirmPassword" onblur="validateConfirmPassword()"/>
    <span id="passwordCompare" style="color: red"></span>
		<input type="checkbox" onclick="myFunction2()">Show Confirm Password  </td>
  </tr>
  
  <tr>
    <td>Accept Agreement</td>
    <td><input type="checkbox" name="acceptAgreement" id="agreementConfirm" onclick="ValideName()" /></td>
  </tr>
  
</table>	
	</pre>

    <div>   <button type="submit" class="btn btn-success" id="agreementCon" disabled="true">Sign Up</button> 
</div>
		</form>
	</div>
	<h3 style="color:red;">${password}</h3>

	<script>
	
	<!--user id valoidation using js and ajax-->
	
	
	function ValideName() {
		var user = document.getElementById('userName');
		var uservalue = user.value;
		console.log(uservalue);
		if (uservalue != null && uservalue != "" && uservalue.length > 3
				&& uservalue.length < 30) {
			console.log('valide name');
			const xhttp = new XMLHttpRequest();
			console.log('Running in ajax');
			console.log(user);
			console.log(uservalue);
			
			xhttp.open("GET", "http://localhost:8080/xworkz-jaideep-cm/userId/"+ uservalue);
			xhttp.send();
			xhttp.onload = function() {
				console.log(this);
				document.getElementById("displayUserId").innerHTML = this.responseText
			}
			
			
			var agree = document.getElementById('agreementConfirm');
			console.log(agree.checked);
			if (agree.checked) {
				document.getElementById('agreementCon').disabled = false;
			}
			document.getElementById('userIdError').innerHTML = '';
		} else {
			console.log('invalide name');
			document.getElementById('agreementCon').disabled = 'disabled';
			document.getElementById('userIdError').innerHTML = 'Plese enter valide name, min 4 and max 30 character';
		}
	}
	
	<!-- password validation--> 
	
	function validatePassword(){
		var p = document.getelementById("userPassword");
		if(p.type=="password"){
			p.type="text";
		}
		else{
			p.type="password";
		}
		
	}
	
	<!--confirm password validation--> 
	
	function validateConfirmPassword(){
		var cp = document.getelementById("userConfirmPassword");
		if(cp.type=="password"){
			cp.type="text";
		}
		else{
			cp.type="password";
		}
		
	}
	
	
function acceptAgreement() {
			var agreement = document.getElementById('agreementId');
			console.log(agreement.checked);
			if (agreement.checked) {
				document.getElementById('agreementCon').disabled = true;
			} else {
				document.getElementById('agreementCon').disabled = 'disabled';
			}
		}
	
function validateform(){
	console.log("calling validateform")
	
	var userId = document.myForm.userId.value;
	var password = document.myForm.password.value;
	
	if(userId == null || userId==""){
		alert("Name can't be blank");
		return false;
	}
	else if(password.length < 6){
		alert("Password must be atleast 6 characters long")
		return false;
	}
	var validNumber=validateNumber();
	if(!validNumber){
		return validNumber;
	}
	return validateEmail();
	return validatePassword();
}
   





function validateNumber(){
	
	var mobileNumber = document.getElementById('userMobile');
	var mobileNumberValue=mobileNumber.value;
	console.log(mobileNumberValue);
	
	if(mobileNumberValue!=null && mobileNumberValue!=""&& mobileNumberValue.length==10){
		
		console.log('valid Mobile number ');
		const xhttp=new XMLHttpRequest();
		console.log('Running in ajax');
		console.log(mobileNumberValue);
		
		xhttp.open("GET","http://localhost:8080/xworkz-jaideep-cm/mobileNum/"+mobileNumberValue);
		
		xhttp.send();
		
		xhttp.onload=function(){
			console.log(this);
			
			document.getElementById('displayMobileNumber').innerHTML=this.respondText;
		}
		document.getElementById('mobileError').innerHTML ='';
		
	}else{
		console.log('invalid mobile');
		document.grtElrmentById('mobileError').innerHTML='Please enter valid mobile number digits must be 10 ';
	}
}



function validateEmail(){
	
	var email = document.getElementById('emailId');
	
	var emailValue=userEmail.value;
	console.log(emailValue);
	
	if(emailValue!=null && emailValue!="" && emailValue.length>4 &&emailValue.length<40){
		console.log('valid email');
		
		const xhtml=new XMLHttpRequest();
		
		console.log('Running in ajax');
		console.log(emailValue);
		
		xhttp.open("GET","http://localhost:8080/xworkz-jaideep-cm/email/"+emailValue);
		
		xhttp.send();
		
		xhttp.onload=function(){
			
			console.log(this);
			document.getElementById("display").innerHtml = this.responseText
		}document.getElementById('emailError').innerHTML = '';
		
		}else {
			console.log('invalid email');
			document.getElementById('emailError').innerHTML = 'please enter valid email min 4 and max 40 charecters ';
		}
	}
	
	
	

	
	function validPassword(){
		var userPassword = document.getElementById('userPassword');
		var userConfirmPassword= document.getElementById('userConfirmPassword');
		var userPasswordvalue=userPassword.value
		var userConfirmPasswordvalue=userConfirmPassword.value
		console.log(userPasswordvalue);
		
		if(userPasswordvalue !=null && userPasswordvalue !="" && userPasswordvalue.length >4 && userPasswordvalue.length <20)
		{
		
		if(userPasswordvalue==userConfirmPasswordvalue){
			console.log('valid, both password are same')
			document.getElementById('passwoedCompare').innerHTML='';
			else{
				console.log('valid, both password are not same');
				document.getElementById('passwoedCompare').innerHTML='Password and confirm password must be same';				
			}
			console.log('valid Password');
			document.getElementById('passwoedError').innerHTML='';
		}
		else{
			console.log('invalid password');
			document.getElementById('passwordError').innerHTML = 'please enter valid password';
		}
		}
		
		
		
		
	}
	

</script>



</body>
</html>