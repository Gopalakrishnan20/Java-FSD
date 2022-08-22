<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<%@include file="./base.jsp"%>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
	<h2 align="center">${Message}</h2>
	<div class="container mt-3">
	<div class="row">

			<table class="table table-hover">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Name</th>
						<th scope="col">Department</th>
						<th scope="col">Salary</th>
						<th scope="col">Address</th>
						<th scope="col">Designation</th>
						<th scope="col">Edit</th>
						<th scope="col">Delete</th>
					</tr>
				</thead>
				<tbody>
					
						<tr>
							<td class="table-plus">${employee.id}</td>
							<td>${employee.name}</td>
							<td>${employee.department}</td>
							<td>${employee.salary}</td>
							<td>${employee.address}</td>
							<td>${employee.designation}</td>
							<td><a href="editEmployee/${employee.id}" class="btn btn-warning">
									Edit </a></td>
							<td><a href="deleteEmployee/${employee.id}"
								class="btn btn-danger"> Delete </a></td>
						</tr>
				
				</tbody>
			</table>
		</div>
		</div>


</body>
</html>