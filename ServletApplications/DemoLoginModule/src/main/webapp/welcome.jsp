<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Welcome..<br>
	
	<% 
	if(session.getAttribute("userName") == null) {
		response.sendRedirect("login.jsp");
	}
	%>
	
	<form action="logout">
		<input type="submit" value="Logout">
	</form>
</body>
</html>