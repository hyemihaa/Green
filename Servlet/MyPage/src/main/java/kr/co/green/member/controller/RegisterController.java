package kr.co.green.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.green.member.model.dto.Member;
import kr.co.green.member.model.service.MemberServiceImpl;

@WebServlet("/member/register.do")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegisterController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userFirstName = request.getParameter("first_name");
		String userLastName = request.getParameter("last_name");
		String userEmail = request.getParameter("email");
		String userPwd = request.getParameter("password");
		String confirmPwd = request.getParameter("confirm-password");
		
		Member member = new Member();
		member.setUserFirstName(userFirstName);
		member.setUserLastName(userLastName);
		member.setUserEmail(userEmail);
		member.setUserPwd(userPwd);
		member.setConfirmPwd(confirmPwd);
			
		MemberServiceImpl memberService = new MemberServiceImpl();
		int result = memberService.register(member);
		
		if(result == 1) {// 성공
			RequestDispatcher view = request.getRequestDispatcher("/views/member/login.jsp");
			view.forward(request, response);
		}
		else {
			RequestDispatcher view = request.getRequestDispatcher("/views/member/register.jsp");
			view.forward(request, response);
		}
	}

}
