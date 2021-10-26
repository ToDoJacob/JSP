<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
<div align="center">
	<div><h1>로 그 인</h1></div>
	<div>
		<form id="frm" name="frm" action="memberLogin.do" method="post">
			<div>
				<table border="1">
					<tr>
						<th width="150">아 이 디</th>
						<td width="200">
							<input type="text" id="id" name="id" required="required" placeholder="아이디를 입력하세요.">
						</td>
					</tr>
					<tr>
						<th width="150">패스워드</th>
						<td width="200">
							<input type="password" id="password" name="password" required="required" placeholder="패스워드를 입력하세요.">
						</td>
					</tr>
				</table>
			</div><br>
			<div>
				<input type="submit" value="로그인"> &nbsp;&nbsp;&nbsp;
				<input type="reset" value="취 소">&nbsp;&nbsp;&nbsp;
				<input type="button" value="홈 가기" onclick="location.href='main.do'">
			</div>
		</form>
	</div>
</div>
</body>
</html>