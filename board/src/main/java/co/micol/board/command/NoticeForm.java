package co.micol.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NoticeForm implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		//글쓰기 폼 호출
		
		return "notice/noticeForm";
	}

}
