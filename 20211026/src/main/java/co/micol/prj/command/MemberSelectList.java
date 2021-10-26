package co.micol.prj.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.comm.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.serviceImpl.MemberServiceImpl;
import co.micol.prj.member.vo.MemberVO;

public class MemberSelectList implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		MemberService dao = new MemberServiceImpl();
		List<MemberVO> list = new ArrayList<MemberVO>();
		//추상클래스여서 자기자신을 객체로 못만든다. 그래서 ArrayList로 만든다.
		list = dao.memberSelectList();
		
		request.setAttribute("members", list); //넘어온값을 보여줄 페이지에 전달
												//하기 위해
		return "member/memberSelectList";
	}

}
