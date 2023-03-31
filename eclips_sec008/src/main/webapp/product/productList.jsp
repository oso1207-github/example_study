<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/shopping.css">
</head>
<body>
<h2>상품 리스트 - 관리자 페이지</h2>
<a href="../productWrite.do">상품등록</a>
<table border="1">
<tr>
<th>번호</th>
<th>이름</th>
<th>가격</th>
<th>수정</th>
<th>삭제</th>
</tr>
<c:forEach var="product" items="${productList }">
<tr>
<td>${product.code }</td>
<td>${product.name }</td>
<td>${product.price }원</td>
<td>
<a href="productUpdate.do?code=${product.code }">상품수정</a>
</td>
<td>
<a href="productDelete.do?code=${product.code }">상품삭제</a>
</td>
</tr>
</c:forEach>
</table>
</body>
</html>