package kr.co.green.contact.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.green.common.PageInfo;
import kr.co.green.common.Pagination;
import kr.co.green.contact.model.dto.ContactDto;
import kr.co.green.contact.model.service.ContactServiceImpl;

@WebServlet("/contact/list.do")
public class ContactListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ContactListController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContactServiceImpl contactService = new ContactServiceImpl();
		
		// 현재페이지
		int cpage = Integer.parseInt(request.getParameter("cpage")); 
		
		// 전체 연락 내역 수
		int listCount = contactService.getListCount();
		
		// 보여질 페이지 수
		int pageLimit = 3;
		
		// 한페이지에 보여질 연락내역 수
		int boardLimit = 5;
		
		// 페이징 처리
		PageInfo pi = Pagination.getPageInfo(listCount, cpage, pageLimit, boardLimit);
		
		// 게시글 목록 불러오기 
		ArrayList<ContactDto> list = contactService.getList(pi);
		
		// 게시글 번호 구하기
		int row = listCount - (cpage-1) * boardLimit;
		
		// 연락내역 목록을 jsp에게 전달해주기(데이터 바인딩)
		request.setAttribute("pi", pi);
		request.setAttribute("list", list);
		request.setAttribute("row", row);
		
		
		RequestDispatcher view = request.getRequestDispatcher("/views/contact/contactList.jsp"); //경로이동
		view.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
