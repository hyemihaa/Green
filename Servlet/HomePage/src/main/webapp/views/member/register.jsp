<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <%@ include file ="/views/common/head.jsp" %>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script> <!-- 제이쿼리의 라이브러리 -->
</head>
<body>
	<%@ include file="/views/common/header.jsp" %>
	<%@ include file="/views/common/nav.jsp" %>

  <section>
    <div class="signup-form">
        <h2>회원가입</h2>
        <form action="/member/register.do" method="POST">  <!-- registerController.java : @WebServlet("/member/register.do")과 일치 --> 
          <input type="hidden" id="duplicateCheck" name="duplicateCheck">
          <div class="input-container">
        </div>
        <div class="input-container">
          <label for="new-username">이름:</label>
          <input type="text" id="new-username" name="new-username" required>
        </div>

        <div class="input-container">
            <label for="new-userid">아이디:</label>
            <input type="text" id="new-userid" name="new-userid" onkeyup="duplicateId()" required>
            <span id="id-msg"></span> 
        </div>
          <div class="input-container">
            <label for="new-password">비밀번호:</label>
            <input type="password" id="new-password" name="new-password" required>
          </div>
  
          <div class="input-container">
            <label for="confirm-password">비밀번호 확인:</label>
            <input type="password" id="confirm-password" name="confirm-password" required>
          </div>
  
          <button type="submit">회원가입</button> <!-- submit : from태그를 실행시키는 이벤트 -->
        </form>
      </div>
  </section>

	<%@ include file="/views/common/footer.jsp" %>

</body>
 
</html>

<script>
	
	function duplicateId() {
		const userId = document.getElementById("new-userid").value;
		const idMsg = document.getElementById("id-msg");
		const duplicateCheck = document.getElementById("duplicateCheck");
		
		$.ajax({  /* cdn가져와서 사용 (Jquery 라이브러리) */
			type: "POST", /* HTTP 메소드 */
			url: "/member/duplicateId.do", /* 요청할 URL */
			data: {userId : userId}, /* 전송할 데이터 {키(컨트롤러가 받아서 사용할 이름), 값} */
			success: function(res) { // 요청이 성공했을 때
				console.log(res);
				if(res === "available"){
					duplicateCheck.value = "available";
					idMsg.style.color = "green";
					idMsg.innerHTML = "사용 가능한 아이디 입니다.";
				}
				else {
					duplicateCheck.value = "unavailable";
					idMsg.style.color = "red";
					idMsg.innerHTML = "중복된 아이디 입니다.";
				}
			
			},
			error: function(err){ // 요청이 실패했을 때
			console.log(err);
				
			}
		})
		
		
	}
</script>








