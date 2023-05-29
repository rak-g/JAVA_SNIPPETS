<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Enter following details to update user</h2>
	<form action="http://localhost:8080/UserManagementSystem/UpdateUserServlet" method="post">
		User Id : <input type="text" name="userid"/><br />
		Password : <input type="text" name="pword"/><br />
		<button type="submit">Update User</button>
	</form>
</body>
</html>