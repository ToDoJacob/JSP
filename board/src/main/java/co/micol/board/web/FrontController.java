package co.micol.board.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.board.command.Command;
import co.micol.board.command.HomeCommand;
import co.micol.board.command.MemberJoin;
import co.micol.board.command.MemberJoinForm;
import co.micol.board.command.MemberLogin;
import co.micol.board.command.MemberLoginForm;
import co.micol.board.command.MemberLogout;
import co.micol.board.command.MemberSelect;
import co.micol.board.command.MemberSelectList;
import co.micol.board.command.NoticeDelete;
import co.micol.board.command.NoticeEdit;
import co.micol.board.command.NoticeForm;
import co.micol.board.command.NoticeInsert;
import co.micol.board.command.NoticeList;
import co.micol.board.command.NoticeSelect;

public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private HashMap<String,Command> map = new HashMap<String,Command>();
    
    public FrontController() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
		// 수행할 Command를 넣어 두는 곳
		map.put("/home.do", new HomeCommand()); //홈
		map.put("/noticeList.do",  new NoticeList()); //공지사항 목록
		map.put("/noticeSelect.do",  new NoticeSelect()); // 하나의 게시물 조회
		map.put("/noticeForm.do", new NoticeForm()); //게시글입력 폼
		map.put("/noticeInsert.do", new NoticeInsert()); //게시글 등록
		map.put("/noticeDelete.do", new NoticeDelete()); //게시글 삭제
		map.put("/noticeEdit.do", new NoticeEdit()); //게시글 수정
		//로그인 부분 가지고온것.
		map.put("/memberSelectList.do", new MemberSelectList());//멤버목록
		map.put("/memberLoginForm.do", new MemberLoginForm()); //로그인 폼 호출
		map.put("/memberLogin.do", new MemberLogin()); //로그인 처리
		map.put("/memberLogout.do", new MemberLogout()); //로그아웃 처리
		map.put("/memberJoinForm.do", new MemberJoinForm()); //회원가입 폼 호출
		map.put("/memberJoin.do", new MemberJoin()); //회원가입 처리
		map.put("/memberSelect.do", new MemberSelect()); //나의정보 호출
		
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//요청을 분석하고 , 수행할 command를 찾아 실행하고 결과를 보여줄 페이지를 선택한다.
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String page = uri.substring(contextPath.length());
		
		System.out.println(page);
		Command command = map.get(page);
		
		System.out.println(command);
		String viewPage = command.run(request, response);
		
		if(!viewPage.endsWith(".do")) {
			viewPage = "WEB-INF/views/" + viewPage + ".jsp";
		}
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}
