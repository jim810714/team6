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
	260
</c:set>
<c:set var='z' value='${x+y}' />
x=${x}<br>
y=${y}<br>
z=${z}<br>

<%-- ${?:} --%>
</body>
</html>