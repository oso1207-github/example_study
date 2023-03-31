<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
input { padding-top:2px; padding-left:0px;}
div { display : inline-block; width:150px; }
</style>
</head>
<body>

<form name="frm" method="get" action="SignUpServlet">
<div>이름</div> <input type="text" name="name"><br>
<div>주민등록번호</div> <input type="text" name="renumber1"> - <input type="text" name="renumber2"><br>
<div>아이디</div> <input type="text" name="id"><br>
<div>비밀번호</div> <input type="password" name="password"><br>
<div>비밀번호 확인</div> <input type="password" name="passwordcheck"><br>
<div>이메일</div> <input type="text" name="email1"> @ <input type="text" name="email2">
	<select id="emaillist" name="emaillist" size="1">
	<option value="nate.com">nate.com</option>
	<option value="naver.com">naver.com</option>
	<option value="daum.net">daum.net</option>
	<option value="yahoo.co.kr">yahoo.co.kr</option>
	</select><br>
<div>우편번호</div> <input type="text" name="zipcode"><br>
<div>주소</div> <input type="text" name="address1"> <input type="text" name="address2"><br>
<div>핸드폰 번호</div> <input type="text" name="phonenumber"><br>
<div>직업</div> <select id="job" name="job" size="3">
	<option value="">선택하세요.</option>
	<option value="학생">학생</option>
	<option value="경찰">경찰</option>
	<option value="소방관">소방관</option>
	<option value="선생님">선생님</option>
	<option value="판사">판사</option>
	<option value="검사">검사</option>
	<option value="의사">의사</option> </select> <br>
	
<div>이메일/sns 동의 여부</div> <input type="radio" id="chk_mail" name="chk_mail" value="yes" checked>수신 <input type="radio" id="chk_mail" name="chk_mail" value="no" >거부 <br><br>
<input type="submit" value="회원가입" onclick="return check()" style="float:right">
</form>

</body>
</html>