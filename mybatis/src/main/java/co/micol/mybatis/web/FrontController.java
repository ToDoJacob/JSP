package co.micol.mybatis.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.mybatis.comm.Command;
import co.micol.mybatis.command.HomeCommand;
import co.micol.mybatis.command.MemberJoinForm;
import co.micol.mybatis.command.MemberList;
import co.micol.mybatis.command.MemberLogin;
import co.micol.mybatis.command.MemberLoginForm;
import co.micol.mybatis.command.MemberLogout;
import co.micol.mybatis.command.MemberSelect;
import co.micol.mybatis.command.NoticeList;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, Command> map = new HashMap<String, Command>();
	 
    public FrontController() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
		map.put("/home.do", new HomeCommand());
		map.put("/memberList.do", new MemberList()); //멤버목록
		map.put("/memberSelect.do", new MemberSelect()); //한명 검색
		map.put("/noticeList.do", new NoticeList()); //게시글 목록
		map.put("/memberLoginForm.do", new MemberLoginForm()); //로그인폼 호출
		map.put("/memberLogin.do", new MemberLogin()); //로그인 처리
		map.put("/memberLogout.do", new MemberLogout()); //로그 아웃
		map.put("/memberJoinForm.do", new MemberJoinForm()); //회원가입폼 호출
		
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String page = uri.substring(contextPath.length());
		
		Command command = map.get(page);
		
		String viewPage = command.run(request, response);
		
		if(!viewPage.endsWith(".do")) {
			viewPage = "WEB-INF/views/" + viewPage + ".jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}
