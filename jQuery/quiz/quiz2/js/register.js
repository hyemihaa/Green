{/* <회원가입>
 - 이름 : 한글만 가능
 - 아이디 : 영어, 숫자, 특수기호(_),(-)만 가능 / 5자 이상 20자 이하
 - 비밀번호 : 대소문자 또는 특수문자, 숫자 최소 1개 이상 / 8자리 이상 16자 이하
 - 비밀번호 확인 : 비밀번호와 동일해야 함

 * 일치하지 않을 경우 input의 아래 부분에 텍스트 출력(keyup 이벤트 활용)
 - 이름이 일치하지 않을 경우 : "한글만 사용 가능합니다."    // 색상 red
 - 이름이 일치할 경우 : ""   (빈 문자열 출력)

 - 아이디가 일치하지 않을 경우 : "5~20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용 가능합니다."    // 색상 red
 - 아이디가 일치할 경우 : "사용 가능한 아이디입니다."    // 색상 green

 - 비밀번호가 일치하지 않을 경우 : "8~16자의 영문 대/소문자, 숫자, 특수문자를 사용해 주세요."    // 색상 red
 - 비밀번호가 일치할 경우 : "사용 가능한 비밀번호입니다."    // 색상 green

 - 비밀번호 확인이 비밀번호와 일치하지 않을 경우 : 비밀번호가 일치하지 않습니다."    // 색상 red
 - 비밀번호 확인이 비밀번화 일치할 경우 : "비밀번호가 일치합니다."    // 색상 green


 * 공통 : 비어있는 문자 불가(회원 가입 버튼 클릭 시) 
 - 이름 이 비어있다면 alert "이름을 입력해주세요."
 - 아이디가 비어있다면 alert "아이디를 입력해주세요."
 - 비밀번호가 비어있다면 alert "비밀번호를 입력해주세요."
 - 비밀번호 확인이 일치하지 않는다면 alert "비밀번호가 일치하지 않습니다" */}

// 이름 체크
function getName() {
    const nameInput = document.getElementById("new-username").value; //이름
    const resultName = document.getElementById("result-name"); // 이름 값 출력할 곳

    const regex1= /^[ㄱ-ㅎ|가-힣]/; // 한글만

    // 이름규칙 
    if(!(regex1.test(nameInput))) {
        resultName.innerHTML = "한글만 사용 가능합니다.";
        resultName.style.color = "red"
    }
    else {
        resultName.innerHTML = "";
    }
    
}

function getId() {
    const idInput = document.getElementById("new-userid").value; // 아이디
    const resultId = document.getElementById("result-id"); // 아이디 값 출력할 곳

    const regex2= /^[a-zA-Z0-9\_\-]{5,20}$/; // 영어 숫자 특수기호(_,-)

    // 아이디규칙 
    if(!regex2.test(idInput)) {
        resultId.innerHTML = "5~20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용 가능합니다.";
        resultId.style.color = "red";
    }
    else {
        resultId.innerHTML = "사용 가능한 아이디 입니다";
        resultId.style.color = "green";
    }

}

function getPw() {
    const pwInput = document.getElementById("new-password").value; // 비밀번호
    const resultPw = document.getElementById("result-pw"); // 비밀번호 출력
    const pwCheckInput = document.getElementById("confirm-password").value; // 비밀번호 확인
    const resultCheckpw = document.getElementById("result-checkpw"); // 비밀번호 출력

    const regexPw= /^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_+=-])[a-zA-Z0-9!@#$%^&*()_+=-]{8,16}$/; // 영어 숫자 특수기호(_,-)


    // 비밀번호 규칙
    if(!(regexPw.test(pwInput))) {
        resultPw.innerHTML = "8~16자의 영문 대/소문자, 숫자, 특수문자를 사용해 주세요.";
        resultPw.style.color = "red";
    }
    else {
        resultPw.innerHTML = "사용 가능한 비밀번호입니다.";
        resultPw.style.color = "green";
    }
    // 비밀번호 확인 규칙
    if(pwInput === pwCheckInput) {
        resultCheckpw.innerHTML = "비밀번호가 일치합니다.";
        resultCheckpw.style.color = "green";
    }
    else {
        resultCheckpw.innerHTML = "비밀번호가 일치하지 않습니다.";
        resultCheckpw.style.color = "red";
    }
}

// * 공통 : 비어있는 문자 불가(회원 가입 버튼 클릭 시) 
// - 이름 이 비어있다면 alert "이름을 입력해주세요."
// - 아이디가 비어있다면 alert "아이디를 입력해주세요."
// - 비밀번호가 비어있다면 alert "비밀번호를 입력해주세요."
// - 비밀번호 확인이 일치하지 않는다면 alert "비밀번호가 일치하지 않습니다" */}


function getRegister(){
    const nameInput = document.getElementById("new-username").value; //이름
    const idInput = document.getElementById("new-userid").value; // 아이디
    const pwInput = document.getElementById("new-password").value; // 비밀번호

    if(nameInput === "") { //비어있는 문자 불가(로그인 버튼 클릭 시)
        alert("이름을 입력해주세요.");
    }
    else if(idInput === ""){
        alert("아이디를 입력해주세요.");
    }
    else if(pwInput === ""){
        alert("비밀번호를 입력해주세요.");
    }
    
}
