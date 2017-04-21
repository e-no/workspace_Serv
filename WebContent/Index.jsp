<%@page import="pack1.SiteEv"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ようそこ</title>
</head>
<body>
<%   SiteEv siteEv = (SiteEv) application.getAttribute("siteEv");	%>
<p>
<a href="/Index?action =like"><input type = "submit" value = "いいね"></a>:<%=siteEv.getLike()%><br>
<a href= "/Index?action =dislike"><input type = "submit" value = "いくないね"></a>:<%=siteEv.getDislike()%><br>
</p>
<h2>RESULT</h2>
<p>…</p>
</body>
</html>