package co.micol.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.serviceImpl.MemberServiceImpl;
import co.micol.prj.member.vo.MemberVO;

public class MemberSelect implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		//내정보 세션의 키값이 id인 값을 가지고와야한다.
		HttpSession session = request.getSession();
		MemberService memberDao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setId(String.valueOf(session.getAttribute("id")));
		
		vo = memberDao.memberSelect(vo);
		request.setAttribute("member", vo);
		
		return "member/memberSelect";
	}

}
