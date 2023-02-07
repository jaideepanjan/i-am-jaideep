<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous" />
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>



</head>
<body>


	<form action="getEmail" method="get">
		<h6>Display Email:${email}</h6>
		<input type="submit" value="get Email">
	</form>

	<form action="mobile" method="get">
		<h6>Display Mobile number:${phone}</h6>
		<input type="submit" value="get Mobile Num">
	</form>
	
	<form action="adhar" method="get">
		<h6>Display Adhar number:${adhar}</h6>
		<input type="submit" value="get adhar Num">
	</form>
	
	<form action="age" method="get">
		<h6>Display age number:${age}</h6>
		<input type="submit" value="get Age">
	</form>
	
	<form action="dobNdtime" method="get">
		<h6>Display Date of Birth with Time:${dobNdtime}</h6>
		<input type="submit" value="get DOB&Time">
	</form>
	
	<form action="salary" method="get">
		<h6>Display Desired Salary:${salary}</h6>
		<input type="submit" value="get salary">
	</form>
	
	<form action="bestee" method="get">
		<h6>Display best friends name:${bestee}</h6>
		<input type="submit" value="get Besti names">
	</form>
	
	<form action="places" method="get">
		<h6>Display best friends name:${pravasa}</h6>
		<input type="submit" value="get places">
	</form>
	
	<form action="skillSets" method="get">
		<h6>Display best friends name:${vidye}</h6>
		<input type="submit" value="get Besti names">
	</form>
	
	<form action="educationDto" method="get">
		<h6>Display about EducationDTO:${krupe}</h6>
		<input type="submit" value="get educationDTO">
		<label>Education Minister Name : ${edu.getEducationMinister} </label><br>
	</form>
	
	<form action="drinks" method="get">
		<h6>Display Beverage DTO:${paniyas}</h6>
		<input type="submit" value="get Beverage DTO">
	</form>
	
	
	<form action="jangamaVani" method="get">
		<h6>Display about JangamaVani :${phones}</h6>
		<input type="submit" value="get MobileDTO">
	</form>
	
	
	<form action="kutumba" method="get">
		<h6>Display about Family DTO :${kutumba}</h6>
		<input type="submit" value="get FamilyDTO">
	</form>
	
	
	<form action="chatDTO" method="get">
		<h6>Display about chat:${kurukalu}</h6>
		<input type="submit" value="get ChatDTO">
	</form>
	

</body>
</html>