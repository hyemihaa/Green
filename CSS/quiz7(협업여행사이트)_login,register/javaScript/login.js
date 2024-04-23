// 1. 로그인
//  -> const id = "user"
//  -> const pwd = "qwer1234"
//  -> 입력창이 둘중 하나라도 비어있으면 alert으로 "아이디 또는 비밀번호를 입력해주세요"
//  -> 둘중 하나라도 틀리면 "아이디 또는 비밀번호가 틀렸습니다."
//  -> 둘 다 맞으면 "로그인 되었습니다."


function getlogin() {
    const id = "user@aaaaa.com"
    const pwd = "qwer1234"

    const inputEmail = document.getElementById("email").value;
    const inputPw = document.getElementById("password").value;

    if(inputEmail === "" || inputPw === "") {
        alert("아이디 또는 비밀번호를 입력해주세요.");
    }
    else if(inputEmail !== id || inputPw !== pwd) {
        alert("아이디 또는 비밀번호를 틀렸습니다.");
    }
    else {
        alert("로그인 되었습니다.");
    }

}