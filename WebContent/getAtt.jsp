<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Get Attribute</title>
</head>
<body>
<%

String st = (String)application.getAttribute("app");
String st2 = (String)session.getAttribute("ss");


%>
<%=st %><br>
<%=st2 %><br>
<%=session.getId() %>

</body>
</html>