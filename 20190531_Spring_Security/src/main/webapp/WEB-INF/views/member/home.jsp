<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	member/home
</h1>
<p>principal : <security:authentication property="principal"/></p>
<p>MemberVo : <security:authentication property="principal.member"/></p>
<p>사용자이름 : <security:authentication property="principal.member.userName"/></p>
<p>사용자아이디 : <security:authentication property="principal.username"/></p>
<p>사용자권한리스트 : <security:authentication property="principal.member.authList"/></p>
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
