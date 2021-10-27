package co.micol.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MemberLogout implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 로그 아웃
		HttpSession session = request.getSession();
		session.invalidate(); //session을 삭제한다.
		return "home.do";
	}

}
