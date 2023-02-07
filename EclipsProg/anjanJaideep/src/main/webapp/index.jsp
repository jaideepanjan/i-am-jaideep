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
		<h6>Display Most visited Places :${pravasa}</h6>
		<input type="submit" value="get places">
	</form>
	
	<form action="skillSets" method="get">
		<h6>Display the Skill sets :${vidye}</h6>
		<input type="submit" value="get Besti names">
	</form>
	
	<form action="educationDto" method="get">
		<h6>Display about EducationDTO:</h6>
		<input type="submit" value="get educationDTO"><br>
		<label>Education Minister Name : ${krupe.getEducationMinister()} </label><br>
		<label>Types of names : ${edu.krupe()} </label><br>
		<label>Type of education : ${krupe.getType()} </label><br>
		<label>Region of Education : ${krupe.getReagion()} </label><br>
		<label>Education language : ${krupe.getLanguage()} </label><br>
		<label>Aim of Education  : ${krupe.getAim()} </label><br>
	</form>
	
	<form action="drinks" method="get">
		<h6>Display Beverage DTO:</h6>
		<input type="submit" value="get Beverage DTO"><br>
		<label>Name of Beverage : ${paniyas.getName()} </label><br>
		<label>Brand : ${paniyas.getBrand()} </label><br>
		<label>Id : ${paniyas.getId()} </label><br>
		<label>Manufacture Date : ${paniyas.getMnufDate()} </label><br>
		<label>Expaire Date : ${paniyas.getExpDate()} </label><br>
		<label>Type : ${paniyas.getType()} </label><br>
		<label>Made In : ${paniyas.getMadeIn()} </label><br>
		<label>Quantity : ${paniyas.getQuantity()} </label><br>
		<label>Price: ${paniyas.getPrice()} </label><br>
	</form>
	
	
	<form action="jangamaVani" method="get">
		<h6>Display about JangamaVani :</h6>
		<input type="submit" value="get MobileDTO"><br>
		<label>Brand : ${phones.brand} </label><br>
		<label>Version : ${phones.vesion} </label><br>
		<label>MadeIn : ${phones.madeIn} </label><br>
		<label>Generation : ${phones.generation} </label><br>
		<label>Price : ${phones.price} </label><br>
	</form>
	
	
	<form action="kutumba" method="get">
		<h6>Display about Family DTO :</h6>
		<input type="submit" value="get FamilyDTO">
		<label>Name : ${kutumba.getName()} </label><br>
		<label>Type : ${kutumba.getType()} </label><br>
		<label>No of Members : ${kutumba.getNoOfMem()} </label><br>
		<label>Host Name : ${kutumba.getHostName()} </label><br>
		<label>Owner Name : ${kutumba.getOwnerName()} </label><br>
		<label>No of Childrenes : ${kutumba.getNoOfChildrens()} </label><br>
		<label>No of adults : ${kutumba.getNoOfAdults()} </label><br>
		<label>BasicallyFrom : ${kutumba.getBasicallyFrom()} </label><br>
		<label>Currently Staying In :${kutumba.getCurrentlyStayingIn()} </label><br>
		<label>Region : ${kutumba.getReagion()} </label><br>
		
	</form>
	
	
	<form action="chatDTO" method="get">
		<h6>Display about chat:</h6>
		<input type="submit" value="get ChatDTO"><br>
		<label>Name  : ${kurukalu.name} </label><br>
		<label>Shop Name  : ${kurukalu.shopName} </label><br>
		<label>Type  : ${kurukalu.type} </label><br>
		<label>Invention By  : ${kurukalu.inventionBy} </label><br>
		<label>TypeOfTaste  : ${kurukalu.typeOfTaste} </label><br>
		<label>Style  : ${kurukalu.style} </label><br>
		<label>Shape  : ${kurukalu.shape} </label><br>
		<label>Color  : ${kurukalu.color} </label><br>
		<label>FamousIn  : ${kurukalu.famousIn} </label><br>
		<label>No Of Ingreadients  : ${kurukalu.noOfIngreadients} </label><br>
		
	</form>
	

</body>
</html>