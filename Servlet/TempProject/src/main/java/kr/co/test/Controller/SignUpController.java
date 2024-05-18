package kr.co.test.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.test.model.dto.MemberDto;
import kr.co.test.model.service.MemberServiceImpl;

@WebServlet("/member/index.do")
public class SignUpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SignUpController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); // 사용자가 보낸 데이터를 UTF-8로 인코딩
		response.setContentType("text/html; charset=UTF-8"); 
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String confirmPwd = request.getParameter("confirm-password");
		String birthdate = request.getParameter("birthdate");
		String address = request.getParameter("address");
		
		MemberDto memberDto = new MemberDto();
		memberDto.setName(name);
		memberDto.setEmail(email);
		memberDto.setPassword(password);
		memberDto.setConfirmPwd(confirmPwd);
		memberDto.setBirthdate(birthdate);
		memberDto.setAddress(address);
		
		MemberServiceImpl memberService = new MemberServiceImpl();
		int result = memberService.register(memberDto);
	
		if(result == 1) { // 성공
			RequestDispatcher view = request.getRequestDispatcher("/views/common/login.jsp"); // 로그인 페이지로 이동
			view.forward(request, response);
		}
		else { // 실패
			RequestDispatcher view = request.getRequestDispatcher("/views/common/error.jsp"); // 에러 페이지로 이동
			view.forward(request, response);
			
		}
		
	}

}
