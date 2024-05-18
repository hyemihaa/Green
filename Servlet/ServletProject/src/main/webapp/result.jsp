<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- 지시자 %@ -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- JSP : HTML에서 자바를 사용하기 위한 서버 사이드 언어-->
    <!-- <% %>  스크립 틀릿 : 태그 사이에 Java 코드를 직접 삽입할 수 있도록 해주는 방법 -->
    
    <!-- userName변수 설정, getAttribute("username") java에서 설정한 별칭 사용 -->
    <% 
    	String userName = (String)request.getAttribute("username");
    
    	int sum = 0;
    	for(int i = 0; i < 10; i++){
    		sum += i;
    }
    %>
    
    <!-- 선언문 -->
    <%!
    	int num1 = 5;
    	int num2 = 10;
    	
    	public int method(int num1, int num2) {
    		return num1 + num2;
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p> <%= method(num1, num2) %></p>
	<!-- 표현식 -->
	<p><%= sum %></p>
	<p>주문자 이름 : <%=userName %></p>
	
	<!-- JSTL -->
	<!-- 변수선언 -->
	<c:set var="num1" value="1"/>
	<!-- if문 -->
	<c:if test="${num1 == 1}">
		<p> num1은 1입니다. </p>
	</c:if>
</body>
</html>










