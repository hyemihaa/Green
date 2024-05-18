package kr.co.green.common;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.green.board.medel.dto.FreeDtoImpl;
import kr.co.green.board.medel.service.FreeServiceImpl;
import kr.co.green.contact.model.dto.ContactDto;
import kr.co.green.contact.model.service.ContactServiceImpl;
//form - 실제 경로를 숨겨주는 단어?별칭??? 무조건 form으로 쓸 필요는 X
@WebServlet("/form/*") // localhost/form/* :  * 모든것(어떤 문자열이든 받아서 처리)
public class FormController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FormController() {
        super();
    }

//    1. 회원가입 버튼 눌럿을때 from 태그의 action = "/from/registerForm.do"
//
//    2. FormController가 /from/*  받음
//
//    3. action에 /registerForm.do가 저장
//
//    4. action == "/registerForm.do" 가 되면서 true
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8"); // 인코딩
		
		String action = request.getPathInfo(); // '/'기준으로 마지막에 있는 경로 -> registerForm.do
		String nextPage = "";
		
		// 문자열 비교후 일치하면 이동할 파일경로를 변수에 담는다
		if(action.equals("/registerForm.do")) { // 회원가입
			nextPage = "/views/member/register.jsp"; 
		}
		else if(action.equals("/loginForm.do")) { // 로그인
			nextPage = "/views/member/login.jsp"; // 우리가 이동할 jsp파일경로
		}
		else if(action.equals("/enrollForm.do")) { // 자유게시판
			nextPage = "/views/board/free/freeEnroll.jsp";
		}
		else if(action.equals("/editForm.do")) { // 게시글 수정
			int boardNo = Integer.parseInt(request.getParameter("boardNo"));
			
			FreeServiceImpl freeService = new FreeServiceImpl();
			FreeDtoImpl result = freeService.getEditForm(boardNo);
			
			request.setAttribute("result", result);
			nextPage = "/views/board/free/freeEdit.jsp";
		}
		else if(action.equals("/contactEnroll.do")) { // 연락하기 페이지
			nextPage = "/views/contact/contact.jsp";
		}
		else if(action.equals("/answerForm.do")) { // 연락하기 상세페이지에서 답변 클릭시
			int no = Integer.parseInt(request.getParameter("no")); // no를 받는 쿼리문 사용해야 함
			
			ContactServiceImpl contactService = new ContactServiceImpl();
			ContactDto result = contactService.getAnswerForm(no);
//			ContactDto result = contactService.getDetail(no); 원래있던 getDetail사용 가능
			
			
			request.setAttribute("result", result);
			nextPage = "/views/contact/contactAnswer.jsp";
		}
		
		
		
		// 서블릿에서 값을 넘겨주고 해당 페이지에서 처리할 수 있도록 하는 방법
		// nextPage가 null이 아니고 nextPage가 비어있지 않을 경우 구현부 실행
		if(nextPage != null && !nextPage.isEmpty()) {
			RequestDispatcher view = request.getRequestDispatcher(nextPage);
			// RequestDispatcher view = request.getRequestDispatcher("경로"); 
			// RequestDispatcher는 이동할 경로를 설정하고 생성
			
			view.forward(request, response); // 페이지이동
			// 생성된 객체를 가지고 forward 메소드를 통해 해당 경로 페이지로 이동할 수 있음
		}
		else {
			response.sendRedirect("/views/error.jsp");
		}
		
		


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
