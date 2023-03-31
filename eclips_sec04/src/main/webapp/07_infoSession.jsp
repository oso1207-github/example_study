<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<title>세션의 메소드 활용하기</title>
</head>
<body>
<h1> 세션정보를 얻어오는 메소드 사용하기</h1>
<%
String id_Str = session.getId();
long lasttime = session.getLastAccessedTime();
long createtime = session.getCreationTime();
long time_used = (lasttime - createtime)/60000;
int inactive = session.getMaxInactiveInterval()/60;
boolean b_new = session.isNew();
%>
(1) 세션 ID는 [<%= id_Str %>] <br>
(2) 세션의 마지막 access 타임 [<%= lasttime %>] <br>
(2) 당신이 웹사이트에 머문 시간은 [<%= time_used %>]분 입니다. <br>
(2) 세션의 유효시간은 [<%= inactive %>] <br>
(2) 세션이 새로 만들어졌나요? [<%= b_new %>] <br>
</body>
</html>