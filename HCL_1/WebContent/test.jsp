<%@page import="prog_challenge_1.Randomizer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HCL Randomized-Prime</title>
</head>
<body>
Generated random numbers from Randomizer class are handled by Prime class
where they undergo the IsItPrime-check and finally all the numbers that have passed 
the test are printed out in sequential order.
<div> </div>
Below is the returned Queue.
<br>

<%
	Randomizer app = new Randomizer();
	out.print(app.RandomNumberGenerator(1, 100));
 %>
 
</body>
</html>