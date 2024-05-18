package kr.co.green.board.controller;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import kr.co.green.board.medel.dto.FreeDtoImpl;
import kr.co.green.board.medel.service.FreeServiceImpl;

@WebServlet("/freeBoard/enroll.do")
public class FreeEnrollController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FreeEnrollController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	// 게시판 작성
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); // 사용자가 보낸 데이터를 UTF-8로 인코딩
		response.setContentType("text/html; charset=UTF-8"); 

		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		// 어떤 사용자가 글작성을 요청했는지
		HttpSession session = request.getSession();
		int memberNo = (int)session.getAttribute("userNo");
		
		//DTO에 정보 저장
		FreeDtoImpl freeDto = new FreeDtoImpl();
		freeDto.setBoardTitle(title);
		freeDto.setBoardContent(content);
		freeDto.setMemberNo(memberNo);
		
		//파일 업로드
		Collection<Part> parts = request.getParts();
		String uploadDirectory = "C:\\dev\\work-space\\Servlet\\HomePage\\src\\main\\webapp\\resources\\uploads\\freeBoard";
		
		//파일 업로드 디렉토리가 존재하지 않으면 생성
		File filePath = new File(uploadDirectory);
		if(!filePath.exists()) {
			filePath.mkdirs();
		}
		
		String fileName = null;
		
		for(Part part : parts) {
			fileName = getFileName(part);
			if(fileName != null) {
				part.write(filePath + File.separator + fileName);
			}
		}
		
		//서비스 호출
		FreeServiceImpl freeService = new FreeServiceImpl();
		int result = freeService.enroll(freeDto);
		
		//sendRedirect : 다른 컨트롤러를 다시 요청해야 할때
		if(result == 1) {
			response.sendRedirect("/freeBoard/list.do?cpage=1");
		}
	}

    private String getFileName(Part part) {
        String contentDisposition = part.getHeader("content-disposition");
        String[] tokens = contentDisposition.split(";");
        for (String token : tokens) {
            if (token.trim().startsWith("filename")) {
                return token.substring(token.indexOf('=') + 2, token.length() - 1);
            }
        }
        return null;
    }
}
