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
<c:set var='sum' value='0' />

<c:forEach var='x' begin='1' end='9' step='1' varStatus='vs'>
	<c:if test="${vs.first}">
		<c:out value="<table border='1'>" escapeXml='false'/>
		<tr>
			<th colspan='9'>九九乘法表</th>
			<th>first</th><th>last</th><th>數量</th><th>單價</th><th>小計</th>	
		</tr>
	</c:if>	
	<c:choose>
		<c:when test="${vs.count%2==0}">
			<c:set var='color' value='#8CFFFF'/>
		</c:when>
		<c:otherwise>
			<c:set var='color' value='#78FF78'/>
		</c:otherwise>
	</c:choose>
	
	<tr bgcolor='${color}'>
	<c:forEach var='y' begin='1' end='9'>	
		<td>${y}*${x}=${x*y}</td>
	</c:forEach>
	<td>${vs.first}</td>
	<td>${vs.last}</td>
	<td>${vs.index}</td>
	<td>${vs.count}</td>
	<td>${vs.index*vs.count}</td>
	<c:set var='sum' value='${sum+vs.index*vs.count}' />
	
	</tr>
	<c:if test="${vs.last}">
		<tr><td colspan='14' align='right'>金額總計:${sum}</td></tr>
	<c:out value="</table>" escapeXml='false'/>
	</c:if>	
</c:forEach>
</body>
</html>