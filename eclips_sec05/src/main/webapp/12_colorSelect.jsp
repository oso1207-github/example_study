<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String[] movieList = {"타이타닉", "아바타2", "킹콩", "헤어질 결심"};
pageContext.setAttribute("movelist", movieList);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${param.color == 1}">
<span style="color:red;">빨강</span>
</c:if>
<c:if test="${param.color == 2}">
<span style="color:yellow;">파랑</span>
</c:if>
<c:if test="${param.color == 3}">
<span style="color:green;">초록</span>
</c:if>

<c:choose>
<c:when test="${param.fruit == 1}">
<h2 style="color:pink;">사과</h2>
</c:when>
<c:when test="${param.fruit == 2}">
<h2 style="color:black;">포도</h2>
</c:when>
<c:when test="${param.fruit == 3}">
<h2 style="color:gray;">메론</h2>
</c:when>
<c:when test="${param.fruit == 4}">
<h2 style="color:orange;">망고</h2>
</c:when>
</c:choose>

<c:forEach var="movie" items="${movelist }" varStatus="status">
${status.index}<br>
${status.count}<br>
${movie }<br>

</c:forEach>


</body>
</html>