package co.micol.mybatis.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.mybatis.comm.Command;
import co.micol.mybatis.notice.service.NoticeService;
import co.micol.mybatis.notice.service.NoticeVO;
import co.micol.mybatis.notice.serviceImpl.NoticeServiceImpl;

public class NoticeSelect implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		NoticeService noticeDao = new NoticeServiceImpl();
		NoticeVO vo = new NoticeVO();
		vo.setNid(Integer.valueOf(request.getParameter("nid")));
		noticeDao.hitUpdate(vo);
		vo = noticeDao.noticeSelect(vo);
		request.setAttribute("notice", vo);
				
		return "notice/noticeSelect";
	}

}
