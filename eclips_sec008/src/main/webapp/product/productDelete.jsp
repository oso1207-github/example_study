<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품등록</title>
<link rel="stylesheet" type="text/css" href="css/shopping.css">
<script type="text/javascript" src="script/product.js"></script>
</head>
<body>
<div id="wrap">
<h1>상품삭제 - 관리자 페이지</h1>
<form method="post" action="productDelete.do">
<table>
<tr>
<td>
<c:choose>
	<c:when test="${empty product.pictureUrl }">
		<img src="upload/rero.jpg">
		</c:when>
		<c:otherwise>
		<img src="upload/${product.pictureUrl }">
		</c:otherwise>
</c:choose>
</td>
</tr>
<tr>
<th> 상 품 명</th>
<td> <input type="text" name="name" size="80" value="${product.name }"></td>
</tr>
<tr>
<th> 가 격</th>
<td> <input type="text" name="price" value="${product.price }">원</td>
</tr>
<tr>
<th> 이 미 지</th>
<td> <input type="file" name="pictureurl"  value="${product.name }"><br>
(주의사항 : 이미지를 변경하고자 할때만 선택하세요.)
</td>
</tr>
<tr>
<th> 설 명 </th>

<td>
<!-- textarea는 텍스트의 길이가 길때 사용 -->
<textarea cols="80" rows="10" name="${product.description }"></textarea>
</td>
</tr>
</table>
<br>
<input type="hidden" name="code" value="${product.code }">
<input type="submit" value="삭제">
<input type="button" value="목록" onclick="location.href='productList.do'">

</form>
</div>
</body>
</html>