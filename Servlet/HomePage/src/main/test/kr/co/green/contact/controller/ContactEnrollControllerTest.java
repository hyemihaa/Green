package kr.co.green.contact.controller;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ContactEnrollControllerTest {
	
	@InjectMocks
	private ContactEnrollController cec;
	
	@Mock // 테스트할 임의의 객체 생성(가짜객체)
	private HttpServletRequest request;
	
	@Mock
	private HttpServletResponse response;
	
	@Mock
	private HttpSession session;
	
	@Mock
	private RequestDispatcher dispatcher;
	
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
		
		when(request.getSession()).thenReturn(session);
		when(request.getRequestDispatcher("/")).thenReturn(dispatcher);
	}
	
	@ParameterizedTest
	@CsvSource({
				"name2, email2, message2, 24, /",
		 		"'', email3, message3, 24, /error.jsp",
		 		"name4, email4, '', 24, /error.jsp"
		 	   }) //아래 매개변수와 순서대로 매칭
	public void testDoPost(String username, String useremail, String message, int userNo, String resultPath) throws ServletException, IOException {
		when(request.getParameter("name")).thenReturn(username);
		when(request.getParameter("email")).thenReturn(useremail);
		when(request.getParameter("message")).thenReturn(message);
		when(session.getAttribute("userNo")).thenReturn(userNo);
		
		cec.doPost(request, response); // add throws 
		verify(response).sendRedirect(resultPath);
		
		
	}
	
	
}
