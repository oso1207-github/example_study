<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%-- 이 페이지는 에러 페이지입니다. --%>
<!-- error.jsp에 표시해야함  -->
<%@ page isErrorPage = "true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
다음과 같이 에러가 발생했습니다.
<%= exception.getMessage() %>
</body>
</html>