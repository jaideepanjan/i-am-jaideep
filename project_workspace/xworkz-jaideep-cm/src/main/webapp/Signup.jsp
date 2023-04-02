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
            </form>



		</div>

	</nav>
	<h1>Welcome to our AJ projects</h1>
	
	<c:forEach items = "${error}" var = "e">
<p> <span style ="color:red"> ${e.message}</span></p>
</c:forEach>
	
	
	<form action="ivar" method="post" >
	<pre>
	User Id <input type="text" name="userId" />
	
	Email <input type="email" name="email" />
	
	Mobile <input type="number" name="mobileNumber" /><span id="numloc"></span>	
	
	Password <input type="password" name="password" id="userPassword" Onchange="validatePassword()" /> <span id="passwordError" Style="color:red"></span>
	
	
	Confirm Password <input type="password" name="confirmPassword" />
	
	Accept Agreement <input type="checkbox" name="acceptAgreement" id="agreementID" onclick="Agreement()" />
	
	<input type="submit" value="Sign Up" class="btn btn-primary"/>
	
	
	</pre>
	
	</form>
	
	<script>
	
	
	function myFunction(){
		var X = document.getelementById("userPassword");
		if(x.type=="password"){
			x.type="text";
		}
		else{
			x.type="password";
		}
		
	}
	
	
function acceptAgreement() {
			var agreement = document.getElementById('agreementId');
			console.log(agreement.checked);
			if (agreement.checked) {
				document.getElementById('submitId').disabled = false;
			} else {
				document.getElementById('submitId').disabled = 'disabled';
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
	
	var mobileNumber = document.myForm.mobileNumber.value;
	console.log(mobileNumber);
	
	if(isNaN(mobileNumber) || mobileNumber == null || mobileNumber==""){
		console.log(mobileNumber.checked);
		document.getElementById("numloc").innerHTML = "Enter Numeric value only";
		return false;
	}
	else{
		return true;
	}	
}



function validateEmail(){
	
	var email = document.myForm.email.value;
	
	var atposition = email.indexOf("@");
	var dotposition = email.lastindexOf(".");
	
	if(atposition<1 || dotposition<atposition+2 || dotposition+2>=email.length){
		
		alert("Please enter a valid e-mail address\n atposition:"+atposition+"\n dotposition:" + dotposition);
		
		return false;
	}
	return true;
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