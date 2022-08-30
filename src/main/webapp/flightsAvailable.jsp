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
<div align="center" >

<c:choose>
<c:when test="${flightlist.isEmpty()}">
<h1>Flights Not available</h1><br>
<a href=index.html>Return to Homepage</a>
</c:when>
<c:otherwise>
<h1>Available Flights</h1>
<table border="1" style="background-color: olive; text-align: center;border-top-color: aqua;border-radius: 10px">




	<tr>
		<th>Name</th>
		<th>To</th>
		<th>From</th>
		<th>Price</th>
		<th>Time</th>
		
	</tr>
	
	
	<c:forEach var="flights" items="${flightlist}">
                <tr>
                    <td><c:out value="${flights.flight_name}" /></td>
                    <td><c:out value="${flights.flight_to}" /></td>
                    <td><c:out value="${flights.flight_from}" /></td>
                    <td><c:out value="${flights.fprice}" /></td>
                    <td><c:out value="${flights.ftime}"></c:out>
                     <td><a href="paymentServlet?name=${flights.flight_name}&to=${flights.flight_to}&from=${flights.flight_from}&price=${flights.fprice}&id=${flights.fid}&time=${flights.ftime}&date=${flights.fdate}">Book NOW</a></td>
                </tr>   
            </c:forEach>
</table>
</c:otherwise>


</c:choose>

</div>
</body>
</html>