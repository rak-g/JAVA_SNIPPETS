<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="http://localhost:8080/UserManagementSystem/AddUserServlet" method="post"> 
		First Name : <input type="text" name="firstName"/><br/>
		Last Name : <input type="text" name="lastName"/><br/>
		User Name : <input type="text" name="userName"/><br/>
		Password : <input type="text" name="password"/><br/>
		<button type="submit">Add User</button>
	</form>
</body>
</html>