package co.micol.mybatis.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.micol.mybatis.comm.Command;
import co.micol.mybatis.member.service.MemberService;
import co.micol.mybatis.member.service.MemberVO;
import co.micol.mybatis.member.serviceImpl.MemberServiceImpl;

public class MemberLogin implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		MemberService memberDao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		
		vo.setId(request.getParameter("id"));
		vo.setPassword(request.getParameter("password"));
		vo = memberDao.memberSelect(vo);
		if(vo != null) {
			request.setAttribute("message", "Welcome !"+vo.getName());
			session.setAttribute("id", vo.getId());
			session.setAttribute("author", vo.getAuthor());
			session.setAttribute("name", vo.getName());
			
		}else {
			request.setAttribute("message", "ID or PASSWORD is incorrect.");
		}
		return "member/memberLogin";
	}

}
