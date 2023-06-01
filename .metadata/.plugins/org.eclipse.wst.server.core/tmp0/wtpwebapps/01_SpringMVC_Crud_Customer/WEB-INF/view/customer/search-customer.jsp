<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/taglib/import.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Results</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h1 align="center">Customer List - Search</h1>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>ID</th>
					<th>FullName</th>
					<th>Email</th>
					<th>Address</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${customers}" var="customer">
					<tr>
						<td>${customer.id}</td>
						<td>${customer.fullName}</td>
						<td>${customer.email}</td>
						<td>${customer.address}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>