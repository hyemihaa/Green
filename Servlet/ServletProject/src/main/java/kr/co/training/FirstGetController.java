package kr.co.training;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstGet.do")
public class FirstGetController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FirstGetController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET요청");
		
		// request : 요청에 대한 정보를 가지고 있는 객체 ->  
		String userTitle = request.getParameter("title");  // html 폼 양식에 대한 이름의 파라미터 이름과 값을 가져올때 사용 , 서버에 요청을 날림
		String userContent = request.getParameter("content");
		
		System.out.println("제목 : " + userTitle); // 전달받은 제목을 콘솔창에 출력
		System.out.println("내용 : " + userContent); 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Post요청");
	}

}
