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
			<h1>Join</h1>
		</div>
		<div>
			<form id="frm" action="memberJoin" method="post">
				<table border="1">
					<tr>
						<th width="150">ID</th>
						<td  width="250">
							<input type="text" id="id" name="id" required="required">
						</td>
					</tr>
					<tr>
						<th width="150">Password</th>
						<td  width="250">
							<input type="password" id="password" name="password" required="required">
						</td>
					</tr>
					<tr>
						<th width="150">Password</th>
						<td  width="250">
							<input type="password" id="password2" name="password2" required="required">
						</td>
					</tr>
					<tr>
						<th width="150">Name</th>
						<td  width="250">
							<input type="text" id="name" name="name" required="required">
						</td>
					</tr>
					<tr>
						<th width="150">Address</th>
						<td  width="250">
							<input type="text" id="address" name="address">
						</td>
					</tr>
					<tr>
						<th width="150">TEL</th>
						<td  width="250">
							<input type="text" id="tel" name="tel">
						</td>
					</tr>
				</table>
				<br>
					<input type="hidden" id="author" name="author" value="USER">
					<input type="button" value="JOIN" >&nbsp;&nbsp;&nbsp;
					<input type="reset" value="CANCEL">
			</form>
		</div>
		
	</div>
</body>
</html>