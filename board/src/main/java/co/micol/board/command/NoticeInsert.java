package co.micol.board.command;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.board.notice.service.NoticeService;
import co.micol.board.notice.service.NoticeVO;
import co.micol.board.notice.serviceImpl.NoticeServiceImpl;

public class NoticeInsert implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		//게시글 저장
		NoticeService noticeDao = new NoticeServiceImpl();
		NoticeVO vo = new NoticeVO();
		vo.setId(request.getParameter("id"));
		vo.setName(request.getParameter("name"));
		vo.setWriteDate(Date.valueOf(request.getParameter("writeDate"))); //문자열로 넘어오는 writeDate를 Date객체로 포장해주기
		vo.setTitle(request.getParameter("title"));
		vo.setContents(request.getParameter("contents"));
		
		int n = noticeDao.noticeInsert(vo);
		String viewPage = null;
		
		if(n != 0) {
			viewPage = "noticeList.do"; //정상으로 처리가됐으면 목록으로 가기.
		}else {
			request.setAttribute("message", "등록이 실패했습니다.");
			viewPage = "notice/noticeFail";
		}
		return viewPage;
	}

}
