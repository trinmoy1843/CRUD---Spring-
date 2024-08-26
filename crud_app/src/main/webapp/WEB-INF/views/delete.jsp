<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>DELETE PROFILE</title>
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
			String check = (String) request.getAttribute("delete");
			if(check != null){
				if(check.equals("false")){%>
					<h3 class="failed">ENTER VALID USERID/NUMBER AND PASSWORD</h3><%
				}else{%>
					<h3 class="failed">PROFILE DELETED SUCCESSFULLY</h3><%
				}
			}
		%>
		<form action="deleteUser" method="post">
			<input type="text" name="uid" placeholder="ENTER YOUR USER ID" class="input" required><br>
			<input type="password" name="password" placeholder="ENTER YOUR PASSWORD" class="input" required><br>
			<button type="submit" class="input">DELETE PROFILE</button>
		</form>
		<form action="home">
			<button type="submit" class="input">HOME</button>
		</form>
	</body>
</html>