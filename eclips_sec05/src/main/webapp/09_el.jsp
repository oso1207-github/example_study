<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 방법 1 -->
<!-- 
<jsp:useBean id="member" class="com.keduit.MemberBean"/>
<jsp:setProperty property="*" name="member"/>
 -->
 

 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

이름 : ${member.name }<br>
아아디 : ${member.userid }<br>
별명 : ${member.nickname }<br>
비밀번호 : ${member.pwd }<br>
이메일 : ${member.email }<br>
전화번호 : ${member.phone }<br>


</body>
</html>