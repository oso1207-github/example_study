<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");%>
<jsp:useBean id="member" class="com.keduit.MemberBean"/>
<jsp:setProperty property="*" name="member"/>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원정보</h1>
이름 : <jsp:getProperty property="name" name="member"/><br>
아이디 : <jsp:getProperty property="userid" name="member"/><br>
별명 : <jsp:getProperty property="nickname" name="member"/><br>
비밀번호 : <jsp:getProperty property="pwd" name="member"/><br>
이메일 : <jsp:getProperty property="email" name="member"/><br>
전화번호 : <jsp:getProperty property="phone" name="member"/><br>

</body>
</html>