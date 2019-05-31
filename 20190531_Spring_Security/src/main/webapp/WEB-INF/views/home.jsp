<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<security:authorize access="isAnonymous()">
	<a href="/member/login">로그인</a>
</security:authorize>
<security:authorize access="isAuthenticated()">
	<a href="/member/home">member</a>
	<a href="/shop/home">shop</a>
	<a href="/management/home">management</a>
	<a href="/member/logout">logout</a>
</security:authorize>
</body>
</html>
