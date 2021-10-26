package co.micol.prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8"); //리스폰스할때 한글 깨짐 방지
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		out.println("<h1> 귀하의 아이디는 " + id + "입니다. </h1>");
		out.println("<h1> 귀하의 패스워드는 " + password + "입니다. </h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
