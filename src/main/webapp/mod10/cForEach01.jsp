<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var='sum' value='0'/>
<c:forEach var='x' begin='1' end='100'>
	<c:set var='sum' value='${sum+x}'/>
sum=${sum},x=${x}<br>
</c:forEach>
</body>
</html>