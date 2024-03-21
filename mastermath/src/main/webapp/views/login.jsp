<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

</head>
<body style="background-color: rgb(240, 240, 240);">
	<h1 align='center' style="color: rgb(0, 128, 128);">Login</h1>

	<div style="text-align: center;">
		<form action="login-validation" method="post"
			  style="display: inline-block; text-align: left;">
			<div style="margin-bottom: 10px;">
				<label for="1"
					style="display: inline-block; width: 100px; text-align: right;">User Id</label> 
				 <input type="text" id="1" name="mobilenumber" placeholder="Enter Mobile Number">
			</div>
			<div style="margin-bottom: 10px;">
				<label for="2" 
					style="display: inline-block; width: 100px; text-align: right;">Password</label>
				<input type="password" id="2" name="pass"  placeholder="Enter Password">
			</div>
			<div style="margin-bottom: 10px;text-align: center;">
				<input type="submit" value="login"
					style="background-color: rgb(0, 128, 128); color: white;">
			</div>
		</form>
	</div>
</body>
</html>