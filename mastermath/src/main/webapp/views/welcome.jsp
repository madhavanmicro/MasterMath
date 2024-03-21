<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body style="background-color: rgb(240, 240, 240);">
	<div style="text-align: center;">
        <h1 style="color: rgb(0, 128, 128); font-size: 36px; margin-bottom: 20px;">Welcome ${player.name}</h1>
        <h4 style="font-size: 20px;">Your All Time High Score: ${player.highScore}</h4>
        <h3 style="font-size: 24px; margin-top: 30px;">Top High Scores</h3>
        <h4 style="font-size: 20px;">1. ${top.get(0)}</h4>    
        <h4 style="font-size: 20px;">2. ${top.get(1)}</h4>
        <h4 style="font-size: 20px;">3. ${top.get(2)}</h4>

        <form action="gamemode">
            <input type="submit" name="submitButton" value="Start Game" style="margin-top: 30px; padding: 10px 20px; font-size: 20px;background-color: rgb(0, 128, 128); color: white;;">
        </form>

        <form action="logout" style="margin-top: 20px;">
            <input type="submit" name="logout" value="Logout" style="padding: 10px 20px; font-size: 20px;background-color: rgb(0, 128, 128); color: white;">
        </form>
    </div>
</body>
</html>