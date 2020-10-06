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
<%--
// 	int n = (int)(Math.random()*3)+2; //產生2~4的亂數
	int n = (int)(Math.random()*11)-5; //產生5~-5的亂數
	out.println("n="+n+"<br>") ;
	for(int i =0 ;i<n ;i++){
	
--%>
	<h2>顯示屬性物件的內容</h2>
<%--
	}
--%>

	<h2>顯示屬性物件的內容</h2>
	屬性物件是字串物件: ${StringToken}<br>
	屬性物件是JavaBean: <br>
	編號:${BeanToken.productId}<br>
	名稱:${BeanToken.productName}<br>
	數量:${BeanToken.amount}<br>
	日期:${BeanToken.expire}<br>
	<hr>	
	屬性物件是Map物件: <br>
	鍵值為key001所對應的Value為${MapToken.key001}<br>
	鍵值為key002所對應的Value為一個CustomerBean(JavaBean)<br>

	編號:${MapToken.key002.productId}<br>
	名稱:${MapToken.key002.productName}<br>
	數量:${MapToken.key002.amount}<br>
	日期:${MapToken.key002.expire}<br>
</div>
</body>
</html>