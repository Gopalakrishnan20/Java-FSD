
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
</head>
<body>
<%
        if (session.getAttribute("name") == null) {
                response.sendRedirect("index.jsp?error=1");
        }
%>
<b>Hello <%= session.getAttribute("name") %></b><br>
<a href="logout.jsp">Click here to logout</a>
</body>
</html>
