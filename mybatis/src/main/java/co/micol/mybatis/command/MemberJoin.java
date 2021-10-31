package co.micol.mybatis.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.micol.mybatis.comm.Command;
import co.micol.mybatis.member.service.MemberService;
import co.micol.mybatis.member.service.MemberVO;
import co.micol.mybatis.member.serviceImpl.MemberServiceImpl;

public class MemberJoin implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		MemberService memberDao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		
		vo.setId(request.getParameter("id"));
		vo.setPassword(request.getParameter("password"));
		vo.setName(request.getParameter("name"));
		vo.setAddress(request.getParameter("address"));
		vo.setTel(request.getParameter("tel"));
		vo.setAuthor(request.getParameter("author"));
		int n = memberDao.memberInsert(vo);
		
		if (n != 0) {
			request.setAttribute("message", "Congratulations! You're became our member.");
			session.setAttribute("id", vo.getId());
			session.setAttribute("author", vo.getAuthor());
			session.setAttribute("name", vo.getName());
		} else {
			request.setAttribute("message", "You failed to sign up.");
			
		}
		return "home.do";
	}

}
