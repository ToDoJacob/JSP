package co.micol.mybatis.member.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.micol.mybatis.comm.DataSource;
import co.micol.mybatis.member.service.MemberMapper;
import co.micol.mybatis.member.service.MemberService;
import co.micol.mybatis.member.service.MemberVO;

public class MemberServiceImpl implements MemberService {
	//연결하고
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	//Mapper활용
	private MemberMapper map = sqlSession.getMapper(MemberMapper.class);
	
	@Override
	public List<MemberVO> memberSelectList() {
		//Mapper 없이 사용할 때
		//return sqlSession.selectList("memberSelectList");
		return map.memberSelectList();
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		
		//return sqlSession.selectOne("memberSelect", vo);
		return map.memberSelect(vo);
	}

	@Override
	public int memberInsert(MemberVO vo) {
		return map.memberInsert(vo);
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		return map.memberUpdate(vo);
	}

	@Override
	public int memberDelete(MemberVO vo) {
		return map.memberDelete(vo);
	}

}
