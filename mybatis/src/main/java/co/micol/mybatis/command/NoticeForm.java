package co.micol.mybatis.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.micol.mybatis.comm.Command;

public class NoticeForm implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		
		request.setAttribute("id", session.getAttribute("id"));
		request.setAttribute("name", session.getAttribute("name"));
		
		return "notice/noticeForm";
	}

}
