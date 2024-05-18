package kr.co.green.member.controller;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.green.member.model.dto.Member;
import kr.co.green.member.model.service.MemberServiceImpl;

@WebServlet("/member/login.do")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userEmail = request.getParameter("email");
		String userPwd = request.getParameter("password");
		
		Member member = new Member();
		member.setUserEmail(userEmail);
		member.setUserPwd(userPwd);
		
		MemberServiceImpl memberService = new MemberServiceImpl();
		Member result = memberService.login(member);
		
		if(Objects.isNull(result.getUserNo())) {
			response.sendRedirect("/views/common/error.jsp");
		}
		else {
			HttpSession session = request.getSession();
			session.setAttribute("userNo", result.getUserNo());
			session.setAttribute("uesrFirstName", result.getUserFirstName());
			session.setAttribute("uesrLastName", result.getUserLastName());
			
			RequestDispatcher view = request.getRequestDispatcher("/");
			view.forward(request, response);
		}
	}

}
