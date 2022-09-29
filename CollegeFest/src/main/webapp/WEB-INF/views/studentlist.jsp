<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sample Table</title>
</head>
<body>
	<%-- <p>${student }</p> --%>
	<div>
		<a href="add">Add student</a>

	</div>
	<table class="table">
		<tr>
			<th>Name</th>
			<th>Department</th>
			<th>Country</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${Student}" var="student">
			<tr>
				<td>${student.name }</td>
				<td>${student.department }</td>
				<td>${student.country }</td>
				
				<td><a href="/CollegeFest/student/showFormForUpdate/?studentId=${student.id }">Update</a>
					<a href="/CollegeFest/student/delete/?studentId=${student.id }">Delete</a>
		</c:forEach>
	</table>
</body>
</html>