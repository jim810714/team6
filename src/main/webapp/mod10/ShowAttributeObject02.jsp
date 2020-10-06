<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>顯示屬性物件的JSP網頁</title>
</head>
<body>
<div align='center'>
	<h2>顯示屬性物件的內容</h2>
	屬性物件是元素是JavaBean的List物件:<br>
	<table border='1'>
	<tr><th>編號</th><th>名稱</th><th>數量</th><th>日期</th></tr>
	<c:forEach var='BeanToken' items='${ListToken}' varStatus='var'>
		<c:choose>
		<c:when test="${vs.count%2==0}">
			<c:set var='color' value='#8CFFFF'/>
		</c:when>
		<c:otherwise>
			<c:set var='color' value='#78FF78'/>
		</c:otherwise>
	</c:choose>
		<tr bgcolor='${color}'>		
			<td>${BeanToken.productId}</td>
			<td>${BeanToken.productName}</td>
			<td>${BeanToken.amount}</td>
			<td>${BeanToken.expire}</td>
		</tr>
	</c:forEach>
	</table>
	
<hr>
	<h2>顯示屬性物件的內容</h2>
	屬性物件是元素是JavaBean的Array物件:<br>
	<table border='1'>
	<tr><th>編號</th><th>名稱</th><th>數量</th><th>日期</th></tr>
	<c:forEach var='BeanToken' items='${ArrayToken}' varStatus='var'>
		<c:choose>
		<c:when test="${vs.count%2==0}">
			<c:set var='color' value='#8CFFFF'/>
		</c:when>
		<c:otherwise>
			<c:set var='color' value='#78FF78'/>
		</c:otherwise>
	</c:choose>
		<tr bgcolor='${color}'>		
			<td>${BeanToken.productId}</td>
			<td>${BeanToken.productName}</td>
			<td>${BeanToken.amount}</td>
			<td>${BeanToken.expire}</td>
		</tr>
	</c:forEach>
	</table>	
	
	<hr>

	<h2>顯示屬性物件的內容</h2>
	屬性物件是元素是JavaBean的Map物件:<br>
	<table border='1'>
	<tr><th>Key</th><th>編號</th><th>名稱</th><th>數量</th><th>日期</th></tr>
	<c:forEach var='entry' items='${MapToken}' varStatus='var'>
		<c:choose>
		<c:when test="${vs.count%2==0}">
			<c:set var='color' value='#8CFFFF'/>
		</c:when>
		<c:otherwise>
			<c:set var='color' value='#78FF78'/>
		</c:otherwise>
	</c:choose>
		<tr bgcolor='${color}'>
			<td>${entry.key}</td>		
			<td>${entry.value.productId}</td>
			<td>${entry.value.productName}</td>
			<td>${entry.value.amount}</td>
			<td>${entry.value.expire}</td>
		</tr>
	</c:forEach>
	</table>
	
	
</div>
</body>
</html>