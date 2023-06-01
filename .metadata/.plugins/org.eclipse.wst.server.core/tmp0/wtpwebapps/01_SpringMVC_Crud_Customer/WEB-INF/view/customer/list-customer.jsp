<%@page import="com.springmvc.entity.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/taglib/import.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Management Application</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h1 align="center">Customer List</h1>
		<header>
			<form method="get" action="${contextPath}/customer/search">
				<div class="form-group">
					<input type="text" name="keyword" class="form-control"
						placeholder="Enter name to search..." required />
				</div>
				<button type="submit" class="btn btn-primary">Search</button>
			</form>
		</header>
		<br> <br>

		<table class="table table-bordered">
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Email</th>
					<th>Address</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${customers}" var="customer">
					<tr>
						<td>${customer.id}</td>
						<td>${customer.fullName}</td>
						<td>${customer.email}</td>
						<td>${customer.address}</td>
						<td><a href="${contextPath}/customer/edit?id=${customer.id}"
							class=" btn btn-info btn-sm">Edit</a> <a
							href="${contextPath}/customer/delete?id=${customer.id}"
							class=" btn btn-info btn-sm" onclick="return confirmDelete()">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="${contextPath}/customer/add"
			class="btn btn-primary btn-sm mt-3 mb-3">Add Customer</a>
	</div>
	<script>
	function confirmDelete() {
	    if (confirm("Are you sure you want to delete this item?")) {
	        // Thực hiện xóa

	        // Hiển thị thông báo xóa thành công
	        alert("Item deleted successfully!");
	        return true; // Yêu cầu xóa đã được xác nhận
	    }
	    return false; // Yêu cầu xóa không được xác nhận
	}
	</script>
</body>
</html>