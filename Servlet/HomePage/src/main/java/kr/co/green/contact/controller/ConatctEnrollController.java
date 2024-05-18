package kr.co.green.contact.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.green.contact.model.dto.ContactDto;
import kr.co.green.contact.model.service.ContactServiceImpl;

@WebServlet("/contact/enroll.do")
public class ConatctEnrollController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ConatctEnrollController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); // 사용자가 보낸 데이터를 UTF-8로 인코딩
		
		//이름 이메일 메세지
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String message = request.getParameter("message");
		
		//어떤 사용자가 요청했는지
		HttpSession session = request.getSession();
		int memberNo = (int)session.getAttribute("userNo");
		
		// Dto에 정보저장 (매개변수 생성자 사용)
		ContactDto contactDto = new ContactDto(name, email, message, memberNo);
		
		// 서비스 호출
		ContactServiceImpl contactService = new ContactServiceImpl();
		int result = contactService.enroll(contactDto);
		
		if(result == 1) {
			response.sendRedirect("/");
		}
		
		
		
		
	}

}
