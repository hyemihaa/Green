package kr.co.green.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.green.board.medel.dto.FreeDtoImpl;
import kr.co.green.board.medel.service.FreeServiceImpl;

@WebServlet("/freeBoard/detail.do")
public class FreeDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FreeDetailController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		freeList.jsp -> onclick : freeBoard/detail.do?boardNo=41
		int boardNo = Integer.parseInt(request.getParameter("boardNo")); // getParameter는 String타입 -> int타입으로 형변환 해줘야함
		
		//boardNo가지고 게시글의 정보 불러오기
		//필요한 정보 : 제목, 내용, 작성일, 조회수, 작성자
		FreeServiceImpl freeService = new FreeServiceImpl();
		FreeDtoImpl result = freeService.getDetail(boardNo); // 게시글의 번호 가지고 정보를 불러온다 -> 인자값을 boardNo을 넘긴다.
		
		freeService.getFileName(result);
		
		result.setBoardViews(result.getBoardViews() + 1); //이전 값 + 1
		request.setAttribute("result", result);
		
		// 게시글 클릭시 -> 상세페이지로 이동
		RequestDispatcher view = request.getRequestDispatcher("/views/board/free/freeDetail.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
