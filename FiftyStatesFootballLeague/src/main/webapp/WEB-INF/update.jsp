<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Team</title>

</head>
<body>
	<h1>Update Team</h1>
    <form action="/updateTeam.do" method="GET">
        <input type="text" id="name" name="name" required><br><br>
        
        <label for="capitalCity">Capital City:</label>
        <input type="text" id="capitalCity" name="capitalCity" required><br><br>
        
        <label for="stadiumName">Stadium Name:</label>
        <input type="text" id="stadiumName" name="stadiumName" required><br><br>
        
        <label for="yearAdmitted">Year Admitted:</label>
        <input type="number" id="yearAdmitted" name="yearAdmitted" required><br><br>
        
        <label for="headCoachName">Head Coach Name:</label>
        <input type="text" id="headCoachName" name="headCoachName" required><br><br>
        
        <input type="submit" value="Update Team">
    </form>

</body>
</html>