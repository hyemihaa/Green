package kr.co.green.member.controller;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;

import kr.co.green.member.model.dto.Member;
import kr.co.green.member.model.service.MemberServiceImpl;
// controller : 모델과 뷰 사이에서 상호동작 관리, 대부분의 데이터 가공처리
//				사용자의 입력을 받아 모델에 전달, 전달받은 데이터를 뷰에 전달

//mapping : 해당 값이 다른 값을 가리키도록 하는 것
@WebServlet("/member/login.do")  // login.jsp(form의 action 받고 작동 실행) -> URL매핑
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 사용자가 요청한(보낸) 데이터 form(login.jsp)의 name 가져오기(파라미터 가져오겠다) -> 일치하게 적어야 함
		MemberServiceImpl memberService = new MemberServiceImpl();
		
		String userId = request.getParameter("userid");
		String userPwd = request.getParameter("password");
		
		// Member객체 -> 데이터 전송에 필요한 메서드모음
//		Member member = new Member(userId, userPwd); // 생성자로 member객체에 인자값 주기
		Member member = new Member();
		member.setUserId(userId);
		member.setUserPwd(userPwd);

		// 암호화된 패스워드 조회
		Member hashPassword = memberService.getHashPassword(userId);
		
		//BCrypt.checkpw("사용자가 입력한 패스워드", "암호화된 패스워드")
		if(BCrypt.checkpw(userPwd, hashPassword.getUserPwd())) {
			
			if(Objects.isNull(hashPassword.getUserName())) { // 값이 비어있다면 로그인 실패
				response.sendRedirect("/views/common/error.jsp"); // 에러페이지가 있다고 생각하고
			  //sendRedirect("경로");  : 서블릿에서 처리한 데이터를 넘기지 않고 페이지만 이동
				
			}
			else { // 로그인 성공
				// HttpSession객체를 얻기 위해 request.getSession()함수를 이용
				// getSession은 세션이 있으면 있는 세션 반환, 없으면 신규 세션 생성
				HttpSession session = request.getSession(); // 세션 객체 생성
				session.setAttribute("userNo", hashPassword.getUserNo()); // 세션 생성 (세션에 값 담기)
					  //setAttribute("userNo": 내가 꺼내서 쓸 속성명, result.getUserNo() : 회원번호 : 내가 보낼 변수(or 데이터명)
				session.setAttribute("userName", hashPassword.getUserName());
				session.setAttribute("userType", hashPassword.getUserType());
				
				RequestDispatcher view = request.getRequestDispatcher("/"); // '/' : index.jsp로 보내줌 (web.xml파일로 인해서)
				// 위의 setAttribute을 쓰고자 하는 경로로 이동 -> RequestDispatcher : jsp로 데이터 담아서 이동
				
				view.forward(request, response); // request : 요청한 경로로 이동
				
				//RequestDispatcher view = request.getRequestDispatcher("경로");
				// : 서블릿에서 처리한 데이터를 jsp에서 가져다가 사용해야 할 때 쓰는 객체
				// RequestDispatcher -> 이동할 경로 설정하고 생성
				// 생성된 객체 -> forword메서드로 해당 경로로 이동
			}
		}

		}
		
		
		
//		Member result = memberService.login(member); // 멤버타입(클래스) , 참조변수 -> 위에
		
//		
//		if(Objects.isNull(result.getUserName())) { // 값이 비어있다면 로그인 실패
//			response.sendRedirect("/views/common/error.jsp"); // 에러페이지가 있다고 생각하고
//		  //sendRedirect("경로");  : 서블릿에서 처리한 데이터를 넘기지 않고 페이지만 이동
//			
//		}
//		else { // 로그인 성공
//			// HttpSession객체를 얻기 위해 request.getSession()함수를 이용
//			// getSession은 세션이 있으면 있는 세션 반환, 없으면 신규 세션 생성
//			HttpSession session = request.getSession(); // 세션 객체 생성
//			session.setAttribute("userNo", result.getUserNo()); // 세션 생성 (세션에 값 담기)
//				  //setAttribute("userNo": 내가 꺼내서 쓸 속성명, result.getUserNo() : 회원번호 : 내가 보낼 변수(or 데이터명)
//			session.setAttribute("userName", result.getUserName());
//			session.setAttribute("userType", result.getUserType());
//			
//			RequestDispatcher view = request.getRequestDispatcher("/"); // '/' : index.jsp로 보내줌 (web.xml파일로 인해서)
//			// 위의 setAttribute을 쓰고자 하는 경로로 이동 -> RequestDispatcher : jsp로 데이터 담아서 이동
//			
//			view.forward(request, response); // request : 요청한 경로로 이동
//			
//			//RequestDispatcher view = request.getRequestDispatcher("경로");
//			// : 서블릿에서 처리한 데이터를 jsp에서 가져다가 사용해야 할 때 쓰는 객체
//			// RequestDispatcher -> 이동할 경로 설정하고 생성
//			// 생성된 객체 -> forword메서드로 해당 경로로 이동
//		}
//	}

}
