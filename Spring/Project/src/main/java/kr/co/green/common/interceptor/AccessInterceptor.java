//package kr.co.green.common.interceptor;
//import java.io.IOException;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.lang.Nullable;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//public class AccessInterceptor implements HandlerInterceptor {
//	   @Override
//	   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
//	         throws Exception {
//		   String referer = request.getHeader("referer"); // referer : 요청한 위치
//		   String requestURI = request.getRequestURI(); // request.getRequestURI() : 요청을 받은 주소
//		   
//		   String serverAddress = request.getRequestURL().toString();
//		   String localServerAddress = serverAddress.replace(requestURI, "");
//		   
//		   System.out.println("referer : " + referer);
//		   System.out.println("requestURI : " + requestURI);
//		   System.out.println("serverAddress : " + serverAddress);
//		   System.out.println("localServerAddress : " + localServerAddress);
//		   
//		   // 1. 요청받은 URL이 "/free/detail.do" 일 떄 (상세보기를 요청했을 때)     
//		   // 2. 주소창에 직접 URL을 입력해서 요청했을 때
//		   // 3. 사용자가 있던 URL이 http://localhost/free//list.do가 아닐 때 (다른 페이지에서 상세보기를 요청했을 때)
//		   if(requestURI.equals("/free/detail.do") && 
//		     (referer == null || !referer.startsWith(localServerAddress + "/free/list.do") &&
//		     !referer.startsWith(localServerAddress + "/free/editForm.do"))) {
//			   // 에러페이지로 이동
////			   response.sendRedirect("/WEB-INF/views/board/common/error.jsp"); // 보안상 jsp로 이동하지 못하게 함 -> controller를 거쳐서 에러페이지로 이동해야 함
//			   response.sendRedirect("/error/accessDenied?referer="+referer);
//			   return false;
//		   }
//		   
//		   //  게시글 등록은 enrollForm.do 에서만 접근 가능
//		   if(requestURI.equals("/free/enroll.do") && 
//				   (referer == null || !referer.startsWith(localServerAddress + "/free/enrollForm.do"))) {
//			   response.sendRedirect("/error/accessDenied?referer="+referer);
//			   return false;
//		   } 
//		   else if(requestURI.equals("/free/delete.do") && 
//				   (referer == null || !referer.startsWith(localServerAddress + "/free/detail.do"))) {
//			   response.sendRedirect("/error/accessDenied?referer="+referer);
//			   return false;
//		   }
//		   //  수정폼은 detail.do 에서만 접근 가능
//		   else if(requestURI.equals("/free/editForm.do") && 
//				   (referer == null || !referer.startsWith(localServerAddress + "/free/detail.do"))) {
//			   response.sendRedirect("/error/accessDenied?referer="+referer);
//			   return false;
//		   }
//		   //  수정 요청은 수정 폼에서만 접근 가능
//		   else if(requestURI.equals("/free/edit.do") && 
//				   (referer == null || !referer.startsWith(localServerAddress + "/free/editForm.do"))) {
//			   response.sendRedirect("/error/accessDenied?referer="+referer);
//			   return false;
//		   }
//		   
//		   //  회원가입은 registerForm.do 에서만 접근 가능
//		   else if(requestURI.equals("/member/register.do") && 
//				   (referer == null || !referer.startsWith(localServerAddress + "/member/registerForm.do"))) {
//			   response.sendRedirect("/error/accessDenied?referer="+referer);
//			   return false;
//		   }
//		   
//		   return true;  // return true : 컨트롤러 호출
//	   }
//	   
//
//	   @Override
//	   public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
//	         @Nullable ModelAndView modelAndView) throws Exception {
//	   }
//	   
//	   @Override
//	   public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
//	         @Nullable Exception ex) throws Exception {
//	   }
//}

