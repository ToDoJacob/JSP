package co.micol.mager.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.mager.comm.Command;
import co.micol.mager.member.service.MemberService;
import co.micol.mager.member.serviceImpl.MemberServiceImpl;
import co.micol.mager.member.vo.MemberVO;

public class MemberSelectList implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		//멤버 목록 가져오기
		MemberService memberDao = new MemberServiceImpl();
		List<MemberVO> list = new ArrayList<MemberVO>();
		list = memberDao.memberSelectList();
		
		request.setAttribute("members", list); //결과를 request객체에 키와 벨류로 담음
		return "member/memberSelectList";
	}

}
