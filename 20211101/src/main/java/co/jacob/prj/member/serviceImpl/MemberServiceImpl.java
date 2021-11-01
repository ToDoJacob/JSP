package co.jacob.prj.member.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.jacob.prj.comm.DataSource;
import co.jacob.prj.member.service.MemberMapper;
import co.jacob.prj.member.service.MemberService;
import co.jacob.prj.member.service.MemberVO;

public class MemberServiceImpl implements MemberService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private MemberMapper map = sqlSession.getMapper(MemberMapper.class);
	
	@Override
	public List<MemberVO> selectMemberList() {
		return map.selectMemberList();
	}

	@Override
	public MemberVO selectMember(MemberVO vo) {
		return map.selectMember(vo);
	}

	@Override
	public int insertMember(MemberVO vo) {
		return map.insertMember(vo);
	}

	@Override
	public int updateMember(MemberVO vo) {
		return map.updateMember(vo);
	}

	@Override
	public int deleteMember(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.deleteMember(vo);
	}

}
