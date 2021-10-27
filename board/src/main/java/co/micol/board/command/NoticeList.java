package co.micol.board.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.board.notice.service.NoticeService;
import co.micol.board.notice.service.NoticeVO;
import co.micol.board.notice.serviceImpl.NoticeServiceImpl;

public class NoticeList implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		//공지사항 목록
		NoticeService noticeDao = new NoticeServiceImpl();
		List<NoticeVO> list = new ArrayList<NoticeVO>();
		list = noticeDao.noticeSelectList();
		request.setAttribute("notices", list); //결과를 담아둔다.
		
		return "notice/noticeList";
	}

}
