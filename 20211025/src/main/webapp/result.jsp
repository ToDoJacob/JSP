<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	입력된 아이디 : <%= request.getParameter("id") %> <p>
	확인해본다 : ${param.id } <P>
	패스워드 : ${param.password } <p>
	
	${ 5 > 3 }
	${ 5 == 3 }
	${ 5 + 3 }
</body>
</html>