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
<c:set var='x' value='100' />
<c:set var='y' >
	<script>alert('你ㄉ瀏覽Qi中讀了');</script>
</c:set>

x-1=${x}<br>
x-2=<c:out value='${x}'/><br>
<hr>
y-1=${y}<br>
y-2=<c:out value='${y}'/><br>

<%-- ${?:} --%>
</body>
</html>