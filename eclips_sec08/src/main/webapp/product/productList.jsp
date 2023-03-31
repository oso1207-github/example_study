<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록</title>
<link rel="stylesheet" type="text/css" href="css/shopping.css">
</head>
<body>
<div id="wrap">
<h1>상품리스트 - 관리지 페이지</h1>

<div id="productWrite">
	<a  href = "productWrite.do">상품등록</a>
</div>

<table border="1" class="list">
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
	    <td>${product.price } 원</td>
	    <td>
	      <a href="productUpdate.do?code=${product.code }">상품수정</a>
	    </td>
	    <td>
	     <a href = "productDelete.do?code=${product.code }">상품 삭제</a>
	    </td>
	  </tr>
  </c:forEach>
  
   
</table>
</div>
</body>
</html>