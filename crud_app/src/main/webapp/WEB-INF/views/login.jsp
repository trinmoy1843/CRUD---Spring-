<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>LOGIN</title>
		<style>
			.input{
				width : 500px;
				margin : 4px;
				padding : 5px;
			}
			.failed{
				color : red;
			}
		</style>
	</head>
	<body>
		<%
			String check = (String) request.getAttribute("success");
			if(check!=null && check.equals("false"))%><h3 class="failed">LOGIN FAILED, ENTER CORRECT LOGIN CREDENTIALS</h3>
	
		<form action="doLogin" method="post">
			<input type="text" name="uid" placeholder="ENTER YOUR USER ID" class="input" required><br>
			<input type="password" name="password" placeholder="ENTER YOUR PASSWORD" class="input" required><br>
			<button type="submit" class="input">LOGIN</button>
		</form>
		<form action="registration">
			<button type="submit" class="input">NEW USER? REGISTER HERE</button>
		</form>
		<form action="home">
			<button type="submit" class="input">HOME</button>
		</form>
	</body>		
</html>