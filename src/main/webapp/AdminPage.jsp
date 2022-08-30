<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
</head>
<body >
<br>
<center>
<a href=index.html style="color:black;text-decoration:none ;font-size:35px;font-weight:bold;" >FlyAway</a>
</center>
<br><br>
<center>
<h2>Admin Login</h2>
<div  align="center">
<form action=AdminLogin method=post>
	<label for=name>Name:-</label> <input type="text" name="aname" /><br><br>
	Password : <input type="password" name="apassword" /><br><br>
	<input type=submit value=submit /> <input type=reset />
</form>
</div>
<br>

<a href=ForgotPassword.jsp style="font-size:25;color:red;">Forgot Password</a>

<%
	String message=(String)session.getAttribute("message");
	if(message!=null){
%>
<p style="color:silver;"><%=message %></p>
<%
		session.setAttribute("message", null);
	}
%>
</center>
</body>
</html>