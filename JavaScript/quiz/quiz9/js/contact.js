{/* <연락하기>
 - 이름 : 한글만 가능
 - 이메일 : 이메일 주소가 유효한지 확인   ex) test@test.com
 - 메시지 : 사용자가 입력한 글자를 실시간으로 업데이트 / 최대 500글자까지 사용 가능
 
 * 공통 : 비어있는 문자 불가(전송 버튼 클릭 시)
 - 이름이 비어있다면 alert "이름을 입력해주세요"
 - 이메일이 비어있다면 alert "이메일을 입력해주세요."
- 메시지가 비어있다면 alert "메시지를 입력해주세요." */}

//  이름
function checkName() {
    const nameInput = document.getElementById("name").value; //이름
    const resultName = document.getElementById("result-name"); // 이름 값 출력할 곳
    
    const regex1= /^[ㄱ-ㅎ|가-힣]/; // 한글만
    
    // 이름규칙 
    if(!(regex1.test(nameInput))) {
        resultName.innerHTML = "한글만 사용 가능합니다.";
        resultName.style.color = "red"
    }
    else {
        resultName.innerHTML = "이름은 한글만 가능합니다.";
    }
    
}

//이메일
function checkEmail() {
    const emailInput = document.getElementById("email");
    const resultEmail = document.getElementById("result-email");
    
    const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]{2,}$/; 
    
    //이메일 규칙
    if(emailPattern.test(emailInput.value)) {
        resultEmail.innerHTML = "사용 가능한 이메일 입니다.";
        resultEmail.style.color = "green";
    }
    else {
        resultEmail.innerHTML = "사용 불가능한 이메일 입니다.";
        resultEmail.style.color = "red";
    }
}

// - 메시지 : 사용자가 입력한 글자를 실시간으로 업데이트 / 최대 500글자까지 사용 가능

// 일단 메세지를 받아서 입력을 하면 카운터가 올라가 
// 근데 길이는 500이 최대야


//메세지
function checkMessage() {
   // <textarea id="message" name="message" onkeyup="checkMessage()" rows="4" required></textarea> html 요소
    const messageText = document.getElementById("message"); // 사용자 입력값
    const counter = document.getElementById("message-counter")   //p태그
    
    // 0/500
    counter.innerHTML = messageText.value.length + "/ 500";
    if(messageText.value.length > 500)
    messageText.value = messageText.value.substring(0, 500); 
//  위 처럼할 경우 html 요소를 가지고 옴 ,  
// ---> messageText.value ->  요소의 값에 messageText.value.substring(0, 500);를 대입함



//     const messageText = document.getElementById("message").value; 문자열(값자체)
//     messageText = messageText.substring(0, 500); 요소를 가지고 오는게 아니라 값을 가지고 옴
}





//공통 
// * 공통 : 비어있는 문자 불가(전송 버튼 클릭 시)
// - 이름이 비어있다면 alert "이름을 입력해주세요"
// - 이메일이 비어있다면 alert "이메일을 입력해주세요."
// - 메시지가 비어있다면 alert "메시지를 입력해주세요." */}

function getContact3(){
    const nameInput = document.getElementById("name").value; //이름
    const emailInput = document.getElementById("email").value; //이메일

    if(nameInput === "") { //비어있는 문자 불가(로그인 버튼 클릭 시)
        alert("이름을 입력해주세요.");
    }
    else if(emailInput === ""){
        alert("이메일을 입력해주세요.");
    }
    
    
}
