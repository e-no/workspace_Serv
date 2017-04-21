<%@page import="java.util.List"%>
<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%List<Mutter> mutterList = (User) session.getAttribute("mutterList");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
User loginUser = (User) session.getAttribute("loginUser");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DOKOTUBU</title>
</head>
<body>
<h1>DOKOTUBU MAIN</h1>
<p>

<%= loginUser.getName() %> [ now login ]

<a href="?dokoTubu/Logout">LogOUT</a>
</p>
<p><a href="/dokoTubu/Main">更新</a></p>
</body>
</html>