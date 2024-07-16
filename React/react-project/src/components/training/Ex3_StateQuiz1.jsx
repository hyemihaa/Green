import { useState } from "react";

export default function StateQuiz1() {
    const [inputName, setInputName] = useState("");

    function handleClick() {
        alert(inputName + "님 환영합니다.");
    }

    return (
        <>
            <input type="text" onChange={(e) => setInputName(e.target.value)}/>
            <button onClick={handleClick}>확인</button>
        </>
    )
}