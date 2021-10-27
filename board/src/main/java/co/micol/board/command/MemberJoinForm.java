package co.micol.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberJoinForm implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		//회원가입 폼 호출
		
		return "member/memberJoinForm";
	}

}
