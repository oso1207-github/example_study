<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>addtion</title>
</head>
<body>
고전적인 방식 : 
<%-- 
<%
	int num1 = (Integer) request.getAttribute("num1");
	int num2 = (Integer) request.getAttribute("num2");
	int add = (Integer) request.getAttribute("add");
%>
<%= num1 %> + <%= num2 %> = <%= add %> <br>
--%>

EL방식
${num1 } + ${num2 } = ${add }
</body>
</html>