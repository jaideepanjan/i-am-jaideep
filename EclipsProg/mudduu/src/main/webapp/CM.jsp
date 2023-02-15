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
    
    <a href = "index.jsp"> Home  </a>
    
    </form>
    
  </div>
    
</nav>

<form action = "cm" method = "post">

<pre>

CM Name <input type = "text" name = "name" />

Party <select  name = "party">
<option value=" ">Select</option>
<option>BJP</option>
<option>Congress</option>
<option>JDS</option>
<option>AAP</option>
<option>KJP</option>
</select>

State <select name = "state">
<option value=" ">Select</option>
<option>KA</option>
<option>AP</option>
<option>MP</option>
<option>TN</option>
<option>KL</option>
<option>MH</option>
<option>TS</option>
<option>GJ</option>
<option>GA</option>
<option>RJ</option>
<option>HA</option>
<option>UP</option>
<option>MZ</option>
<option>KR</option>
<option>DL</option>
</select>

Tenure <select name = "tenure">
<option value=" ">Select</option>
<option>1</option>
<option>2</option>
<option>3</option>
<option>4</option>
<option>5</option>

</select>

PortFolio <textarea rows="4" cols="17" name = "portfolio"></textarea>

<input type = "submit" value = "Save" class ="btn btn-primary"/>

</pre>

</form>

</body>
</html>