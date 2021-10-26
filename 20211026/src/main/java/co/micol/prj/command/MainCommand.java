package co.micol.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.comm.Command;

public class MainCommand implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		return "main/main";
	}

}
