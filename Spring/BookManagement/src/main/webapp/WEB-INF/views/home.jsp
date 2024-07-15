<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<html>
<head>
   <title>도서 관리 시스템</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>  <!-- ajax를 사용하기 위한 cdn -->
</head>
<body>
<h1>
   도서 관리 시스템  
</h1>

   <h2>1. 도서 전체 목록 조회</h2>
   <button type="button" onclick="bookList()">전체 목록 조회</button>
   
   <script>
   function bookList() {
	   $.ajax({
		   type: "GET",
		   url: "/api/books/",
		   contentType: "application/json",
		   success: function(res) {
			  console.log(JSON.parse(res.body)); //body에 있는 문자열만 객체로 받는 것
		   },                                               
	   	   error: function(err) {
	   	   }
	   })
   }
   </script>
   
   <br>
   <hr>
   <br>
   
   <h2>2. 특정 도서 조회</h2>
   <input type="text" id="bookTitle" placeholder="도서 제목을 입력해주세요.">
   <button type="button" onclick="bookSearch()">조회</button>
   
   <script>
   function bookSearch() {
	   const bookTitle = document.getElementById("bookTitle").value;
	   
	   $.ajax({
		   type: "GET",
		   url: "/api/books/"+bookTitle,
		   contentType: "application/json",
		   success: function(res) {
			   console.log(JSON.parse(res.body));
		   },                                               
	   	   error: function(err) {
	   		   console.log(err);
	   	   },
	   })
   }
   </script>
   
   <br>
   <hr>
   <br>
   
   <h2>3. 도서 대여</h2>
   <input type="text" id="title" placeholder="대여할 도서 제목을 입력해주세요.">
   <button type="button" onclick="bookBorrow()">대여</button>
   
   <script>
   function bookBorrow() {
	   const title = document.getElementById("title").value;
	   
	   $.ajax({
		   type: "POST",
		   url: "/api/books/" + title + "/borrow/",
		   contentType: "application/json",
		   success: function(res) {
			   console.log(res);
		   },                                               
	   	   error: function(err) {
	   		   console.log(err);
	   	   },
	   })
   }
   </script>
   
   <br>
   <hr>
   <br>
   
   <h2>4. 도서 반납</h2>
   <input type="text" id="returnTitle" placeholder="반납할 도서 제목을 입력해주세요.">
   <button type="button" onclick="returnBook()">반납</button>
   
   <script>
   function returnBook() {
	   const returnTitle = document.getElementById("returnTitle").value;
	   
	   $.ajax({
		   type: "PUT",
		   url: "/api/books/" + returnTitle + "/return/",
		   contentType: "application/json",
		   success: function(res) {
			   console.log(res);
		   },                                               
	   	   error: function(err) {
	   		   console.log(err);
	   	   },
	   })
   }
   </script>
</body>
</html>
