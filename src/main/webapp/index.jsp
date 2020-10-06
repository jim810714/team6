<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align='center'>
	<h3>JSP練習</h3>	
	<a href="<c:url value='/abc/def' />">顯示屬性物件一</a><br>
	<a href="<c:url value='/abc/xyz' />">顯示屬性物件-二:多個JavaBean形成的List、Array、Map的物件</a><br>
<!-- 	<c:url value='/abc/def' /> -->
</div>
</body>
</html>