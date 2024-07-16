import { useState } from "react"; // react 라이브러리라고 생각 -> useState 만들어져있는 함수

export default function ClickCount() {
    // 기존 자바스크립트 방식
    // 값 변경 X (리렌더링이 되지 않기 때문에)
    // let count = 0;
    
    // function handleClickCount() {
    //     count++;
    //     alert("클릭 되었습니다!");
    // }
    
    
//  2. 상태 변수(count)와 상태 변경 함수(setCount) 생성   
//   * 상태변경함수에는 관례적으로 앞에 set을 붙인다                          
    const [count, setCount] = useState(0); // 1.초기 상태 설정 (useState를 호출하면서 0으로 초기 설정)

    function handleClickCount() {
        // 3. 상태 업데이트
        setCount((count) => count + 1);
        setCount((count) => count + 1);
        setCount((count) => count + 1);

        // if(count < 10) {
        //     setCount(count + 1);
        // }
        // else {
        //     alert("더이상 클릭할 수 없습니다!");
        // }
    }


    return (
        <>
            <h2>{count}</h2>
            {/* {count < 10 && <h2>{count}</h2>} 
            {count >= 10 && <h2>10</h2>} 10이상 일때 카운트종료*/}
            <button onClick={handleClickCount}>클릭</button>
        </>
    )
}
