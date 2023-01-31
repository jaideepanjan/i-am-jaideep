<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Favorite Person</title>
</head>
<body>

<h1>Enter about your favorite Person...</h1>

<form action="favorite" method="post"><pre>
First Name <input type="text" name="firstName" />
Last Name <input type="text" name="lastName" />
Nick Name <input type="text" name="nickName"/>
Gender Male <input type="radio" name="gender" value="male"/>
       Female <input type="radio" name="gender" value="female"/>
       Others <input type="radio" name="gender" value="others"/>
Reason <textarea rows="5" cols="10" name="reason"></textarea>
Address <textarea rows="5" cols="10" name="address"></textarea>
<input type="submit" value="Done" >
</pre>
</form>

</body>
</html>