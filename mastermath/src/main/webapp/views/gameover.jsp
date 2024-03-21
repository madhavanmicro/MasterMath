<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>game over</title>
</head>
<body style="background-color: rgb(240, 240, 240);">
	<div style="text-align: center;">

		<h1 align='center'
			style="color: rgb(17, 69, 30); font-size: 60px; font-weight: bold;">Game
			Over!!!</h1>
		<br>
		<h1 align='center' style="font-weight: bold; font-size: 60px">
			Score is ${player.score}</h1>
		<br> <br>
		<form action="welcome">
			<input type="submit" name="dash board" value="go to dash board"
				style="background-color: rgb(0, 128, 128); color: white; text-align: center;">

		</form>

	</div>

</body>
</html>