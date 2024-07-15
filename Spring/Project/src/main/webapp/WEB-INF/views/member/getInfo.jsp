<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<html>
<head>
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
</head>
<body>
   <input type="text" id="getId" onkeyup="getInfo()">
   <script>
      function getInfo() {
         const getId = document.getElementById("getId").value;
         
         $.ajax({
            type: "GET",
            url: "/api/member2/"+getId,
            contentType:"application/json",
            success: function(res) {
               console.log(res);
               console.log(JSON.stringify(res));
               if(res === "true") {
            	   console.log("사용 가능");
               }
               else if(res === "false") {
            	   console.log("중복");
               }
               else {
            	   console.log("에러발생");
               }
            },
            error: function(err) {
            }
         })
      }
   </script>
   
   <br>
   <hr>
   
   <input type="text" id="deleteId">
   <button type="button" id="deleteBtn" onclick="deleteBtn()">회원 삭제</button>
   <span id="deleteResult"></span>
   
   <!-- 
   	 1. 사용자로부터 아이디를 입력 받음
   	 2. 삭제 버튼을 누르면 비동기 통신으로 삭제 요청
   	 3. /api/member/아이디
   	 4. HTTP메서드 : DELETE
    -->
    
    <script>
    	function deleteBtn() {
    		const id = document.getElementById("deleteId").value;
    		const resultMsg = document.getElementById("deleteResult");
    		
            $.ajax({
                type: "DELETE",
                url: "/api/member/"+id,
                contentType:"application/json",
                success: function(res) {
                	if(res === "success") {
                		resultMsg.innerHTML = "삭제 성공";
                	}
                	else {
                		resultMsg.innerHTML = "삭제 실패";
                	}
                },
                error: function(err) {
                }
             });
    	}
    </script>
   
   <br>
   <hr>
   
   <input type="text" id="memberId" placeholder="아이디를 입력해주세요">
   <input type="text" id="memberName" placeholder="이름을 입력해주세요">
   <input type="password" id="memberPassword" placeholder="비밀번호를 입력해주세요">
   <button type="button" onclick="jsonSubmit()">제출</button>
   
   <script>
   		function jsonSubmit() {
   			const memberId = document.getElementById("memberId").value;
   			const memberName = document.getElementById("memberName").value;
   			const memberPassword = document.getElementById("memberPassword").value;
   			
   			const member = {
   					memberId: memberId,
                	memberName: memberName,
                	memberPassword : memberPassword // 키값은 Dto의 변수명이랑 일치시켜야 한다.
   			}
   			
            $.ajax({
                type: "PUT",
                url: "/api/member/",
                contentType:"application/json",
                data: JSON.stringify( // json으로 변환시키지 않으면 Object형태로 날아감
                	member
				/* {memberId: memberId,
                	memberName: memberName,
                	memberPassword : memberPassword} */ // 이렇게 각각 보내는것도 가능하지만 위처럼 member객체를 만들어서 보내는게 좋다
                ),
                success: function(res) {
                	if(res === "success") {
                		resultMsg.innerHTML = "삭제 성공";
                	}
                	else {
                		resultMsg.innerHTML = "삭제 실패";
                	}
                },
                error: function(err) {
                }
             });
   		}
   </script>

</body>
</html>
