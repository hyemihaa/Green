// 2. 회원가입
//  -> 아이디 : 5~20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용 가능
//  -> 이메일 : 유효한 이메일 주소
//  -> 비밀번호 : 8~16자의 영문 대/소문자, 숫자, 특수문자를 사용
//  -> 비밀번호 확인 : 비밀번호와 동일한지 확인
//  -> 주민번호 : -포함, 14자리만 가능
//  -> 실명(이름) : 한글만 가능
//  -> 휴대폰 번호 : -빼고 11자리만 가능

// 영문이름
function getFirstName() {
    const nameText1 = document.getElementById("text1").value;
    const msg = document.getElementById("text1Msg");
    
    const text1Pattern = /^[^\s@]+[a-zA-Z]$/;

    if(text1Pattern.test(nameText1)) {
        msg.innerHTML = "사용가능";
        msg.style.color = "green";
    }
    else {
        msg.innerHTML = "사용불가능";
        msg.style.color = "red";
    }
}

// 영문성
function getLastName() {
    const nameText2 = document.getElementById("text2").value;
    const msg = document.getElementById("text2Msg");
    
    const text2Pattern = /^[^\s@]+[a-zA-Z]$/;

    if(text2Pattern.test(nameText2)) {
        msg.innerHTML = "사용가능";
        msg.style.color = "green";
    }
    else {
        msg.innerHTML = "사용불가능";
        msg.style.color = "red";
    }
}


// 이메일
function getEmail() {
    const inputEmail = document.getElementById("email").value;
    const msg = document.getElementById("emailMsg");
    
    const emailPattern = /^[a-zA-z0-9]+@[a-zA-z0-9]+\.[a-zA-Z]{2,}$/;
    
    if(emailPattern.test(inputEmail)) {
        msg.innerHTML = "사용가능";
        msg.style.color = "green";
    }
    else {
        msg.innerHTML = "사용불가능";
        msg.style.color = "red";
    }
}


// 비밀번호
//비밀번호 확인
function getRegister() {
    const inputPw = document.getElementById("password").value;
    const inputPwCheck = document.getElementById("password-check").value;
    const msg = document.getElementById("pwMsg");
    const msg2 = document.getElementById("pwCheakMsg");
    
    const pwPattern = /^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])[a-zA-z0-9!@#$%^*+=-]{8,16}$/; 

    if(pwPattern.test(inputPw)) {
        msg.innerHTML = "사용가능";
        msg.style.color = "green";
    }
    else {
        msg.innerHTML = "사용불가능";
        msg.style.color = "red";
    }
    // 비밀번호 확인
    if(inputPw === inputPwCheck) {
        msg2.innerHTML = "비밀번호가 동일합니다.";
        msg2.style.color = "green";
    }
    else {
        msg2.innerHTML = "비밀번호가 다릅니다.";
        msg2.style.color = "red";
    }
}
