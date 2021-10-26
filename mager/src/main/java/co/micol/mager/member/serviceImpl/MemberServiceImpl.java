package co.micol.mager.member.serviceImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.micol.mager.comm.DAO;
import co.micol.mager.member.service.MemberService;
import co.micol.mager.member.vo.MemberVO;

public class MemberServiceImpl extends DAO implements MemberService {
	private PreparedStatement psmt;
	private ResultSet rs;
	
	
	@Override
	public List<MemberVO> memberSelectList() { //전체 멤버 조회
		List<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO vo;
		String sql = "select * from member";
		
		try {
			psmt = conn.prepareStatement(sql);
			
			rs = psmt.executeQuery();
			while(rs.next()) {
				vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setPassword(rs.getString("password"));
				vo.setName(rs.getString("name"));
				vo.setAddress(rs.getString("address"));
				vo.setTel(rs.getString("tel"));
				vo.setAuthor(rs.getString("author"));
				list.add(vo);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return list;
	}

	private void close() {
		try {
			if(rs != null) rs.close();
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) { //멤버 한명 조회
		String sql = "select * from member where id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			rs = psmt.executeQuery();
			if(rs.next()) {
				vo.setId(rs.getString("id"));
				vo.setPassword(rs.getString("password"));
				vo.setName(rs.getString("name"));
				vo.setAddress(rs.getString("address"));
				vo.setTel(rs.getString("tel"));
				vo.setAuthor(rs.getString("author"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return vo;
	}

	@Override
	public int memberInsert(MemberVO vo) { //멤버 등록
		int n = 0;
		String sql = "insert into member values(?,?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPassword());
			psmt.setString(3, vo.getName());
			psmt.setString(4, vo.getAddress());
			psmt.setString(5, vo.getTel());
			psmt.setString(6, vo.getAuthor());
			
			n = psmt.executeUpdate();
		}catch (SQLException e){
			e.printStackTrace();	
		}finally {
			close();
		}
		return n;
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int memberDelete(MemberVO vo) { //멤버 삭제
		int n = 0;
		String sql = "delete from member where id = ?";
		try {
			psmt = conn.prepareStatement(sql);
					psmt.setString(1, vo.getId());
			n = psmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return n;
	}

}
