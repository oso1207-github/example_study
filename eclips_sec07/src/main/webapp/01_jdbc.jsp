<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3> DB 연동 </h3>
<%
	Context initContext = new InitialContext();
	Context envContext  = (Context)initContext.lookup("java:/comp/env");
	DataSource ds = (DataSource)envContext.lookup("jdbc/TestDB");
	Connection conn = ds.getConnection();
	out.println("DB 연동 성공!");
%>

</body>
</html>