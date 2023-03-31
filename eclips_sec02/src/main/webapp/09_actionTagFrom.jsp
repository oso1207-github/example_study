<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="09_actionTagTest.jsp">
<label for="userid"> 아이디 : </label>
<input type="text" name="id" id="uesrid"><br>
<label for="password"> 패스워드 : </label>
<input type="password" name="pwd" id="userpwd"><br>
<input type="radio" name="loginCheck" value="uesr" checked> 사용자
<input type="radio" name="loginCheck" value="manager" checked> 관리자<br>
<input type="submit" value="로그인">
</form>
</body>
</html>