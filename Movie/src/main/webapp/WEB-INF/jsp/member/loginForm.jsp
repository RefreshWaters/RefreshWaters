<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>로그인</h1>
<hr>
<form action="login" method="post">
<input type="text" name="id" placeholder="아 이 디"><br>
<input type="password" name="passwd" placeholder="패스워드"><br>
	<input type="submit" value="로그인">
	<input type="button" value="회원가입" onclick="location.href='/member/add'">
</form>
</body>
</html>