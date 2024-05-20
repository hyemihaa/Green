package kr.co.green.member.controller;

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

public class RegisterControllerTest {
	@InjectMocks
	public RegisterController rc;
	
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
		when(request.getRequestDispatcher("/views/member/login.jsp")).thenReturn(dispatcher);
	}
	
	@ParameterizedTest
	@CsvSource({"한글이름, id42, passworD123!, passworD123!, /views/member/login.jsp"}) //아래 매개변수와 순서대로 매칭
	public void testDoPost(String username, String userid, String password, String confirmPassword, String resultPath) throws ServletException, IOException {
		when(request.getParameter("new-username")).thenReturn(username);
		when(request.getParameter("new-userid")).thenReturn(userid);
		when(request.getParameter("new-password")).thenReturn(password);
		when(request.getParameter("confirm-password")).thenReturn(confirmPassword);
		when(request.getParameter("duplicateCheck")).thenReturn("available");
		
		rc.doPost(request, response); // add throws 
		verify(request).getRequestDispatcher(resultPath);
		verify(dispatcher).forward(request, response);
		
		
	}
	
	
}
