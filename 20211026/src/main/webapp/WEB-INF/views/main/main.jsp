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
<div align="center">
	<div>
		<h1>홈 페이지</h1>
	</div>
	<div>
		<a href="memberLoginForm.do">로그인</a>
		<c:if test="${not empty id }">
			<a href="memberSelectList.do">멤버 목록</a>
		</c:if>
	</div>
</div>
</body>
</html>