<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="12_colorSelect.jsp">
<label for="color">색상을 성택하세요</label><br>
<select id="color" name="color">
<option value="1"> 빨강 </option>
<option value="2"> 파 </option>
<option value="3"> 노</option>
<option value="4"> 초 </option>
</select>
<p><p>

<label for="fruit">과일을 성택하세요</label><br>
<select id="fruit" name="fruit">
<option value="1"> 사과 </option>
<option value="2"> 메론 </option>
<option value="3"> 망고 </option>
<option value="4"> 참외 </option>
</select><br><br>
<input type="submit" value="전송">
</form>
</body>
</html>