<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:include page="../home/header.jsp" />
<body>
	<div align="center">
		<div>
			<h1>내 정보</h1>
		</div>
		<div>
			<table border="1">
					<tr>
						<th width="100">아이디</th>
						<td width="250">${member.id }</td>
					</tr>
					<tr>
						<th width="100">이 름</th>
						<td width="250">${member.name }</td>
					</tr>
					<tr>
						<th width="100">주 소</th>
						<td width="250">${member.address }</td>
					</tr>
					<tr>
						<th width="100">전화번호</th>
						<td width="250">${member.tel }</td>
					</tr>
					<tr>
						<th width="100">권 한</th>
						<td width="250">${member.author }</td>
					</tr>
			</table>
		</div>
	</div>
</body>
</html>