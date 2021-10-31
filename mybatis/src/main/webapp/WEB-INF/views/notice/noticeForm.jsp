<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../home/header.jsp" />
	<div align="center">
		<div>
			<h1>Writing</h1>
		</div>
		<div>
			<form id="frm" action="noticeInsert.do" method="post">
				<div>
					<table border="1">
						<tr>
							<th width="100">ID</th>
							<td width="150">${id }
							</td>
							<th width="100">USER NAME</th>
							<td width="150">${name }
							</td>
						</tr>
						<tr>
							<th>TITLE</th>
							<td colspan="4"><input type="text" id="title" name="title"></td>
						</tr>
						<tr>
							<th>CONTENTS</th>
							<td colspan="4"><textarea rows="10" cols="55" id="contents"
									name="contents"></textarea></td>
						</tr>
					</table>
				</div>
				<br>
				<div>
					<input type="submit" value="SUBMIT">&nbsp;&nbsp;&nbsp; <input
						type="reset" value="CANCEL">&nbsp;&nbsp;&nbsp; <input
						type="button" value="BACK" onclick="location.href='noticeList.do'">
				</div>
			</form>
		</div>
	</div>
</body>
</html>