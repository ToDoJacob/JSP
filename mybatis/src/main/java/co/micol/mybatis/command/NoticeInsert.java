package co.micol.mybatis.command;

import java.sql.Date;
import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.micol.mybatis.comm.Command;
import co.micol.mybatis.notice.service.NoticeService;
import co.micol.mybatis.notice.service.NoticeVO;
import co.micol.mybatis.notice.serviceImpl.NoticeServiceImpl;

public class NoticeInsert implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		NoticeService noticeDao = new NoticeServiceImpl();
		LocalDate now = LocalDate.now();
		NoticeVO vo = new NoticeVO();
		
		
		vo.setId((String)session.getAttribute("id"));
		vo.setName((String)session.getAttribute("name"));
		vo.setWriteDate(Date.valueOf(now));
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
