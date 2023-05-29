<html>
<body>
	<h2>Welcome to User Management System</h2>
	<%
	String msg = (String) request.getAttribute("msg");
	if (msg != null)
	    out.println("<h3>" + msg + "</h3");
	%>
	<a href="adduser.jsp">Add User</a><br />
	<a href="deleteuser.jsp">Delete User</a><br />
	<a href="updateuser.jsp">Update User</a><br />
	<a href="searchuser.jsp">Search User</a><br />
	<a href="GetAllUsersServlet">Get All Users</a>
</body>
</html>
