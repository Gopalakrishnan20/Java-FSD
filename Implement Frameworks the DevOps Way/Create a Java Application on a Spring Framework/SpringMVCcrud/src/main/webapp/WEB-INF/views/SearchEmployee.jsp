<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp"%>
<title>Search Page</title>
</head>
<body>
	<div class="container mt-3">
		<form action=searchingEmployee>

			Enter ID:<input type="number" name=id id="id"> <input
				type="submit">
		</form>
	</div>
</body>
</html>