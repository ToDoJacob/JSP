package co.jacob.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.jacob.prj.comm.Command;
import co.jacob.prj.member.service.MemberService;
import co.jacob.prj.member.serviceImpl.MemberServiceImpl;

public class AjaxMemberList implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// Json Type Data
		MemberService memberDao = new MemberServiceImpl();
		//String members = memberDao.selectMemberList().toString();
		ObjectMapper objectMapper = new ObjectMapper(); //jackson 라이브러리
		String members = null;
		try {
			members = objectMapper.writeValueAsString(memberDao.selectMemberList());
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		members = "{ \"data\" : " +members +"}";
		
		return "ajax:"+members; //ajax:[{"id":"micol","password":"1234"
	}

}
