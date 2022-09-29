<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="http://cdn.jdselivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h3>student Record</h3>
		<form action="/CollegeFest/student/save" method="POST">
			<input type="text" name="id" value="${student.id }" />
			<div class="form-inline">
				<input type="text" name="name" value="${student.name}"
					class="form-control mb-4 col-4" placeholder="Name">



			</div>

			

			<div class="form-inline">

				<input type="text" name="department" value="${student.department}"
					class="form-control mb-4 col-4" placeholder="Department">



			</div>
			<div class="form-inline">

				<input type="text" name="country" value="${student.country}"
					class="form-control mb-4 col-4" placeholder="Country">



			</div>

			<button type="submit" class="btn btn-info col-2">Save</button>

		</form>
	</div>
</body>
</html>