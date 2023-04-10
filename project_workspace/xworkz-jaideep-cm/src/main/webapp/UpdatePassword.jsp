<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AJ projects</title>
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
	 User Name:${userId}
	</div>
	
	<div align="center">
	<form action=updatePassword method="post">
	
	<table>
	
	<tr>
	
	<td>User Id</td>
	<td><input type="text" name="userId" value=${userId} readonly="readonly"/> </td>
	
	
	</tr>
	
	<tr>
	
	<td>New Password</td>
	<td><input type="password" name="password" id="userPassword"/>
	<span id="passwordError" style="color: red" ></span>
	<input type="checkbox" onclick="newPassword()" />Show Password </td>
	
	
	</tr>
	
	<tr>
	
	<td>Confirm Password</td>
	<td><input type="password" name="confirmPassword" id="uConfirmPassword" onblur="ValidePassword()" />
	<span id="passwordError" style="color:red"></span>
	<span id="passwordCompare" style="color:red"></span>
	<input type="checkbox" onclick="confirmPassword()" />Show Confirm Password </td>
	
	
	</tr>
	
	
	</table>
	
	<button type="submit" >Update</button>
	
	
	
	
	</form>
	
	</div>
	
	<script>
	
	
	function newPassword(){
		var np= document.getElementById("userPassword");
		if(np.type=="password"){
			np.type="text";
		}else{
			np.type="password";
		}
	}
	
	function confirmPassword(){
		var ncp= document.getElementById("uConfirmPassword");
		if(ncp.type=="password"){
			ncp.type="text";
		}else{
			ncp.type="password";
		}
	}
	
	function ValidePassword(){
		
		var userPassword = document.getElementById('userPassword');
		var userConfirmPassword = document.getElementById('userConfirmPassword');
		var userPasswordvalue = userPassword.value;
		var userConfirmPasswordvalue = userConfirmPassword.value;
		console.log(userPasswordvalue);
		if (userPasswordvalue != null && userPasswordvalue != ""
				&& userPasswordvalue.length > 4
				&& userPasswordvalue.length < 12) {
			if (userPasswordvalue == userConfirmPasswordvalue) {
				console.log('valide both password are same');
				document.getElementById('passwordCompare').innerHTML = '';
			} else {
				console.log('valide both password are not same');
				document.getElementById('passwordCompare').innerHTML = 'Password and ConfirmPassword are not matching';
			}
			console.log('valide password');
			document.getElementById('passwordError').innerHTML = '';
		} else {
			console.log('invalide password');
			document.getElementById('passwordError').innerHTML = 'Plese enter valide password length must be greater then 4 and less then 12';
		}
		
	}
	
	
	
	
	</script>
	
	
</body>
</html>