package co.micol.prj.member.service;

import java.util.List;

import co.micol.prj.member.vo.MemberVO;

public interface MemberService {
	List<MemberVO> memberSelectList(); //테이블명 + 하는일 + 타입으로 명명
	MemberVO memberSelect(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberUpdate(MemberVO vo);
	int memberDelete(MemberVO vo);
	
	MemberVO memberLogin(MemberVO vo);
	boolean isIdCheck(String id); 
	}
//DAO에서 메소드명과 호출명과 jsp파일명 을 일치 시켜야한다.