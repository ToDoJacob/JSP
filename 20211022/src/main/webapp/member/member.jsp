<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div><h1>여기는 멤버 페이지 입니다.</h1></div>
		<div>
			<%
				String id = request.getParameter("id");
				String password = request.getParameter("password");
			%>
			
			귀하의 아이디는 <%=id %> <br>
			귀하의 패스워드는 <%=password %> <br>
			
		</div>
	</div>
</body>
</html>