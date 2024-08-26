<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>UPDATE A EXISTING PROFILE</title>
		<style>
			.input{
				width : 500px;
				margin : 4px;
				padding : 5px;
			}
			.failed{
				color : red;
			}
			.success{
				color : green;
			}
			h4{
				color : blue;
			}
		</style>
	</head>
	<body>
		<%
			String flag = (String) request.getAttribute("login");
			if(flag != null) {
				if(flag.equals("false")){
					%><h3 class="failed">ENTER CORRECT EXISTING DETAILS</h3><%
				}else{
					flag = (String) request.getAttribute("name");
					if(flag != null){
						if(flag.equals("true")) %><h3 class="success">NAME UPDATED SUCCESFULLY</h3><%
						else %><h3 class="failed">NAME IS NOT UPDATED, ENTER CORRECT FORMAT</h3><%
					}
					flag = (String) request.getAttribute("email");
					if(flag != null){
						if(flag.equals("true")) %><h3 class="success">EMAIL UPDATED SUCCESFULLY</h3><%
						else %><h3 class="failed">EMAIL IS NOT UPDATED, ENTER CORRECT FORMAT</h3><%
					}
					flag = (String) request.getAttribute("contact");
					if(flag != null){
						if(flag.equals("true")) %><h3 class="success">CONTACT UPDATED SUCCESFULLY</h3><%
						else %><h3 class="failed">CONTACT IS NOT UPDATED, ENTER CORRECT FORMAT</h3><%
					}
					flag = (String) request.getAttribute("password");
					if(flag != null){
						if(flag.equals("true")) %><h3 class="success">PASSWORD UPDATED SUCCESFULLY</h3><%
						else %><h3 class="failed">PASSWORD IS NOT UPDATED, ENTER CORRECT FORMAT</h3><%
					}
				}
			}
		%>
			<form action="updateProfile" method="post">
			<h4>** USER ID CANNOT BE UPDATED</h4>
			<input type="text" name="uid" placeholder="ENTER YOUR USER ID" class="input" required><br>
			<input type="text" name="name" placeholder="ENTER NEW NAME" class="input"><br>
			<input type="text" name="email" placeholder="ENTER NEW EMAIL" class="input" ><br>
			<input type="text" name="contact" placeholder="ENTER YOUR NEW CONTACT NUMBER" class="input"><br>
			<input type="password" name="newPassword" placeholder="ENTER YOUR NEW PASSWORD" class="input"><br>
			<input type="password" name="oldPassword" placeholder="ENTER YOUR EXISTING PASSWORD" class="input" required><br>
			<button type="submit" class="input">UPDATE</button>	
		</form>
		<form action="home">
			<button type="submit" class="input">HOME</button>
		</form>
	</body>
</html>