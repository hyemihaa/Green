{/* <로그인>
 * 공통 : 비어있는 문자 불가(로그인 버튼 클릭 시)
 * const id = "user";   /  const pwd = "qwer1234!"
 - 아이디 또는 비밀번호를 입력하지 않을 경우 : alert "아이디 또는 비밀번호를 입력해주세요." 출력 
 - 아이디 또는 비밀번호가 일치하지 않을 경우 : alert "아이디 또는 비밀번호가 틀렸습니다." 출력
 - 위의 변수와 모두 일치 할 경우 : alert "로그인 되었습니다." 출력  */}

function getLogin() {
    const id = "user";
    const pwd = "qwer1234!";

    const userName = document.getElementById("username").value;
    const pwInput = document.getElementById("password").value;
    const regex = /[\s]/;
    
    if(regex.test(userName) || regex.test(pwInput)) { //비어있는 문자 불가(로그인 버튼 클릭 시)
        alert("공백은 사용 불가능 합니다.");
    }
    else if(userName === "" || pwInput === "") {
        alert("아이디 또는 비밀번호를 입력해주세요.");
    }
    else if(userName !== id || pwInput !== pwd) {
        alert("아이디 또는 비밀번호가 틀렸습니다.");
    }
    else if(userName === id && pwInput === pwd) {
        alert("로그인 되었습니다.");
    }
}