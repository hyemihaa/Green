<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<%@ include file="/views/common/head.jsp"%>
</head>
<body> <!-- 게시글 상세페이지 -->
	<%@ include file="/views/common/header.jsp"%>
	<%@ include file="/views/common/nav.jsp"%>
	
  <section class="container mt-4" style="height: 70vh">
    <div class="card text-center" style="height: 100%">
    	<form action="/freeBoard/delete.do" method="POST"> 
    	<!-- 현재 페이지에서 작성자,작성일,조회수는 고유한 번호가 아니기때문에
    	boardNo를 hidden(현재페이지에서는 필요없는 데이터)으로 가져온다. -->
    	<input type="hidden" name="boardNo" value="${result.boardNo}"/>
    	<input type="hidden" name="fileNo" value="${result.fileNo}"/>
    	<input type="hidden" name="fileName" value="${result.fileName}"/>
        <div class="card-header">
            <h2 id="fb-title">${result.boardTitle}</h2>
        </div>
        <div class="card-body">
            <div class="d-flex justify-content-center mb-3">
                <div class="mx-3">작성자: <span id="fb-writer">${result.memberName}</span></div>
                <div class="mx-3">작성일: <span id="fb-date">${result.boardIndate}</span></div>
                <div class="mx-3">조회수: <span id="fb-views">${result.boardViews}</span></div>
            </div>
            <hr> 
            <div style="margin-top:20px; margin-bottom: 20px;">
            <img src="/resources/uploads/freeBoard/${result.fileName}"
            	width="300px" height="250px">
                <p class="card-text">
                    ${result.boardContent}
                </p>
            </div>
        </div>
        <div class="card-footer d-flex justify-content-center"> <!-- 수정버튼 클릭 -> 보드넘버를 넘긴다 -->
            <button type="button" class="btn btn-secondary mx-2" onclick="window.history.back()">뒤로가기</button>
            <c:if test="${sessionScope.userNo == result.memberNo}">                     
            	<button type="button" class="btn btn-primary mx-2" onclick="location.href='/form/editForm.do?boardNo=${result.boardNo}'">수정</button>
            	<button type="submit" class="btn btn-danger mx-2">삭제</button>
            </c:if>
        </div>
        </form>
    </div>
</section>

	<%@ include file="/views/common/footer.jsp"%>

</body>
</html>