<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- JSTL(JSP Standard Tag Library)는 표준 태그 라이브러리로 
jsp 페이지에서 일반적인 핵심 기능을 캡슐화하여 제공하는 jsp 태그 컬렉션입니다. -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직원 목록</title>
</head>
<body>
<table class="list">
    <tr>
      <td colspan="5" style="border:white; text-align:right">
        <a href="EmployeesServlet?command=employees_write_form">게시글 등록</a>
      </td>
    </tr>
	<tr>
		<th>아이디</th>
		<th>이름</th>
		<th>등급</th>
		<th>성별</th>
		<th>전화번호</th>
		<th>등록일</th>
	</tr>
	<!-- employees는 배열의 각 항목을 저장할 변수, employeesList는 배열의 이름 -->
	<c:forEach var="employees" items="${employeesList }">
	<tr>
		<td><a href="Employees?command=employees_view&id=${employees.id }">${employees.id }</a></td>
		<td>${employees.name }</td>
		<td>${employees.lev }</td>
		<td>${employees.gender }</td>
		<td>${employees.phone }</td>
		<td><fmt:formatDate value="${employees.enter }"/></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>