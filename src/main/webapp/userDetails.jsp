<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="userAdding" method="post">
<h1>Personal Details</h1>
Name:<input type="text"  name="uname"><br>
Sex :<input type="radio"  name="usex" value="Male">Male
<input type="radio"  name="usex" value="Female">Female
<br>
Address :<input type="text" name="uaddress"><br>
Email:<input type="email" name="uemail"><br>
Mobile No:<input type="text"  name="umobno"><br>
Password:<input type="password" name="upassword">
<input type="submit" value="Next">

</form>
</body>
</html>