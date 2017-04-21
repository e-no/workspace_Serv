<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@page import ="model.User" %>
<%User loginUser = (User) session.getAttribute("loginUser"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DOCOつぶ</title>
</head>
<body>

<h1>LOGIN</h1>
<%	if(loginUser != null){	%>
				<p>LOGIN  SUCSESS !</p>
				<p>welcome : <%=loginUser.getName()%>＝サン</p>
				<a href="/dokoTubu/Main"	>Go to TUBUYAKI</a>
<%	}else{ %>
<p>LOGIN ERROR</p>
<a href="/dokotubu">TOPへ</a>
<%}%>
</body>
</html>