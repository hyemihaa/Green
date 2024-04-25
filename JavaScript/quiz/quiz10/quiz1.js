// Q1
function Q1() {
    const numInput = document.getElementById("numIsNan");

    if(!isNaN(numInput.value)) { // isNaN => not a Number -> 숫자면 false반환 
        alert("숫자입니다.");
    }
    else {
        alert("숫자가 아닙니다.");
    }
}

//Q2
function Q2() {
    const nameInput = document.getElementById("nameChk");

    let nameArr =["홍길동", "이순신", "김선달", "유재석", "강호동"]; // 베열생성
    const getIndex = nameArr.indexOf(nameInput.value); // 사용자가 입력한 이름이 찾는이름의 nameArr배열(인덱스)

    if(getIndex === -1) { // -1 : 존재하지 않음
        alert("이름이 없습니다.");
        console.log(getIndex);
    }
    else {
        alert("이름이 있습니다.");
    }
}

//Q3
function selectAll() {
    const allCheck = document.getElementById("Allchk").checked; // 전체선택 체크버튼 .checked는 속성(true or flase 반환)
    const checkBox = document.getElementsByClassName("checkbox"); // 체크항목

    for(let i = 0; i < checkBox.length; i++) { // 체크항목 하나씩 꺼내기
        checkBox[i].checked = allCheck; // checkBox[i].checked 체크박스 하나하나 속성을 allCheeck 속성에 대입
    }
}


// //Q4
function Q4() {
    const inputNum = document.getElementById("ran");
    let randomNum = Math.floor(Math.random()*100);
    
    if(randomNum >= 1 && randomNum <= 20) {
        inputNum.value = randomNum;
    }
}




//Q9
function Q9() {
    const inputName = document.getElementById("name");
    const inputAge = document.getElementById("age");
    const inputgender = document.getElementById("gender");

    const tbodyIn = document.getElementById("insert"); //tbody

    const trElement = document.createElement("tr"); // tr요소 생성
    const tdElement1 = document.createElement("td"); // td요소 생성
    const tdElement2 = document.createElement("td"); // td요소 생성
    const tdElement3 = document.createElement("td"); // td요소 생성

    const nameText = document.createTextNode(inputName.value); // name입력값
    const ageText = document.createTextNode(inputAge.value); // age입력값
    const genderText = document.createTextNode(inputgender.value); // gender입력값
    

    
    tdElement1.appendChild(nameText); // td요소 > text노드(이름)
    tdElement2.appendChild(ageText);// td요소 > text노드(나이)
    tdElement3.appendChild(genderText);// td요소 > text노드(성별)
    
    trElement.appendChild(tdElement1); // tr요소 > td요소
    trElement.appendChild(tdElement2); // tr요소 > td요소
    trElement.appendChild(tdElement3); // tr요소 > td요소
    
    tbodyIn.appendChild(trElement); // tbody요소 > tr요소 
    
}

//Q10 
function Q10() {
    const gugudan = parseInt(document.getElementById("dan").value);  // 1단 ~ 9단

    let num = 0;
    for(let i = 1; i < 10; i++) { // (x단) * 1 ~ 9
        num = i * gugudan;
        alert(gugudan.innerHTML = gugudan + "단 : " + num);
    }
}