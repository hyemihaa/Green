export default function Event() {
function handleClick() {
    alert("클릭되었습니다");
}
    return (
        <button onClick={handleClick}>클릭</button>
    )
}

// 1. 이벤트 리스너 
// AddEventListerner
// 이벤트를 등록, 삭제 등의 작업을 수행

// 2. 이벤트 핸들러
// 이벤트가 발생했을 때 실행할 동작(함수)