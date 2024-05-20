<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <header>
    <h1>나의 홈페이지</h1>
    <div class="login-signup"><!-- sessionScope : HttpSession에 등록된 데이터의 이름과 값을 저장하고 있는 map객체 -->
    <c:choose>
    	<c:when test="${sessionScope.userName != null}">  
    		<a href="/member/logout.do">로그아웃</a>
    	</c:when>
    	<c:otherwise>
    		<a href="/form/loginForm.do">로그인</a>
    		<a href="/form/registerForm.do">회원가입</a>
    	</c:otherwise>
    </c:choose>
    
  <!-- <a href="/form/loginForm.do">로그인</a>
       <a href="/views/member/register.jsp">회원가입</a>
       <a href="/form/registerForm.do">회원가입</a>  -->
    </div>
  </header>