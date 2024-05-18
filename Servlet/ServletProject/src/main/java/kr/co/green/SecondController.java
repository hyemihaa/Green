package kr.co.green;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Servlet implementation class SecondController
@WebServlet("/second.do")
public class SecondController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    //  @see HttpServlet#HttpServlet()
     
    public SecondController() { // 생성자
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("요청 들어옴");
		response.sendRedirect("second.html"); // 페이지 이동 (webapp폴더를 기준으로 html파일 요청)
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
