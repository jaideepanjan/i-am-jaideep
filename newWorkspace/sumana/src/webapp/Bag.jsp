<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>

<nav class="navbar navbar-light bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href=""></a>
  </div>
  <form class="d-flex">
  <a href="index.jsp">Home</a>
  </form>
</nav>


<form action="bag" method="post">

<pre>
Name<input type="text" name="name" />
Brand<select name="brand">
<option value="">Select</option>
<c:forEach items="${brand}" var="b">
<option value="${b}">${b}</option>
</c:forEach>
</select>
Type<select name="type">
<option value="">Select</option>
<c:forEach items="${type}" var="t">
<option value="${t}">${t}</option>
</c:forEach>
</select>
Price<input type="number"  name="price">
Quantity<input type="text" name="quantity" >
</pre>

<input type="submit" value="send">


</form>

</body>
</html>