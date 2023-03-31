<%@page import="java.net.URLEncoder" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%
String userID = request.getParameter("id"); 
String pwd = request.getParameter("pwd");
String loginCheck = request.getParameter("loginCheck");

if(loginCheck.equals("user")){
%>

<jsp:forward page="09_userMain.jsp">
<jsp:param value='<%=URLEncoder.encode("홍길동", "UTF-8") %>' name="userName" />
</jsp:forward>
<% } else { %>
<jsp:forward page="09_managerMain.jsp">
<jsp:param value='<%=URLEncoder.encode("관리자", "UTF-8") %>' name="userName"/>
</jsp:forward>
<% } %> 


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
</body>
</html>