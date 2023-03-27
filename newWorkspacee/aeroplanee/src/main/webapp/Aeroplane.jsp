<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>


<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" />
</head>
<body>
	<h1>Welcome</h1>

	<nav class="navbar navbar-dark bg-dark">
		<!-- Navbar content -->
		<div class="container-fluid">
			<img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="90" height="60" class="d-inline-block align-text-top">

			<a href="index.jsp">home</a> <a href="AeroplaneSearch.jsp">search</a>

		</div>

	</nav>
	<c:forEach items="${errors}" var="e">
		<span style="color: red;">${e.message }</span>
	</c:forEach>
	<form action="plane" method="post">

		<pre>
Company Name <input type="text" name="company" />
Name <input type="text" name="name" /> 
cost <input type="text" name="cost" /> 
Type<select name="type">
<option value="">SELECT</option>
<c:forEach items="${type}" var="items">
<option value="${items}">${items}</option>
</c:forEach>
</select>
Country Name<select name="country">
<option value="">SElECT</option>
<c:forEach items="${country}" var="coun">
<option value="${coun}">${coun}</option>
</c:forEach>
</select>
	
</pre>
		<pre>
			<input type="submit" value="save" class="btn btn-primary" />
		</pre>
	</form>

</body>
</html>
</html>