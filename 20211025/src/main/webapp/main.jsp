<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp" />
	<h1>여기는 메인 jsp 입니다.</h1>
	<form id="frm" name="frm" action="result.jsp" method="post">
		사용자 아이디 : <input type="text" id="id" name="id">
		사용자 패스워드 : <input type="password" id="password" name="password">
		<input type="submit" value="로그인">
	</form>
<jsp:include page="footer.jsp" />
</body>
</html>