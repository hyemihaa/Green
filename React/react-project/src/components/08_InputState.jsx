import { useState } from "react";

export default function InputState() {
    const [inputValue, setInputValue] = useState(""); // 사용자로부터 받는 입력값
    const [addResult, setAddResult] = useState(null); // 더한 값을 저장
    
    function add() {
        // console.log(typeof inputValue); -> string
        const numberValue = parseInt(inputValue); // 숫자로 형 변환
        setAddResult(numberValue + 10);

        // NaN : Not a Number -> 숫자가 아니다
        if(isNaN(numberValue)) {
            // 숫자가 아니면 true
            setAddResult("유효한 숫자가 아닙니다.");
        }
        else {
            setAddResult(numberValue + 10);
        }

    }

    return (
        <>
            <input type="text" onChange={(e) => setInputValue(e.target.value)}/>
            <button onClick={add}>10 더하기</button>
            {addResult !== null && <p> 결과 : {addResult} </p>}
            {/* 더한 값 출력 */}
        </>
    )
}