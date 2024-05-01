{/* <포트폴리오> 클릭했을 때 
 - 제목은 최대 100글자까지 가능
 - 제목이 100글자를 초과하면 alert "제목이 너무 깁니다." 

 * 공통 : 비어있는 문자 불가(새로운 프로젝트 추가하기 버튼 클릭 시)
 - 제목이 비어있다면 alert "제목을 입력해주세요"
 - 설명이 비어있다면 alert "설명을 입력해주세요." */}
 

 document.getElementById("add-project-button").addEventListener('click', function() {
    const projectTitle = document.getElementById("project-title"); // 제목 ( 요소 자체를 필요로 할때는 .value를 사용하지 않는다.
    const description = document.getElementById("project-description"); // 설명란
    const result = document.getElementById("result"); // div태그

    if(projectTitle.value.length > 100) {
        alert("제목이 너무 깁니다."); 
    }
    else if(projectTitle.value === "") {
        alert("제목을 입력해주세요");
    }
    else if(description.value === "") {
        alert("설명을 입력해주세요");
    }
    const h3Element = document.createElement("h3"); // h3요소  생성
    h3Element.innerHTML = projectTitle.value; // h3요소에 사용자가 입력한 값 출력
    
    const pElement = document.createElement("p");// p태그 
    pElement.innerHTML = description.value; // p요소에 사용자가 입력한 값 출력

    result.appendChild(h3Element); 
    result.appendChild(pElement);

 })





// function getportfolio() {
//     const projectTitle = document.getElementById("project-title"); // 제목
//     const titleLength = projectTitle.value.length;
    
//     if(titleLength > 100) {
//         alert("제목이 너무 깁니다."); 
//     }
//     else if(projectTitle.value === "") {
//         alert("제목을 입력해주세요");
//     }
//     else if(description.value === "") {
//         alert("설명을 입력해주세요");
//     }
//     else {
//         h3Element.appendChild(h3Text);
//         pElement.appendChild(pText);
        
//         result.appendChild(h3Element); 
//         result.appendChild(pElement); 

//     }
// }

// function getportfolio2() {
//     const projectTitle = document.getElementById("project-title").value; // 제목
//     const description = document.getElementById("project-description").value; // 설명란
//     const result = document.getElementById("result"); // div태그

//     const h3Element = document.createElement("h3"); // h3요소 생성
//     const h3Text = document.createTextNode(projectTitle); //h3요소에 제목
    
//     const pElement = document.createElement("p");// p태그 
//     const pText = document.createTextNode(description)//p요소에 설명란

//     if(projectTitle === "") {
//         alert("제목을 입력해주세요");
//     }
//     else if(description === "") {
//         alert("설명을 입력해주세요");
//     }
//     else {
//         h3Element.appendChild(h3Text);
//         pElement.appendChild(pText);
        
//         result.appendChild(h3Element); 
//         result.appendChild(pElement); 

//     }
// }