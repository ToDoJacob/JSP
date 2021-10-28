package co.micol.mybatis.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.mybatis.comm.Command;
import co.micol.mybatis.notice.service.NoticeService;
import co.micol.mybatis.notice.serviceImpl.NoticeSeviceImpl;

public class NoticeList implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		NoticeService noticeDao = new NoticeSeviceImpl();
		request.setAttribute("notices", noticeDao.noticeSelectList());
		
		return "notice/noticeList";
	}

}
