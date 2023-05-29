<%@page import="com.simplilearn.hibernate.mvc.dto.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<User> allusers = (List<User>)request.getAttribute("allusers");
		for(User user: allusers) {
		    out.println(user);
		}
	%>

</body>
</html>