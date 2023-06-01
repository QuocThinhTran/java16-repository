<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/taglib/import.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Customer</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
	 <div class="container">
        <h1>Edit Customer</h1>
        <form:form action="edit" method="post" modelAttribute="customer">
        	<div class="form-group">
        		<label for="id">ID:${customer.id}</label>
        		<form:hidden path="id" />
        	</div>
            <div class="form-group">
                <label for="name">FullName:</label>
                <form:input path="fullName"/>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <form:input path="email"/>
            </div>
            <div class="form-group">
                <label for="address">Address:</label>
                <form:input path="address"/>
            </div>
            <button type="submit" class="btn btn-primary" onclick="return onclickUpdate()">Update</button>
        </form:form>
    </div>
    <!-- Code JS function click button Update -->
    <script>
    	function onclickUpdate() {
    		if(confirm("Bạn có muốn cập nhật thông tin khách hàng không ?")) {
    			alert("Cập nhật thành công !");
    			return true;
    		}
    		return false;
    	} 
    </script>
</body>
</html>