package co.micol.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.board.notice.service.NoticeService;
import co.micol.board.notice.service.NoticeVO;
import co.micol.board.notice.serviceImpl.NoticeServiceImpl;

public class NoticeSelect implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		//하나의 게시글을 조회 , 세부내용 보기
		NoticeService noticeDao = new NoticeServiceImpl();
		NoticeVO vo = new NoticeVO();
		vo.setnId(Integer.valueOf(request.getParameter("nid"))); //String값을 Integer객체화 시켜주는 함수
		vo = noticeDao.noticeSelect(vo);
		request.setAttribute("notice", vo);
				
		return "notice/noticeSelect";
	}

}
