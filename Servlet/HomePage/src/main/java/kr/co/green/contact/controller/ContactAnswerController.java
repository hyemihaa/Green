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

@WebServlet("/contact/answer.do") // 등록버튼을 눌렀을때 
public class ContactAnswerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ContactAnswerController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); // 사용자가 보낸 데이터를 UTF-8로 인코딩
		response.setContentType("text/html; charset=UTF-8");
		
		String answerContent = request.getParameter("content");
		int no = Integer.parseInt(request.getParameter("no"));  // c_no
		HttpSession session = request.getSession();
		int mNo = (int)session.getAttribute("userNo"); //로그인할때 넣은 데이터
		
		ContactDto contactDto = new ContactDto();
		contactDto.setAnswerContent(answerContent);
		contactDto.setNo(no);
		contactDto.setMemberNo(mNo);
		
		ContactServiceImpl contactService = new ContactServiceImpl();
		int result = contactService.setAnswer(contactDto);
		
		if(result == 1) {
//			list로 이동 (controller 들러야 함)
			response.sendRedirect("/contact/list.do?cpage=1"); 
		}
	}

}
