package co.jacob.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.jacob.prj.comm.Command;

public class RegisterForm implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		return "member/registerForm";
	}

}
