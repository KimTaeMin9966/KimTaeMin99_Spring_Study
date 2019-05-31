<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Insert title here</title>
</head>
<body>
	<h1>Custom Login Page</h1>
	<form method="post">
		<input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }" />
		<input type="submit" value="로그아웃" />
	</form>
</body>
</html>