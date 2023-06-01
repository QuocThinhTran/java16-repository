<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/taglib/import.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Customer</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- CSS  -->
<style>
	.error {
		color: red;
	}
</style>
</head>
<body>
	 <div class="container">
		<h3 align="center" class="h4 mt-4 mb-4">Save Customer</h3>
		
		<hr>

		<form:form action="save" method="POST" modelAttribute="customer">
			<form:hidden path="id"/>
			
			<div class="form-group row mt-4 mb-4">
				<label for="firstName" class="col-sm-2 col-form-label">Full Name:</label>
				<div class="col-sm-4">
					<form:input class="form-control" path="fullName" id="fullName" />
					 <form:errors path="fullName" cssClass="error" />
				</div>
			</div>
			
			<div class="form-group row mt-4 mb-4">
				<label for="email" class="col-sm-2 col-form-label">Email:</label>
				<div class="col-sm-4">
					<form:input class="form-control" path="email" id="email" />
					 <form:errors path="email" cssClass="error" />
				</div>
			</div>
			
			<div class="form-group row mt-4 mb-4">
				<label for="email" class="col-sm-2 col-form-label">Address:</label>
				<div class="col-sm-4">
					<form:input class="form-control" path="address" id="address" />
					 <form:errors path="address" cssClass="error" />
				</div>
			</div>
			<button type="submit" class="btn btn-info col-1" onclick="return confirmSave()">Save</button>
		</form:form>
    </div>
    
    <!-- Code JS function click button Save  -->
    <script>
    function confirmSave() {
	    if (confirm("Do you want to save the user just entered?")) {
	        // Thực hiện xóa

	        // Hiển thị thông báo xóa thành công
	        alert("Save successfully !");
	        return true; // Yêu cầu xóa đã được xác nhận
	    }
	    return false; // Yêu cầu xóa không được xác nhận
	}
    </script>
</body>
</html>