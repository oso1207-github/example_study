<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="script/member.js"></script>
</head>
<body>
<h1>회원정보 입력</h1>
<form action="join.do" method="post" name="frm">
<table>
<tr>
<td>이름</td>
<td>	<input type="text" name="name" id="name" size="20"></td>
</tr>
<tr>
<td>아이디</td>
<td>	<input type="text" name="userid" id="userid">
<input type="hidden" name="reid" size="20">
<input type="button" value="중복 체크" onclick="idCheck()">
</td>
</tr>
<tr>
<td>비밀번호</td>
<td><input type="password" name="pwd" id="pwd" size="20"><br></td>
</tr>
<tr>
<td>비밀번호 확인</td>
<td><input type="password" name="pwd" id="pwd" size="20"></td>
</tr>
<tr>
<td>이메일</td>
<td><input type="text" name="email" id="email" size="20"></td>
</tr>
<tr>
<td>전화번호</td>
<td><input type="text" name="phone" id="phone" size="20"></td>
</tr>
<tr>
<td>등급</td>
<td>
<input type="radio" name="admin" value="0" checked> 일반회원
<input type="radio" name="admin" value="1" > 관리자<br></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" value="확인" onclick="return joinCheck()">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
<input type="reset" value="취소">
</td>
</tr>
<tr>
<td colspan="2"${message }></td>
</tr>
</table>
</form>
</body>
</html>