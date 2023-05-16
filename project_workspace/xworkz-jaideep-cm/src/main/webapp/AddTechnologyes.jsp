<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Technologies</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
</head>
<body>

<nav class="navbar navbar-dark bg-dark" > 
		<!-- Navbar content -->
		<div class="container-fluid">
			<img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="90" height="60" class="d-inline-block align-text-top">


            <a href="index.jsp">Home</a> 
			 <a href="LoginSucess.jsp">Go Back</a>	
			
			
				
				<img src="download?fileName=${dtoPic}" height="60" width="80">
			
		</div>
		
		<div align="center">
	<h6 style="color:white">Welcome ${userID} </h6>
	</div>
		
		

	</nav>
	
	
	
	<div align="center">
	
	<form action="technologyes" method="post">
	
	User Id<input value="${dto.userId}" readonly="readonly"  name="userId" />
	
	<table>
	
	<tr>
	<td>Technology Name</td>
	<td><input type="text" name="name" value="${tecEnty.name}" /> </td>
	</tr>
	
	<tr>
	<td>Technology Language</td>
<td> <select name="language">
	<option value="${tecEnty.language}">Select </option>
	<c:forEach items="${tl}" var="tla">
	
	<option value="${tla}">${tla}</option>
	</c:forEach>
	
	
	</select> </td>
		</tr>
	
	<tr>
	<td>Technology Version</td>
	<td><input type="text" name="version" value="${tecEnty.version}" /> </td>
	</tr>
	
	<tr>
	<td>Technology Owner</td>
	<td><input type="text" name="owner" value="${tecEnty.owner}" /> </td>
	</tr>
	
	<tr>
	<td>Support From</td>
	<td><input type="text" name="supportFrom" value="${tecEnty.supportFrom}" /> </td>
	</tr>
	
	<tr>
	<td>Support To</td>
	<td><input type="text" name="supportTo" value="${tecEnty.supportTo}" /> </td>
	</tr>
	
	<tr>
	<td>License</td>
	<td><input type="text" name="license" value="${tecEnty.license}" /> </td>
	</tr>
	
	<tr>
	<td>Open Source</td>
<td> <select name="openSource">
	<option value="${tecEnty.openSource}">Select </option>
	<c:forEach items="${os}" var="oso">
	
	<option value="${oso}">${oso}</option>
	</c:forEach>
	
	
	</select> </td>
		</tr>
	
	<tr>
	<td>OS Type</td>
	<td> <select name="osType">
	<option value="${tecEnty.osType}">Select</option>
	<c:forEach items="${ops}" var="os">
	
	<option value="${os}">${os}</option>
	</c:forEach>
	
	
	</select> </td>
	</tr>
	
	</table>
	<input type="submit" value ="Send"  />
	</form>
	
	
	</div>

</body>
</html>