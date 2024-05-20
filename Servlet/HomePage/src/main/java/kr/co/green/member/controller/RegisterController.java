package kr.co.green.member.controller;

import java.io.IOException;
import java.util.regex.Matcher;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mindrot.jbcrypt.BCrypt;

import java.util.regex.Pattern;
import kr.co.green.member.model.dto.Member;
import kr.co.green.member.model.service.MemberServiceImpl;

@WebServlet("/member/register.do") 
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegisterController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		//request(요청) : 사용자가 요청한(= 사용자가 보낸) 데이터
//		request.setCharacterEncoding("UTF-8"); // 사용자가 보낸 데이터를 UTF-8로 인코딩
//		//response(응답) : 사용자에게 응답할 데이터
//		response.setContentType("text/html; charset=UTF-8"); // 사용자에게 응답할 데이터를 UTF-8로 인코딩
		
		
		String userName = request.getParameter("new-username"); //input name 속성값과 동일하게 설정
		String userId = request.getParameter("new-userid");
		String userPwd = request.getParameter("new-password");
		String confirmPwd = request.getParameter("confirm-password");
		String duplicateCheck = request.getParameter("duplicateCheck");
		
		if(duplicateCheck.equals("unavailable")) { // 중복되는 아이디가 있을 때
			response.sendRedirect("/form/registerForm.do"); // get
			return; // 메서드 종료
		}
		
		//<유효성 검사>
		
		// 이름 유효성
		//이름 : 한글만 가능
		String namePattern = "^[가-힣]+$"; //정규표현식 패턴 정의
		Pattern pattern = Pattern.compile(namePattern); // 패턴객체 생성
		
		//매처 객체 생성
		//주어진 문자열(userName)이랑 정규표현식의 패턴이랑 일치하는지 비교하기위해 필요한 객체
		Matcher nameMatcher = pattern.matcher(userName);
		
		//패스워드 유효성 검사
		//패스워드 : 영어 대문자 최소1개, 특수문자 최소1개, 6자리 이상 20자리 이하
		String passwordPattern = "^(?=.*[A-Z])(?=.*[!@])[a-zA-Z0-9!@]{6,20}$";
		Pattern pwdPattern = Pattern.compile(passwordPattern); // 패턴객체 생성
		Matcher pwdMatcher = pwdPattern.matcher(userPwd);
		
		//패스워드 암호화
		String salt = BCrypt.gensalt(12); // 12바이트 임의 문자열 생성
		String hashPassword = BCrypt.hashpw(userPwd, salt);
		
		
		
		
		
		if(nameMatcher.matches() && pwdMatcher.matches()) { // 정규표현식에 맞다면 true, 맞지 않으면 false
			// 생성자로 사용 해도 된다. -> 멤버 클래스에 생성자 만들어야 함
			Member member = new Member(userName,userId,hashPassword,confirmPwd);
			
			//		Member member = new Member(); // 객체생성 
			//		member.setUserName(userName);
			//		member.setUserId(userId);
			//		member.setUserPwd(userPwd);
			//		member.setConfirmPwd(confirmPwd);
	
			MemberServiceImpl memberService = new MemberServiceImpl(); // 객체생성 -> register호출 위해
			int result = memberService.register(member);
			
			if(result == 1) { // 성공
				RequestDispatcher view = request.getRequestDispatcher("/views/member/login.jsp"); // 로그인 페이지로 이동
				view.forward(request, response);
			}
			else { // 실패
				RequestDispatcher view = request.getRequestDispatcher("/views/member/register.jsp"); // 회원가입 페이지로 이동
				view.forward(request, response);
			}
		}
		else if (!nameMatcher.matches()) { // 이름이 한글이 아닐 때
			returnAlert(response, "이름은 한글만 가능합니다");
		}
		else if (!pwdMatcher.matches()) { // 패스워드 조건에 맞지 않을 때
			returnAlert(response, "패스워드 정책에 맞지 않습니다");
		}
		// 아래의 코드의 중복 코드를 메서드로 만들어서 사용
		
//		else if (!nameMatcher.matches()) { // 이름이 한글이 아닐 때
//			response.getWriter().write("<script> "
//									 + "alert('이름은 한글만 가능합니다'); " 
//									 + "location.href='form/registerForm.do' " 
//									 + "</script>");
//		}
//		else if (!pwdMatcher.matches()) { // 패스워드 조건에 맞지 않을 때
//			response.getWriter().write("<script> "
//									 + "alert('패스워드는 최소 대문자 1개이상,, 특수문자 1개 이상, 6자리 이상 20자리 이하'); " 
//									 + "location.href='form/registerForm.do' " 
//									 + "</script>");
//		}
		
	
		
		
	}
	
	private void returnAlert(HttpServletResponse response, String msg) throws IOException {
		response.getWriter().write("<script> " //예외필수
				 + "alert('" + msg + "');" 
				 + "location.href='/form/registerForm.do' " 
				 + "</script>");
	}

}
