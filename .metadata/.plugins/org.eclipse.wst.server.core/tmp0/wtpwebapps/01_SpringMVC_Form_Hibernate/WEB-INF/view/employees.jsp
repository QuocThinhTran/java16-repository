<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c"    uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management</title>
</head>
<body>
	<h1>Employee Management</h1>
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Position</th>
			<th>Salary</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td>${employee.id}</td>
				<td>${employee.name}</td>
				<td>${employee.position}</td>
				<td>${employee.salary}</td>
				<td><a href="edit?id=${employee.id}">Edit</a> <a
					href="delete?id=${employee.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<a href="add">Add Employee</a>
</body>
</html>