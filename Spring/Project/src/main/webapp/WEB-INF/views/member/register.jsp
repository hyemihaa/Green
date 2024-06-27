<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
	<%@ include file="../common/head.jsp" %>
</head>
<body>
	<%@ include file="../common/header.jsp" %>
	<%@ include file="../common/nav.jsp" %>

	<section>
		<div class="signup-form">
			<h2>회원가입</h2>
			<form action="/member/register.do" method="POST">
				<div class="input-container"></div>
				<div class="input-container">
					<label for="new-username">이름:</label> 
					<input type="text" id="new-username" name="memberName"  required> 
					<span id="msg-username"></span>
				</div>

				<div class="input-container">
					<label for="new-userid">아이디:</label> 
					<input type="text" id="new-userid" name="memberId" onkeyup="checkId()" required>
					<span id="msg-userid"></span>
				</div>
				<div class="input-container">
					<label for="new-password">비밀번호:</label> 
					<input type="password" id="new-password" name="memberPassword"  required> 
					<span id="msg-password"></span>
				</div>

				<div class="input-container">
					<label for="confirm-password">비밀번호 확인:</label> 
					<input type="password" id="confirm-password" name="confirmPassword"  required> 
					<span id="msg-password-check"></span>
				</div>

				<button type="submit">회원가입</button>
			</form>
		</div>
	</section>

	<%@ include file="../common/footer.jsp" %>
	
	<script>
	
		function checkId() {
			const id = document.getElementById("new-userid").value;
			console.log(id);
			console.log("asdsad");
			$.ajax({
				type: "POST",
				url: "/member/checkId.do",
				data: { memberId : id },
				success: function(res) {
					console.log(res);
				},
				error: function(err) {
					
				}
				
			})
		}
		
	</script>
	
</body>
</html>
