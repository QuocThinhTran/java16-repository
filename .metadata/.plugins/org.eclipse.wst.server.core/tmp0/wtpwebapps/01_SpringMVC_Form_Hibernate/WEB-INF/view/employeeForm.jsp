<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Form</title>
</head>
<body>
	<h1>Employee Form</h1>
    <form action="${action}" method="post">
        <input type="hidden" name="id" value="${employee.id}">
        <label for="name">Name:</label>
        <input type="text" name="name" value="${employee.name}">
        <br>
        <label for="position">Position:</label>
        <input type="text" name="position" value="${employee.position}">
        <br>
        <label for="salary">Salary:</label>
        <input type="number" name="salary" value="${employee.salary}">
        <br>
        <input type="submit" value="Save">
    </form>
    <br>
    <a href="employees">Back to Employees</a>
    <br>
    <span style="color: red;">${errorMessage}</span>
</body>
</html>