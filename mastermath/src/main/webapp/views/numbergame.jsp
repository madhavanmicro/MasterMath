<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.madhavan.mastermath.model.game.Game" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>number game</title>
</head>
<body style="background-color: rgb(240, 240, 240);">
	<h2 align='center' style="color: rgb(17, 69, 30);">Math Game</h2>
	<br>
	<hr >
	<h2 align='right' >Score : ${player.score}</h2>
	<br>
	<h1 align='center' style="font-size: 90px">${game.numberOne}${game.symbol}${game.numberTwo}</h1>
	<br>

	<form action="/result" >
	
		<div style="text-align: center;" >
		
		<input type="submit" name="submitButton" value="${game.optionOne}" style="margin-right: 10px;background-color: rgb(70, 200, 110); font-weight: bold;width: 80px; height: 50px; font-size: 40px;">
		
		<input type="submit" name="submitButton" value="${game.optionTwo}" style="margin-right: 10px;background-color: rgb(70, 200, 110);font-weight: bold;width: 80px; height: 50px; font-size: 40px;">

		<input type="submit" name="submitButton" value="${game.optionThree}" style="margin-right: 10px;background-color: rgb(70, 200, 110);font-weight: bold;width: 80px; height: 50px; font-size: 40px;">

		<input type="submit" name="submitButton" value="${game.optionFour}" style="background-color: rgb(70, 200, 110);font-weight: bold;width: 80px; height: 50px; font-size: 40px;">
		
	    </div>

	</form>
</body>
</html>