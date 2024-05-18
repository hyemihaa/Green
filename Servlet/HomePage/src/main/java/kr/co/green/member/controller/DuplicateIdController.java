package kr.co.green.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.green.member.model.service.MemberServiceImpl;

@WebServlet("/member/duplicateId.do")
public class DuplicateIdController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DuplicateIdController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("userId");
		MemberServiceImpl memberService = new MemberServiceImpl();
		
		// DAO에서 ID 중복 체크함 (0 or 1)
		int duplicateCheck = memberService.duplicateId(id);
		
		if(duplicateCheck == 1) { // 중복
			response.getWriter().write("unavailable"); // ajax에게 응답을 해주는 상황 -> response
		}
		else { // 사용가능 (중복X)
			response.getWriter().write("available");
			
		}
		
	}

}
