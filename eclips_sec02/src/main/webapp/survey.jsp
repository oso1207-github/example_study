<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
label { display : inline-block; width:150px; }
</style>
</head>
<body>
<h1>설문 조사</h1>
<form method="get" action="survey2.jsp">
<label for="name"> 이름 : </label>
<input type="text" name="name"><br>


<label for="gender"> 성별 : </label>
<input type="radio" id="gender" name="gender" value="male" checked>남자
<input type="radio" id="gender" name="gender" value="girl" >여자 <br>

<label for="likeseason"> 좋아하는 계절 : </label>
<input type="checkbox" name="season" value="봄"> 봄
<input type="checkbox" name="season" value="여름"> 여름
<input type="checkbox" name="season" value="가을"> 가을
<input type="checkbox" name="season" value="겨울"> 겨울<br>
<input type="submit" value="전송"> <input type="reset" value="취소"><br>
</form>
</body>
</html>