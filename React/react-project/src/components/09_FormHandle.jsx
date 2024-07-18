import { useState } from "react";

export default function FormHandle() {
    const [name, setName] = useState("");
    const [email, setEmail] = useState("");

    const handleSubmit = async(event) => { // () = function() 
        event.preventDefault(); // 새로고침 방지

        const params = new URLSearchParams({ //URLSearchParams : 내장되어있는 함수
            name,
            email,
        }).toString()

        try{
            const response = await fetch(
                // "http://localhost:8080/api/test?" + {params}
                `http://localhost:8080/api/test?${params}`,
                {
                    method: "GET",
                }
            );
    
            if(response.ok && response.status === 200) {
                console.log("제출성공");
            }
            else {
                console.log("제출실패");
            }
            console.log(response); 
        }
        catch (error) {
            console.log("에러 발생");
            }
    }

    return (
        <>
            <form onSubmit={handleSubmit}>
                <input type="text" onChange={(e) => setName(e.target.value)} placeholder="이름을 입력해주세요." />
                <input type="email" onChange={(e) => setEmail(e.target.value)} placeholder="이메일을 입력해주세요." />
                <button type="submit">제출</button>
            </form>
        </>
    )
}