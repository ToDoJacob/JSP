<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function CallEdit(a){
	document.getElementById("modTitle").value = document.getElementById("title").value
	document.getElementById("modContents").value = document.getElementById("contents").value
		if(a =='E') {
			frm.action = "noticeEdit.do";
		}else {
			frm.action = "noticeDelete.do";
		}
		frm.submit();
	}
	
	
</script>
</head>
<body>
	<div align="center">
		<div>
			<h1>Post</h1>
		</div>
		<div>
			<table border="1">
				<tr>
					<th width="70">ROW NUM</th>
					<td width="70" align="center">${notice.nid }</td>
					<th width="100">AUTHOR</th>
					<td width="100" align="center">${notice.name }</td>
					<th width="100">WRITE DATE</th>
					<td width="100" align="center">${notice.writeDate }</td>
					<th width="70">HIT</th>
					<td width="70" align="center">${notice.hit }</td>
				</tr>
				<tr>
					<th>TITLE</th>
					<td colspan="7"><textarea cols="92" id="title" name="title">${notice.title }</textarea></td>
				</tr>
				<tr>
					<th>CONTENTS</th>
					<td colspan="7"><textarea rows="10" cols="92" id="contents" name="contents">${notice.contents }</textarea>
					</td>
				</tr>
			</table>
		</div><br>
		<div>
			<button type="button" onclick="location.href='noticeList.do'">BACK</button>&nbsp;&nbsp;&nbsp;
			<button type="button" onclick="CallEdit('E')">EDIT</button>&nbsp;&nbsp;&nbsp;
			<button type="button" onclick="CallEdit('D')">DELETE</button>
		</div>
		<div>
			<form id="frm" action="" method="post">
				<input type="hidden" id="nId" name="nId" value="${notice.nid }">
				<input type="hidden" id="modTitle" name="modTitle" value="">
				<input type="hidden" id="modContents" name="modContents" value="">
			</form>
		</div>
	</div>
</body>
</html>