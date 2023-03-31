<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Cookie cookie = new Cookie("id", "");
cookie.setMaxAge(0);
response.addCookie(cookie);
%>
<h1>쿠키가 삭제되었습니다.</h1>
<a href="02_getCookies.jsp">삭제 후 쿠키 확인</a>
</body>
</html>