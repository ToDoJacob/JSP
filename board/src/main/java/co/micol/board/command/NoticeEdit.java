package co.micol.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.board.notice.service.NoticeService;
import co.micol.board.notice.service.NoticeVO;
import co.micol.board.notice.serviceImpl.NoticeServiceImpl;

public class NoticeEdit implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		//게시글 수정 (DB를 타야한다)
		NoticeService noticeDao = new NoticeServiceImpl();
		NoticeVO vo = new NoticeVO();
		
		vo.setnId(Integer.valueOf(request.getParameter("nId")));
		vo.setTitle(request.getParameter("modTitle"));
		vo.setContents(request.getParameter("modContents"));
		
		int n = noticeDao.noticeUpdate(vo);
		String viewPage = null;
		if(n != 0) {
			request.setAttribute("message", "수정이 완료 되었습니다.");
			request.setAttribute("notice", vo);
			viewPage = "/noticeList.do";
		}else {
			request.setAttribute("message", "수정이 실패 하였습니다.");
			viewPage = "notice/noticeFail";
		}
		
		
		return viewPage;
	}

}
