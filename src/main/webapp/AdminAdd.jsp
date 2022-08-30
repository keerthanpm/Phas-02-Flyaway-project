<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
	<div>
	
	<h1> Add Flight Details</h1>
		<form action="flightadd">
		flight Name<input type="text" name="fname"><br>
		
		<label for="ffrom">FROM</label>
<select name="ffrom">
<option value="Kolkata">Kolkata</option>
<option value="Bengaluru">Bengaluru</option>
<option value="Mangaluru">Mangaluru</option>
<option value="Hyderbad">Hyderbad</option>
<option value="Delhi">Delhi</option>
<option value="Ahmedabad">Ahmedabas</option>
<option value="Mumbai">Mumbai</option>
<option value="Kashmir">Kashmir</option>
</select>
<br><br>
<label for="fto">To</label>
<select name="fto">
<option value="Bengaluru">Bengaluru</option>
<option value="Mangaluru">Mangaluru</option>
<option value="Hyderbad">Hyderbad</option>
<option value="Delhi">Delhi</option>
<option value="Ahmedabad">Ahmedabas</option>
<option value="Mumbai">Mumbai</option>
<option value="Kashmir">Kashmir</option>
<option value="Kolkata">Kolkata</option>
</select>
<br><br>
		
		Price<input type="text" name="fprice"><br>
		Date<input type="date" name ="fdate"><br>
		Date<input type="time" name ="ftime"><br>
		<input type="submit" value="Submit"><br>
		</form>
		
	</div>
	<br>
	<br>
	<br>
	<a href="index.html"><span style="text-align: right;" > Return to Home Page</span></a>
	</center>
</body>
</html>