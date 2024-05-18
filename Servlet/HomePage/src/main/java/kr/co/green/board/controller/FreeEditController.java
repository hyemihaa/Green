package kr.co.green.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.green.board.medel.dto.FreeDtoImpl;
import kr.co.green.board.medel.service.FreeServiceImpl;

@WebServlet("/freeBoard/edit.do")
public class FreeEditController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public FreeEditController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); // 사용자가 보낸 데이터를 UTF-8로 인코딩
		response.setContentType("text/html; charset=UTF-8"); 
		
		int boardNo = Integer.parseInt(request.getParameter("boardNo"));
		String boardTitle = request.getParameter("title");
		String boardContent = request.getParameter("content");
		
		FreeDtoImpl freeDto = new FreeDtoImpl(); // Dto에 값담기
		freeDto.setBoardNo(boardNo);
		freeDto.setBoardTitle(boardTitle);
		freeDto.setBoardContent(boardContent);
		
		FreeServiceImpl freeService = new FreeServiceImpl();
		int result = freeService.setEdit(freeDto);
		
		// controller -> jsp (requsestDisspatchse)
		// controller -> controller(response.sendRedirect)
		if(result == 1) {
			response.sendRedirect("/freeBoard/detail.do?boardNo="+boardNo); 
			// 바로 jsp파일로 가면 정보가 없으므로 controller에서 정보를 채워넣어야 한다.
			// sendRedirect -> get요청
		}
	}

}
