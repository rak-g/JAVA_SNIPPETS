<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Enter userid to be deleted</h2>
	<form action="http://localhost:8080/UserManagementSystem/DeleteUserServlet" method="post">
		User Id : <input type="text" name="userid"/><br/>
		<button type="submit">Delete user</button>
	</form>

</body>
</html>