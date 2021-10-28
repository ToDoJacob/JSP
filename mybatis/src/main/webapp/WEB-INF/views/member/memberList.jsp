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
	<jsp:include page="../home/header.jsp"></jsp:include>
	<div align="center">
		<div>
			<h1>Member List</h1>
		</div>
		<c:forEach items="${members }" var="member">
	${member.id } : ${member.password } : ${member.name } <br>
		</c:forEach>
	</div>
</body>
</html>