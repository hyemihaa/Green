package kr.co.green.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.green.board.medel.dto.FreeDtoImpl;
import kr.co.green.board.medel.service.FreeServiceImpl;

@WebServlet("/freeBoard/delete.do")
public class FreeDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FreeDeleteController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int boardNo = Integer.parseInt(request.getParameter("boardNo"));
		
		FreeDtoImpl freeDto = new FreeDtoImpl();
		freeDto.setBoardNo(boardNo);
		
		FreeServiceImpl freeService = new FreeServiceImpl();
		int result = freeService.setDelete(freeDto);

//		//넘길 데이터가 하나일 경우 Dto에 담아 넘기지 않아도 된다
//		FreeServiceImpl freeService = new FreeServiceImpl();
//		int result = freeService.setDelete(boardNo);
	
		if(result == 1) {
			response.sendRedirect("/freeBoard/list.do?cpage=1");
		}
		
	}

}
