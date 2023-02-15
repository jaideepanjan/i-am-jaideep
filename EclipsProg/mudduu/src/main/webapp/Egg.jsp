<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>
<body>

<nav class="navbar navbar-light bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand"><img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="" width="80" height="48" class="d-inline-block align-text-top"></a>
    
    <form class="d-flex">
    
    <a href = "index.jsp"> Home </a>
    
    </form>
    
  </div>
    
</nav>

<br>

<form action = "motte" method = "post">

<div>
  Hotel Name <input type="text"  name = "hotelName"/>
</div>

<br>

<div>
Egg Type <select name = "eggType">
<option>Select</option>
<option>Farm</option>
<option>Nati</option>
<option>Broiler</option>
</select>
</div>


<br>


<div>
Egg Dish Name <select name = "eggDishName">
<option> Select </option>
<option> Egg Masala </option>
<option> Baked egg </option>
<option> Fried egg </option>
<option> Omelette </option>
<option> Egg cury </option>
<option> Egg roast </option>
<option> Egg fried rice </option>
<option> Egg salad </option>
<option> Egg tart </option>
<option> Egg french toast </option>
<option> Smoked egg </option>
<option> Egg bhurji </option>
<option> Egg and Garlic fried rice </option>

</select>
</div>

<br>

<div>
 Price <input type="text" name = "price">
</div>

<br>

<div>
 Quantity <input type="range" class="form-range" min="0" max="5" id="customRange2" name = "quantity">
</div>


<div class="mb-3">
		<label>Take Away</label>
		<input type="radio" value="true" name="takeAway">yes 
		<input type="radio" value="false" name="takeAway">no
</div>



<input type = "submit" class = "btn btn-primary" value = "Order" />




</form>

</body>
</html>