<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
			<h1>My Detail</h1>
		</div>
		${member.id } ${member.name }
	</div>
</body>
</html>