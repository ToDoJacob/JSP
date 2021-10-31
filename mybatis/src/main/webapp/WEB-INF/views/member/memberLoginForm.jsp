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
			<h1>Login</h1>
		</div>
		<div>
			<form id="frm" action="memberLogin.do" method="post">
			<div>
			<table border="1">
				<tr>
					<th width="150">ID</th>
					<td width="200"><input type="text" id="id" name="id" required="required"
					></td>
				</tr>
				<tr>
					<th width="150">PASSWORD</th>
					<td width="200"><input type="password" id="password" name="password"
						required="required"></td>
				</tr>
			</table>
			</div><br>
				<input type="submit" value="로그인">
			</form>
		</div>
	</div>

</body>
</html>