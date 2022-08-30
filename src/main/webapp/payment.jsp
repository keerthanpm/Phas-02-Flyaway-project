<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Payment Page</h1>


Total Amount of booking: Rs <c:out value="${bfpay }"></c:out><br>
<form action="BookingAdd" method="get"><br>
Card Number<input type="text" name="card"><br>
CVV number<input type="text" name="evv"><br>
<input type="submit" value="Pay"><br>
</form>

</body>
</html>