<%@page import="org.hibernate.internal.build.AllowSysOut"%>
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
<h1>Booking details</h1>
<table border="1" style="background-color: olive; text-align: center;border-top-color: aqua;border-radius: 10px">
	<tr>
		<th>UserName</th>
		<th>Email</th>
		<th>Address</th>
		<th>Flight Name</th>
		<th>From</th>
		<th>To</th>
		<th>Date</th>
		<th>Time</th>
		<th>Number of Traveler</th>
		<th>Amount Paid</th>
		
	</tr>
	<tr>
                    <td><c:out value="${fuser.getUname()}"/></td>
                    <td><c:out value="${fuser.getUemail()}" /></td>
                    <td><c:out value="${fuser.getUaddress()}" /></td>
                    <td><c:out value="${bfname}"/></td>
                    <td><c:out value="${bffrom}" /></td>
                    <td><c:out value="${bfto}" /></td>
                    <td><c:out value="${bfdate}"/></td>
                    <td><c:out value="${bftime}" /></td>
                    <td><c:out value="${ftraveller}" /></td>
                     <td><c:out value="${bfpay}" /></td>
                </tr>   
            
</table>
<br>
<br>
<br>
<h1>Thank You!</h1>
</body>
</html>