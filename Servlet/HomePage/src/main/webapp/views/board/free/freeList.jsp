<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<%@ include file="/views/common/head.jsp"%>
</head>
<body>
	<%@ include file="/views/common/header.jsp"%>
	<%@ include file="/views/common/nav.jsp"%>

	    <section style="height: 70vh">
      <h1>자유 게시판</h1>
      <hr>
      <div class="input-group mb-3" style="width: 100%; margin-top:40px">
      
      <form action="/freeBoard/list.do" method="GET">
      	<input type="hidden" name="cpage" value="1">
      
        <select class="form-select" id="inputGroupSelect02" name="category" style="width:100px; height:46px; flex: 0 0 auto;">
          <option value="fb_title" selected>제목</option>
          <option value="fb_content">내용</option>
          <option value="m_name">작성자</option>
        </select>
        <input type="text" style="width:500px; flex: 0 0 auto;" class="form-control" name="search-text" placeholder="검색어를 입력해주세요." aria-label="Recipient's username" aria-describedby="button-addon2">
        <button class="btn btn-outline-secondary" type="submit" id="button-addon2" style="height:46px;">검색</button>
      </form>
            
    	<c:if test="${sessionScope.userName != null}"> <!-- 로그인 할때 -->
        	<button onclick="window.location.href = '/form/enrollForm.do'" style="position:absolute; right: 0%;">등록</button>
    	</c:if>									<!-- formcontroller -> 서블릿 -->
    

      </div>
        <div class="table-container">
          <table class="table table-hover" style="margin-top: 10px;">
            <thead>
              <tr>
                <th scope="col">번호</th>
                <th scope="col">제목</th>
                <th scope="col">작성자</th>
                <th scope="col">작성일</th>
                <th scope="col">조회수</th>
              </tr>
            </thead>
            <tbody>
            	<c:choose>
            		<c:when test="${empty list}"> <!-- 조건: list객체가 비워져 있을때 -->
            			<tr>
            				<td colspan="5">등록된 글이 없습니다.</td> <!-- 구현부 : colspan(열합치기)을 통해 문장을 한 행에 다 나타내기 위해 -->
            			</tr>
            		</c:when>
            		<c:otherwise> <!-- ${list} : 컨트롤러에서 setAttribute로 받은 값 -->
            			<c:forEach var="item" items="${list}"> <!-- foreach문  -->
			            <!-- 게시판 테이블 -->
			            <tr onclick="location.href='/freeBoard/detail.do?boardNo=${item.boardNo}'"> <!-- 한줄모두 클릭시 이동 -->
            			    <td scope="row">${row}</td>
                			<td>${item.boardTitle}</td>
                			<td>${item.memberName}</td>
               				<td>${item.boardIndate}</td>
                			<td>${item.boardViews}</td>
              			</tr>
              			<c:set var="row" value="${row-1}" /> <!-- 게시글 번호 설정 -->
              			</c:forEach>
            		</c:otherwise>
            	</c:choose>
            </tbody>
          </table>
        </div>

        <nav aria-label="Page navigation example" style="background-color: white; ">
        
          <ul class="pagination" style="justify-content: center;">
          <!-- 왼쪽 버튼 -->
          <c:choose>
          		<c:when test="${pi.cpage == 1}">
            		<li class="page-item" style="margin-right: 0px">
             		 <a class="page-link" href="#" aria-label="Previous"> <!-- # : 현재 페이지 -->
                	<span aria-hidden="true">&laquo;</span>
              		</a>
            		</li>
          		</c:when>
          		<c:otherwise>
          			<li class="page-item" style="margin-right: 0px">  
             		 <a class="page-link" href="/freeBoard/list.do?cpage=${pi.cpage - 1}" aria-label="Previous">
                	<span aria-hidden="true">&laquo;</span>
              		</a>
            		</li>
          		</c:otherwise>
          </c:choose>
          
          	<!-- 페이지 버튼 page변수 1 ~ 10까지 반복하겠다.-->
            <c:forEach var="page" begin="${pi.startPage}" end="${pi.endPage}">
            	<li class="page-item" style="margin-right: 0px"><a class="page-link" href="/freeBoard/list.do?cpage=${page}">${page}</a></li>
            </c:forEach>
            
            <!-- 오른쪽 버튼 -->
            <c:choose>
            	<c:when test="${pi.cpage == pi.maxPage}"> <!-- 현재페이지 == 최대페이지 -->
           			 <li class="page-item" style="margin-right: 0px">
             		 <a class="page-link" href="#" aria-label="Next">
                	 <span aria-hidden="true">&raquo;</span>
              		 </a>
           		     </li>
            	</c:when>
            	<c:otherwise>
           			 <li class="page-item" style="margin-right: 0px">
             		 <a class="page-link" href="/freeBoard/list.do?cpage=${pi.cpage + 1}" aria-label="Next">
                	 <span aria-hidden="true">&raquo;</span>
              		 </a>
           		     </li>
            	</c:otherwise>
            </c:choose>
          </ul>
        </nav>
  </section>

	<%@ include file="/views/common/footer.jsp"%>

</body>
</html>