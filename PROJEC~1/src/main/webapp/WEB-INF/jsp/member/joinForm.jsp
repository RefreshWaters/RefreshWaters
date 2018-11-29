<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
<h1>회원가입</h1>
<hr>
<form action="add" method="post">
	<input type="text" name="mb_ID" placeholder="아이디를 입력하세요">
	<!-- <span id="dupIdMsg"></span> -->
	<br>
	<input type="password" name="mb_passwd" placeholder="패스워드를 입력하세요"><br>
	<input type="text" name="mb_name" placeholder="이름을 입력하세요"><br>
	<input type="email" name="mb_email" placeholder="ex)email@.com"><br>
	<input type="text" name="mb_phone" placeholder="ex)010-4567-1234"><br>
	<input type="hidden" name="mb_grade" value="bronze">
	<input type="hidden" name="mb_point" value="1000">
	<input type="submit" value="등록">
</form>
</body>
</html>