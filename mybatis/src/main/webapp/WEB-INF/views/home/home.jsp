<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div align="center">
	<div><h1>여기는 홈페이지 입니다.</h1></div>
	<a href="memberList.do">멤버목록</a><p>
	<c:if test="${not empty id }">
		<a href="memberSelect.do">내정보 조회</a><p>
	</c:if>
	<a href="noticeList.do">게시글 목록</a><p>
	<a href="memberLoginForm.do">로그인</a>
</div>
</body>
</html>