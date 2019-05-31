<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Insert title here</title>
</head>
<body>
	<h1>Custom Login Page</h1>
	<h2><c:out value="${error }" /></h2>
	<h2><c:out value="${logout }" /></h2>
	<form action="/login" method="post">
		<input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }" />
		<div>
			<input type="text" name="username" />
		</div>
		<div>
			<input type="password" name="password" />
		</div>
		<div>
			<input type="checkbox" name="remember-me" /> remember me
		</div>
		<div>
			<input type="submit" value="로그인" />
		</div>
	</form>
</body>
</html>