<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file ="/views/common/head.jsp" %>
</head>
<body>
	<%@ include file ="/views/common/banner.jsp" %>
	<%@ include file ="/views/common/header.jsp" %>
    <main>
        <div class="main">
            <div class="part1">인기 여행지</div>
            <img src="/resources/css/img/busan.png" alt="인기 여행지">
            <img src="/resources/css/img/daegu.png" alt="인기 여행지">
            <img src="/resources/css/img/china.png" alt="인기 여행지">
            <img src="/resources/css/img/europe.png" alt="인기 여행지">

            <div class="part2">여행객 리뷰</div>
            <img src="/resources/css/img/review.png" alt="리뷰">
            <img src="/resources/css/img/review2.png" alt="리뷰">
        </div>
    </main>
    <%@ include file ="/views/common/footer.jsp" %>
</body>
</html>