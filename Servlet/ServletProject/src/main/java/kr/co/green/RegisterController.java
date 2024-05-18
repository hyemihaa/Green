package kr.co.green;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getSubmit.do")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegisterController() {
        super();
    }
    								//유저가 요청(request)한 데이터 	유저에게 응답(response)할 데이터
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET 요청");
			// 유저가 요청한 데이터로부터 GET 파라메터를 가져오겠다
		String userName = request.getParameter("username");  // username :HTML에서 사용했던 name의 값이 서버로 와서 데이터 식별자 역할을 함
		String userEmail = request.getParameter("email");
		String userPassword = request.getParameter("password");
		
		System.out.println("이름 : " + userName);
		System.out.println("이메일 : " + userEmail);
		System.out.println("비밀번호 : " + userPassword);
		
		String[] genders = request.getParameterValues("gender"); // 문자열 배열 ["M","W"]
		for(String item : genders) { 
			System.out.println(item);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST 요청");

	}

}
