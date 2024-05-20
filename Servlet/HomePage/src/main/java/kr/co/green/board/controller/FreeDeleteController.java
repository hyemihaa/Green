package kr.co.green.board.controller;

import java.io.File;
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
		int fileNo = Integer.parseInt(request.getParameter("fileNo"));
		String fileName = request.getParameter("fileName");
		//1. 세션에 있는 uesrNo랑 요청한 유저가 일치하는지 
		//2. 요청한 유저가 작성한 글이 맞는지
		
		FreeDtoImpl freeDto = new FreeDtoImpl();
		freeDto.setBoardNo(boardNo);
		
		FreeServiceImpl freeService = new FreeServiceImpl();
		int result = freeService.setDelete(freeDto);

//		//넘길 데이터가 하나일 경우 Dto에 담아 넘기지 않아도 된다
//		FreeServiceImpl freeService = new FreeServiceImpl();
//		int result = freeService.setDelete(boardNo);
	
		if(result == 1 && fileNo == 0) { // 업로드한 파일이 없을 때
			response.sendRedirect("/freeBoard/list.do?cpage=1&category=fb_title&search-text=");
		}
		else if(result == 1 && fileNo > 0) { // 업로드한 파일이 있을 때
			String uploadDirectory = "C:\\dev\\work-space\\Servlet\\HomePage\\src\\main\\webapp\\resources\\uploads\\freeBoard";
			File file = new File(uploadDirectory + "\\" + fileName);
			//jsp에 hidden타입 만들어서 컨트롤러로 넘기고
			//request.getParameter 받아오기
			file.delete();
			
			int deleteResult = freeService.setFileDelete(fileNo); //DB에서 삭제
			response.sendRedirect("/freeBoard/list.do?cpage=1&category=fb_title&search-text=");
		}
		
	}

}
