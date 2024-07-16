import { useState } from "react";

export default function StateQuiz2() {
    const [inputDan, setInputDan] = useState("");
    const [addResult, setAddResult] = useState(null);


    function dan() {
        const numberValue = parseInt(inputDan);

        if(isNaN(numberValue)) {
            setAddResult("유효한 숫자가 아닙니다.")
        } 
        else {
            // for(let i = 1; i <= 9; i++) { 
               
            // }
        }
    }
    return (

        <>
        <input type="text" onChange={(e) => setInputDan(e.target.value)}/>
        <button onClick="dan()">확인</button>
        <div>{}</div>
        </>
    )
}