package kr.co.green.common.interceptor;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AccessInterceptor implements HandlerInterceptor {
   @Override
   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
         throws Exception {
	   
      String referer = request.getHeader("referer");
      String requestURI = request.getRequestURI();

      String serverAddress = request.getRequestURL().toString();
      String localServerAddress = serverAddress.replace(requestURI, "");

      
       HashMap<String, String[]> requestMap = new HashMap<>();
       requestMap.put("/free/detail.do", new String[]{"/free/list.do", "/free/editForm.do"});
       requestMap.put("/free/enroll.do", new String[]{"/free/enrollForm.do"});
       requestMap.put("/free/editForm.do", new String[]{"/free/detail.do"});
       requestMap.put("/free/edit.do", new String[]{"/free/editForm.do"});
       requestMap.put("/free/delete.do", new String[]{"/free/detail.do"});
       requestMap.put("/member/register.do", new String[]{"/member/registerForm.do"});
       
       // 1. 컨트롤러 호출할지(true), 안할지(false) 결정하는 변수 명시적 초기화
       boolean checkPathResult = true;
        
       // 2. requestMap에 있는 key를 하나씩 꺼내는 for문
       for(String key : requestMap.keySet()) {
          
    	  // 3.pathCheck메서드 호출
    	  // result에 담기는 값이 false : 잘못된 접근
    	  // result에 담기는 값이 true : 정상적인 접근
          boolean result = pathCheck(requestURI, 
                                     referer, 
                                     localServerAddress, 
                                     key, 
                                     requestMap.get(key)); // -> hashMap에 있는 key로 value를 가져오겠다 ( -> String[] )
          
          // 12. 반환받은 값이 false일 때(잘못된 접근일 때)
          if(!result) {
             response.sendRedirect("/error/accessDenied?referer=" + referer);
             checkPathResult = false;
             break;
          }
       }   
        
       // 13. 검증이 완료된 후에 true로 남아있다면 정상적인 접근 -> 컨트롤러 호출
       //     false라면 비정상적인 접근 -> 컨트롤러 호출 X
       return checkPathResult;

  }

  private boolean pathCheck(String requestURI, 
                            String referer, 
                            String localServerAddress, 
                            String requestMain, // key값
                            String[] requestSub) throws IOException {
      
	 // 4. 검증된 결과값을 저장하는 변수(반환할 변수)
	 // true : 정상적인 접근
     // false : 정상적인 접근이 아님
     boolean invalidReferer = true;
      
     // 5. 사용자가 요청한 URL과 꺼내온 key값이 일치하는지 확인
     if(requestURI.equals(requestMain)) {
    	
    	// 6-1. 요청했을 당시의 URL(페이지)가 null인지 확인
    	//  *null인 경우 : 주소창에 URL을 직접 입력해서 접근하려고 할 때 
        if(referer == null) {
        	
           // 6-2. null인 경우 잘못된 접근이기 때문에 invalidReferer변수에 false값을 저장
           invalidReferer = false;
           
        } else { // 7. 요청했을 당시의 URL이 null이 아닐 때 
        	
           // 8. hashMap value에 있는 값을 하나씩 꺼내서 value에 저장(반복)
           // requestSub : {"/free/list.do", "/free/editForm.do"}
           // 첫번째 반복할 때 value : /free/list.do
           // 두번째 반복할 때 value : /free/editForm.do
           for(String value : requestSub) {
        	   
        	  // 9. 요청했을 당시의 URL이 꺼낸 value의 주소가 아닐 때 true -> 조건식(논리부정) 기준 (잘못된 접근일 때) 
        	   
        	  // 처리중인 페이지 : /free/detail.do
        	  // 요청했을 당시의 URL(referer) : /free/list.do
        	   
        	  // 첫번째 반복문에 의해서 value = /free/list.do
        	  // referer(/free/list.do)가 value(/free/list.do)가 아닐 때
        	  // --> 조건식 결과 : false (정상적인 접근)
              if(!referer.startsWith(localServerAddress+value)) {
                 invalidReferer = false;
              } else {// 10. 정상적인 접근일 때
                 invalidReferer = true;
                 break; // 반복문 종료
              }
           }
        }
     }
     // 11. 검증된 결과를 반환
     return invalidReferer;
  }

   @Override
   public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
         @Nullable ModelAndView modelAndView) throws Exception {
   }

   @Override
   public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
         @Nullable Exception ex) throws Exception {
   }

}



