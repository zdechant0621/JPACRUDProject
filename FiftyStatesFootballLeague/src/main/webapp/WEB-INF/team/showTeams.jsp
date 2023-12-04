<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Team Details</title>
</head>
<body>
	<h1>Team Details</h1>

	<c:if test="${not empty team}">
		<h2>${team.name}</h2>
		<p>Capital City: ${team.capitalCity}</p>
		<p>Stadium Name: ${team.stadiumName}</p>
		<p>Year Admitted: ${team.yearAdmitted}</p>
		<p>Head Coach Name: ${team.headCoachName}</p>

		<form action="update.do" method="POST">
			<input type="hidden" name="teamId" value="${team.id}"> <input
				type="submit" value="Update">
		</form>

		<form action="deleteTeam.do" method="POST">
			<input type="hidden" name="delete" value="${team.id}"> <input
				type="submit" value="Delete">
		</form>
	</c:if>
</body>
</html>