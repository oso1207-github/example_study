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
if(session.getAttribute("loginUser")==null){
	response.sendRedirect("10_loginForm.jsp"); // 우주 안녕
}
else {
	%>
	<%=session.getAttribute("loginUser") %>님 안녕하세요. <br>
	<form method="POST" action="10_logout.jsp">
		<input type="submit" value="로그아웃">
	</form>
<%}%>
</body>
</html>