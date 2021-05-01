<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome!</title>
</head>
<body>

<h1>Hello, welcome to our Login Page.</h1>

<form action="welcome">
Your Name:
<input type="text" name= "name">
<input type="submit" value="LOGIN with GET">
</form>

<br><br><br>
<form action="welcomePost" method="post">
Your Name:
<input type="text" name= "name">
<input type="submit" value="LOGIN with POST">
</form>

</body>
</html>