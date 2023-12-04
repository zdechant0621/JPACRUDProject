<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fifty States Football</title>
</head>


<body>
	<h1>Welcome to the Fifty States Football League!</h1>

	<div class="section">
		<form action="getTeam.do" method="GET">
			Team ID: <input type="text" name="teamId" /> <input type="submit"
				value="Show Team" />
		</form>
	</div>

	<div class="section">
		<a href="create.do" class="create-team-button">Create Team</a>
	</div>


	<div class="section">
		<c:forEach var="team" items="${teams}">
			<a href="getTeam.do?teamId=${team.id}">${team.name}</a>
			<br>
		</c:forEach>
	</div>

</body>
</html>