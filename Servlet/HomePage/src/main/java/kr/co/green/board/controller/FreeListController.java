package kr.co.green.board.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.green.board.medel.dto.FreeDtoImpl;
import kr.co.green.board.medel.service.FreeServiceImpl;
import kr.co.green.common.PageInfo;
import kr.co.green.common.Pagination;

@WebServlet("/freeBoard/list.do") // nav.jsp : 자유게시판 경로 
public class FreeListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FreeListController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FreeServiceImpl freeService = new FreeServiceImpl();
//		"/freeBoard/list.do?cpase=1" : ?쿼리스트링--> 기본적으로 데이터타입이 String (숫자로 1 써있어도)
		// int타입으로 형변환 필수
		int cpage = Integer.parseInt(request.getParameter("cpage"));
		String category = request.getParameter("category");
		String searchText = request.getParameter("search-text");
		
		// 전체 게시글 수
		int listCount = freeService.getListCount(category, searchText);
		
		// 보여질 페이지 수
		int pageLimit = 5;
		
		// 한 페이지에 보여질 게시글 수
		int boardLimit = 5;
		
		// 페이징처리
		PageInfo pi = Pagination.getPageInfo(listCount, cpage, pageLimit, boardLimit); // 객체생성X -> static
		
		// 게시글 목록 불러오기  ( 동적배열(객체배열) : 데이터의 양이 정해지지 않았으니)
		ArrayList<FreeDtoImpl> list = freeService.getList(pi, category, searchText); 
		
		// 게시글 번호 구하기
		int row = listCount - (cpage-1) * boardLimit;
		
		// 게시글 목록을 jsp에게 전달해주기(데이터 바인딩)
		request.setAttribute("list", list);
						// "list": 내가 꺼내서 쓸 속성명, list : 내가 보낼 변수(데이터명)
		request.setAttribute("row", row);
		request.setAttribute("pi", pi);
		
		// 위의 setAttribute을 쓰고자 하는 경로로 이동 -> RequestDispatcher 사용해야 한다. 
		// RequestDispatcher : jsp로 데이터 담아서 이동
		RequestDispatcher view = request.getRequestDispatcher("/views/board/free/freeList.jsp"); //경로이동
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}


