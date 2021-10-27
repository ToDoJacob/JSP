<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항</title>
<script type="text/javascript">
	function CallNotice(n){
		frm.nid.value = n;
		frm.submit();
	}
</script>
</head>
<body>
<jsp:include page="../home/header.jsp" />
<div align="center">
	<div><h1>공지사항</h1></div>
	<div>
		<table border="1">
			<tr>
				<th width="100">글번호</th>
				<th width="150">작성자</th>
				<th width="250">제 목</th>
				<th width="150">작성일자</th>
				<th width="100">조회수</th>
			</tr>
			
			<c:forEach items="${notices }" var="notice">
				<tr onmouseover='this.style.background="#fcecae";' onmouseleave='this.style.background="#FFFFFF";' onclick="CallNotice(${notice.nId })">
					<td align="center">${notice.nId }</td>
					<td align="center">${notice.name }</td>
					<td align="center">${notice.title }</td>
					<td align="center">${notice.writeDate }</td>
					<td align="center">${notice.hit }</td>
				</tr>
			</c:forEach>
		</table>
	</div><br>
	<div>
		<button type="button" onclick="location.href='noticeForm.do'">글쓰기</button> &nbsp;&nbsp;&nbsp;
		<button type="button" onclick="location.href='home.do'">홈가기</button>
	</div>
	<div><!-- 숨겨져 있는 폼 -->
		<form id="frm" action="noticeSelect.do" method="post">
			<input type="hidden" id="nid" name="nid">
		</form>
	</div>
</div>
</body>
</html>