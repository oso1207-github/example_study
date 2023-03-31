<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
<td> 안녕 ${loginuser.name }(${loginuser.userid })님 </td>
</tr>
<tr>
<td align="center">
<input type="submit" value="로그아웃"> &nbsp;&nbsp;&nbsp;
<input type="button" value="회원정보변경" onClick="location.href='memberUpdate.do?userid=${loginuser.userid }'">
</td>
</tr>
</table>
</form>
</body>
</html>