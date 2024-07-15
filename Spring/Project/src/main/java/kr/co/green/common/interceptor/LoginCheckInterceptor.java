package kr.co.green.common.interceptor; // 인터셉터 (servlet-context.xml에서 설정)

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginCheckInterceptor implements HandlerInterceptor {
	   @Override
	   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)// 컨트롤러 호출 전에 호출( 가장 많이 사용 )
	         throws Exception {
		   HttpSession session = request.getSession();
		   Integer memberNo = (Integer) session.getAttribute("memberNo");
		   
		   if(memberNo == null) {
			   response.sendRedirect("/common/error.jsp");
			   
			  
			   return false;  // return false : 컨트롤러 호출 X
		   }
		   return true;  // return true : 컨트롤러 호출
	   }
	   
	   @Override
	   public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, // JSP가 렌더링 되기 전
	         @Nullable ModelAndView modelAndView) throws Exception {
	   }
	   
	   @Override
	   public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, // JSP가 렌더링 된 후
	         @Nullable Exception ex) throws Exception {
	   }
}
