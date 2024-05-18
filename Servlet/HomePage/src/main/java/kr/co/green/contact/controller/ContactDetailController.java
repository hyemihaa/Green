package kr.co.green.contact.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.green.contact.model.dto.ContactDto;
import kr.co.green.contact.model.service.ContactServiceImpl;

@WebServlet("/contact/detail.do")
public class ContactDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ContactDetailController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 쿼리 스트링의 no가져오기
		int no = Integer.parseInt(request.getParameter("no"));
		
		//no가지고 게시글의 정보 불러오기
		//필요한 정보 : 이름, 이메일, 작성일, 답변 
		ContactServiceImpl contactService = new ContactServiceImpl();
		ContactDto result = contactService.getDetail(no);
		
		// views에 데이터 넘겨주고, 연락내역 클릭시 -> 상세페이지로 이동 
		request.setAttribute("result", result);
		RequestDispatcher view = request.getRequestDispatcher("/views/contact/contactDetail.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
