<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>세션값 가져오기</h1>
<%
String id = (String) session.getAttribute("id");
String pwd = (String) session.getAttribute("pwd");
int age = (Integer) session.getAttribute("age");
%>
id = <%=id%> <br>
pwd = <%=pwd%> <br>
age = <%=age%> <br>

// 이름은 모르는데 꺼내오고 싶을때
<h1>이름과 세션값 가져오기</h1>
<%
Enumeration names = session.getAttributeNames();
while (names.hasMoreElements()) {
	String name= names.nextElement().toString();
	String value= session.getAttribute(name).toString();
	out.println(name + " : " + value + "<br>");
}
%>

</body>
</html>