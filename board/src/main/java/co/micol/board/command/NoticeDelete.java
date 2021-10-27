package co.micol.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.board.notice.service.NoticeService;
import co.micol.board.notice.service.NoticeVO;
import co.micol.board.notice.serviceImpl.NoticeServiceImpl;

public class NoticeDelete implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 게시글 삭제 (DB를 타야한다)
		NoticeService noticeDao = new NoticeServiceImpl();
		NoticeVO vo = new NoticeVO();
		vo.setnId(Integer.valueOf(request.getParameter("nId")));
		int n = noticeDao.noticeDelete(vo);
		String viewPage = null;
		if(n != 0) {
			request.setAttribute("message", "삭제가 성공 했습니다.");
			viewPage = "noticeList.do"; //삭제성공시 noticeList로 이동
		}else {
			request.setAttribute("message", "삭제가 실패 했습니다.");
			viewPage = "notice/noticeFail";
		}
		return viewPage;
	}
}