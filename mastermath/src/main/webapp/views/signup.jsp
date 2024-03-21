<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body style="background-color: rgb(240, 240, 240);">
<h1 align='center' style="color: rgb(0, 128, 128);">Registration Form</h1>
<br>
	<div style="width: 300px; margin: 0 auto;">
    <form action="addPlayer" method="post">
        <div style="margin-bottom: 10px;">
            <label for="name" style="display: inline-block; width: 125px; text-align: right;">Name</label>
            <input type="text" name="name" placeholder="Enter Name" id="name" style="width: 150px;">
        </div>
        <div style="margin-bottom: 10px;">
            <label for="mobile" style="display: inline-block; width: 125px; text-align: right;">Mobile Number</label>
            <input type="text" id="mobile" placeholder="Enter Mobile Number" name="mobilenumber" style="width: 150px;">
        </div>
        <div style="margin-bottom: 10px;">
            <label for="password" style="display: inline-block; width: 125px; text-align: right;">Password</label>
            <input type="text" id="password" placeholder="password" name="password" style="width: 150px;">
        </div>
        <br>
        <br>
        <div style="text-align: center;">
            <input type="submit" value="Signup" style="margin-right: 10px;background-color: rgb(0, 128, 128); color: white;">
            <input type="reset" value="Reset" style="background-color: rgb(0, 128, 128); color: white;">
        </div>
    </form>
</div>

  
</body>
</html>