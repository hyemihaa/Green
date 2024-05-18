<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/views/common/head.jsp"%>
</head>
<body>
	<%@ include file="/views/common/header.jsp"%>
	<%@ include file="/views/common/nav.jsp"%>
  <section id="contact">
    <h2>연락하기</h2>
    <p>문의사항이나 연락하고 싶은 내용을 작성하세요.</p>
    <form action="/contact/enroll.do" method="post">
        <label for="name">이름:</label>
        <input type="text" id="name" name="name" required>
        
        <label for="email">이메일:</label>
        <input type="email" id="email" name="email" required>
        
        <label for="message">메시지:</label>
        <textarea id="message" name="message" rows="4" required></textarea>

        <p id="charCounter">0/500</p>

		<c:if test="${sessionScope.userName != null}"> <!-- 로그인 한 유저만 전송버튼이 보이게 설정 -->
        <button type="submit">전송</button>
        </c:if>
    </form>
  </section>
  <script>
    const messageInput = document.getElementById("message");
    const charCounter = document.getElementById("charCounter");

    messageInput.addEventListener("input", function() {
        const currentLength = messageInput.value.length;
        
        // 문자 수 카운터 업데이트
        charCounter.textContent = currentLength + "/500";
        
        // 최대 500자 제한
        if (currentLength > 500) {
            charCounter.classList.add("exceeded");  // 500자 초과 시 경고 표시
            messageInput.value = messageInput.value.substring(0, 500);  // 500자 이상 입력 방지
            charCounter.textContent = `500/500`;
        } else {
            charCounter.classList.remove("exceeded");  // 500자 이내면 경고 제거
        }
    });
	</script>
 

	<%@ include file="/views/common/footer.jsp"%>

</body>
</html>