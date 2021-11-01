package co.jacob.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.jacob.prj.comm.Command;
import co.jacob.prj.member.service.MemberService;
import co.jacob.prj.member.service.MemberVO;
import co.jacob.prj.member.serviceImpl.MemberServiceImpl;

public class memberLogin implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		MemberService memberDao = new MemberServiceImpl();
		System.out.println(request.getParameter("id"));
		MemberVO vo = new MemberVO();
		vo.setId(request.getParameter("id"));
		vo.setPassword(request.getParameter("password"));
		vo = memberDao.selectMember(vo);
		String viewPage = null;
		if(vo != null) {
			session.setAttribute("id", vo.getId());
			session.setAttribute("name", vo.getName());
			session.setAttribute("author", vo.getAuthor());
			viewPage = "home.do";
		}else {
			viewPage = "memberLoginForm.do";
		}
		
		return viewPage;
	}

}
