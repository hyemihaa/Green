<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<link rel="stylesheet" href="/resources/css/member/register.css">
<head>
  <%@ include file ="/views/common/head.jsp" %>

</head>

<body>
	<%@ include file ="/views/common/banner.jsp" %>
    <div>
        <div class="login-container">
            <h2>회원가입</h2>
            <br>
            <form action="/member/register.do" method="POST"> <!-- registerController.java : @WebServlet("/member/register.do")과 일치 -->
                <label for="text">영문 이름(First Name)</label>
                <input class="register-input" name="first_name" type="text" id="text1" onkeyup="getFirstName()" required placeholder="영문 이름(First Name)"><br>
                <div id="text1Msg"></div>
                
                <label for="text">영문 성(Last Name)</label>
                <input class="register-input" name="last_name" type="text" id="text2" onkeyup="getLastName()" required placeholder="영문 성(Last Name)"><br>
                <div id="text2Msg"></div>
                
                <label for="email">이메일</label>
                <input class="register-input" name="email" type="email" id="email" onkeyup="getEmail()" required placeholder="email"><br>
                <div id="emailMsg"></div>

                <label for="password">비밀번호</label>
                <input class="register-input" name="password" type="password" id="password" onkeyup="getRegister()" required placeholder="비밀번호"><br>
                <div id="pwMsg"></div>
                
                <label for="password">비밀번호 확인</label>
                <input class="register-input" name="confirm-password" type="password" id="password-check" onkeyup="getRegister()" required placeholder="비밀번호 확인"><br>
                <div id="pwCheakMsg"></div>

                <!-- 개인정보처리방침 -->

                <div>
                    <hr>
                    <div>
                        <span>개인정보 처리방침</span>
                        <p>본 예약의 처리를 위해 모든 개인정보 처리방침에 동의해 주시기 바랍니다.</p>
                    </div>
                    <div class="checkbox-list">
                        <div>
                            <label class="select-all">
                                <input type="checkbox" onclick="">
                                <span>본인은 아래의 모든 개인정보 처리방침에 동의합니다.</span>
                            </label>
                        </div>
                        <div>
                            <label class="select">
                                <input type="checkbox">
                                <span class="txt"><a href="">본인은 본 서비스 약관에 동의하며 액18세 이상임을 확인합니다.[필수]</a></span>
                            </label>
                        </div>
                        <div>
                            <label class="select">
                                <input type="checkbox">
                                <span class="txt"><a href="">본인은 개인정보 처리방침에 따라 본인의 개인 정보를 사용하고 수집하는 것에
                                        동의합니다.[필수]</a></span>
                            </label>
                        </div>
                        <div>
                            <label class="select">
                                <input type="checkbox">
                                <span class="txt"><a href="">본인은 개인정보 처리방침에 따라 대한민국 또는 해외에 있는 제3자 본인의 개인 정보를 제공하는 것에
                                        동의합니다.[필수]</a></span>
                            </label>
                        </div>
                    </div>
                    <button type="submit" class="register-but" onclick="getRegister()">회원가입</button> 
                    <!-- 로그인, 회원가입 footer -->
                    <hr>
                    <div>
                        <span>다른 방법으로 로그인</span>
                    </div>
                    <div>
                        <button class="google-but but" type="button">
                            <img src="https://cdn6.agoda.net/images/universal-login/google-logo-v2.svg" alt="구글">
                            <span>구글</span>
                        </button>
                        <button class="facebook-but but" type="button">
                            <img src="https://cdn6.agoda.net/images/universal-login/facebook-logo.svg" alt="페이스북">
                            <span>페이스북</span>
                        </button>
                        <button class="apple-but but" type="button">
                            <img src="https://cdn6.agoda.net/images/universal-login/apple-logo.svg" alt="애플">
                            <span>애플</span>
                        </button>
                        <button class="green-but" type="button" onclick="location.href='login.html'">그린 회원이신가요? 로그인</button>
                    </div>
            </form>
        </div>
    </div>
	<%@ include file="/views/common/footer.jsp" %>
</body>

</html>

