<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${empty loginUser }">
  <jsp:forward page="login.do"/>
</c:if>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 전용 페이지</title>
</head>
<body>
<h2>회원 전용 페이지</h2>
<form action="logout.do">
	<table>
		<tr>
		  <td> 안녕하세요. ${loginUser.name }(${loginUser.userid })님 </td>
		</tr>
		<tr>
		  <td align="center">
		    <input type="submit" value="로그아웃" > &nbsp;&nbsp;&nbsp;
		    <input type="button" value="회원정보변경" 
		           onClick="location.href='memberUpdate.do?userid=${loginUser.userid}'" >
		  </td>
		</tr>
	</table>
</form>
</body>
</html>