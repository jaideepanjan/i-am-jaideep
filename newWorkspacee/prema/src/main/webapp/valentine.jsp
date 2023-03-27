<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix='c' %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>



</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"></a>
  </div>
  <a href="index">home</a>
</nav>

<h1>Enter the Details ....</h1>

<form action="preeti" method="post">

<pre>

Name<input type="text" name="name" />
ValentineName<input type="text" name="valentineName" />
Places<select name="meatingPlace">
<option  value="">Select</option>
<c:forEach items="${places}" var="pl">
<option value="${pl}">${pl}</option>
</c:forEach>

</select>
Gift<select name="gift">
<option value="">Select</option>
<c:forEach items="${gifts}" var="g">
<option value="${g}">${g}</option>
</c:forEach>
</select>

<input type="submit" value="Send">

</pre>





</form>

</body>
</html>