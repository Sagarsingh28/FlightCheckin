<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Personal Data</title>
</head>
<body>
<h1>Your Information</h1><hr><br>
<h3>Passenger Name: ${reserved.passenger.firstName} ${reserved.passenger.lastName}</h3>
<h3>Passenger Email ID: ${reserved.passenger.emailId}</h3>
<h3>Passenger Phone Number: ${reserved.passenger.phoneNumber}</h3>
<br>
<h1>Flight Information</h1><hr><br>
<h3>Flight Number: ${reserved.flight.flightNo}</h3>
<h3>Airline : ${reserved.flight.operatingAirlines}</h3>
<h3>From: ${reserved.flight.departureCity}</h3>
<h3>To: ${reserved.flight.arrivalCity}</h3>
<h3>Date: ${reserved.flight.dateOfDeparture}</h3>
<h3>Time: ${reserved.flight.estimatedDepartureTime}</h3>
<br>
<form action="checkInConfirmed" method="POST">
	<input type="hidden" name="id" value="${reserved.id}"/>
	Number of Bags: <input type="text" name="noOfBags"/>
		<input type="submit" value="CHECK IN"/>
</form>
</body>
</html>