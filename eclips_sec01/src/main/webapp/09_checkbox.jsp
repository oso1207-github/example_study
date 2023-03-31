<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> 악세사리</h2>
관심항목을 선택하세요
<hr>
<form method="get" action="CheckboxServlet">
<input type="checkbox" name="item" value="신발"> 신발
<input type="checkbox" name="item" value="가방"> 가방
<input type="checkbox" name="item" value="벨트"> 벨트 <br>
<input type="checkbox" name="item" value="모자"> 모자
<input type="checkbox" name="item" value="시계"> 시계
<input type="checkbox" name="item" value="쥬얼리"> 쥬얼리 <br>
<input type="submit" value="전송"> <br>

<span style="float:left; margin-right:20px">
	<label for="job">직업</label>
	<select id="job" name="job" size="1">
	<option value="">선택하세요.</option>
	<option value="학생">학생</option>
	<option value="경찰">경찰</option>
	<option value="소방관">소방관</option>
	<option value="선생님">선생님</option>
	<option value="판사">판사</option>
	<option value="검사">검사</option>
	<option value="의사">의사</option>
	 
</select>

</span>
	<label for="interest" style="float:left">취미</label>
	<select id="interest" name="interest" size="5" multiple="multiple">
	<option value="">선택하세요.</option>
	<option value="축구">축구</option>
	<option value="야구">야구</option>
	<option value="농구">농구</option>
	<option value="족구">족구</option>
	<option value="피구">피구</option>
	 
</select>
<br>

<input type="submit" value="전송" style="clear:both; margin-left:50px">
</form>
</body>
</html>