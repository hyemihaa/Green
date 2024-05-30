{/* <포트폴리오> 클릭했을 때 
 - 제목은 최대 100글자까지 가능
 - 제목이 100글자를 초과하면 alert "제목이 너무 깁니다." 

 * 공통 : 비어있는 문자 불가(새로운 프로젝트 추가하기 버튼 클릭 시)
 - 제목이 비어있다면 alert "제목을 입력해주세요"
 - 설명이 비어있다면 alert "설명을 입력해주세요." */}
 
 
// function getportfolio() {
//  document.getElementById("add-project-button").addEventListener('click', function() {
//     const projectTitle = document.getElementById("project-title"); // 제목
//     const projectDescription = document.getElementById("project-description"); // 설명
//     const inputArea = document.getElementById("input-area"); // div 태그

//     if(projectTitle.value.length > 100) {
//       alert("제목이 너무 깁니다.");
//     } else if(projectTitle.value === "") {
//       alert("제목을 입력해주세요.");
//     } else if(projectDescription.value === "") {
//       alert("내용을 입력해주세요.");
//     }

//     const h3Element = document.createElement("h3"); // h3 요소 생성
//     h3Element.innerHTML = projectTitle.value;

//     const pDes = document.createElement("p") // p 요소 생성
//     pDes.innerHTML = projectDescription.value;

//     inputArea.appendChild(h3Element);
//     inputArea.appendChild(pDes);
//   })

// }





function getportfolio() {
    // const projectTitle = document.getElementById("project-title"); // 제목
    // const titleLength = projectTitle.value.length;
    const projectTitle = $("#project-title");
    const titleLength = projectTitle.val().length;
    
    if(titleLength > 100) {
        alert("제목이 너무 깁니다."); 
    }
    else if(projectTitle.val() === "") {
        alert("제목을 입력해주세요");
    }
    else if(description.val() === "") {
        alert("설명을 입력해주세요");
    }
    
}

function getportfolio2() {
    const projectTitle = $("#project-title"); // 제목
    const description = $("#project-description"); // 설명란
    const result = $("#result"); // div태그

    // const h3Element = document.createElement("h3"); // h3요소 생성
    // const h3Text = document.createTextNode(projectTitle); //h3요소에 제목
    const h3Element = $("<h3></h3>").html(projectTitle.val());
    
    
    // const pElement = document.createElement("p");// p요소 
    // const pText = document.createTextNode(description)//p요소에 설명란
    const pElement = $("<p></p>").html(description.val())

    if(projectTitle.val() === "") {
        alert("제목을 입력해주세요");
    }
    else if(description.val() === "") {
        alert("설명을 입력해주세요");
    }
    else {
        result.append(h3Element); 
        result.append(pElement); 

    }
}
