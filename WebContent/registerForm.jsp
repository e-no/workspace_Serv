<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user 登録</title>
</head>
<body>
<form action="ResisterUser1" method="get">

<br/><br/>
ログインID<input type="text" name = "id"/><br/>
パスワード<input type ="password" name ="pass"><br/>
名前<input type ="text" name ="name" /><br/>
<input type ="submit" value ="ENTER"/>

<%

//User user = (User)session.getAttribute("resisterUser");

%>


</form>
</body>
</html>