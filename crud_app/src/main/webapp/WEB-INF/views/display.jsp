<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="Entities.User" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style>
			.input{
				width : 900px;
				margin : 4px;
				padding : 5px;
			}
			.id{
				width : 100px;
			}
			table, th, td {
  				border:1px solid black;
			}
			td, th{
				width : 200px;
			}
		</style>
	</head>
	<body>
		<% List<User> list = (List<User>)request.getAttribute("list"); %>
		<table>
			<tr>
				<th class="id">USERID</th>
				<th>NAME</th>
				<th>EMAIL</th>
				<th>CONTACT NUMBER</th>
				<th>PASSWORD</th>
			</tr>
			<%for(User obj : list){%>
				<tr>
					<td class="id"><% out.print(obj.getUid()); %></td>
					<td><% out.print(obj.getName()); %></td>
					<td><% out.print(obj.getEmail()); %></td>
					<td><% out.print(obj.getContact()); %></td>
					<td><% out.print(obj.getPassword()); %></td>
				</tr>
			<%}%>
		</table>

		<form action="home">
			<button type="submit" class="input">HOME</button>
		</form>
	</body>
</html>