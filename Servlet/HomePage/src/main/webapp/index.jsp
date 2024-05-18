<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <%@ include file ="views/common/head.jsp" %>
</head>
<body>
	<%@ include file="views/common/header.jsp" %>
	<%@ include file="views/common/nav.jsp" %>


 <!-- LoginController에서 setAttribute로 데이터 바인딩 -> RequestDispatcher로 경로이동 -> userName 사용가능 -->
  <section>
    <h2>홈</h2>
    <c:choose> 
    	<c:when test="${sessionScope.userName == null}">
    		<p>비회원님 안녕하세요! 홈페이지에 오신것을 환영합니다.</p>
    	</c:when>
    	<c:otherwise>
    		<p>${sessionScope.userName}님 안녕하세요! 홈페이지에 오신것을 환영합니다.</p>
    	</c:otherwise>
    </c:choose>
  </section>

	<%@ include file="views/common/footer.jsp" %>

</body>
</html>