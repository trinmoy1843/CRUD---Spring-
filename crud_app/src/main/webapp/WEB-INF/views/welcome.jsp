<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>WELCOME</title>
		<style>
			.success{
				color : green;
			}
			.logout{
				width : 300px;
			}
		</style>
	</head>
	<body>
		<h2 class="success">WELCOME, LOGIN SUCCESSFULL</h2>
		<form action="home">
			<button type="submit" class="logout">LOGOUT</button>
		</form>
	</body>
</html>