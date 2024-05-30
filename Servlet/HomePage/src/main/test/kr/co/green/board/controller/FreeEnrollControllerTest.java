package kr.co.green.board.controller;

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

public class FreeEnrollControllerTest {
	@InjectMocks
	private FreeEnrollController fec;
	
	@Mock 
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
		when(request.getRequestDispatcher("/freeBoard/list.do?cpage=1&category=fb_title&search-text=")).thenReturn(dispatcher);
	}
	
	@ParameterizedTest
	@CsvSource({
				"제목입니다, 내용입니다, 24, /freeBoard/list.do?cpage=1&category=fb_title&search-text="
		 	   }) 
	public void testDoPost(String title, String content, int userNo, String resultPath) throws ServletException, IOException {
		when(request.getParameter("title")).thenReturn(title);
		when(request.getParameter("content")).thenReturn(content);
		when(session.getAttribute("userNo")).thenReturn(userNo);
		
		fec.doPost(request, response); 
		verify(response).sendRedirect(resultPath);
		
		
	}
}
