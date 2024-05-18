package kr.co.training;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/redGet.do")
public class redGetController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public redGetController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 상품선택
		String[] product = request.getParameterValues("product");
		// 포장선택
		String gift = request.getParameter("gift");
		
		//배송정보 이름,주소,이메일,연락처
		String name = request.getParameter("username");
		String addr = request.getParameter("addr");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		//상품선택 꺼내기
		String productSel = "";
		for(String item : product) { 
			if(item.equals("gift_3")) { // 문자열비교 equals
				productSel += "선물용3kg";
			}
			else if(item.equals("gift_5")) {
				productSel += "선물용5kg";
			}
			else if(item.equals("family_3")) {
				productSel += "가정용3kg";
			}
			else if(item.equals("family_5")) {
				productSel += "가정용5kg";
			}
		}

		// 포장선택 꺼내기
		String packaging = "";
			if(gift.equals("yes")) {
				packaging = "합니다";
			}
			else {
				packaging = "안합니다.";
			}
		
		
		System.out.println(name + "님이 주문하신 상품은 " + productSel + "이며 선물포장 선택은 "  + packaging);
		
		System.out.println("배송주소 : " + addr);
		System.out.println("이메일 : " + email);
		System.out.println("연락처 : " + phone);
		
		
		// setAttribute("username", name) 
		// username: name변수명의 별칭이라고 생각 -> getAttribute에서 받을 별칭
		// name : 위에서 설정한 변수명
		// name변수를 JSP로 넘기기 위한 바인딩
		request.setAttribute("username", name);
		
		// getRequestDispatcher : JSP에게 응답하기위해 필요한 객체
		// 응답할 JSP 설정
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		// 포워딩
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
