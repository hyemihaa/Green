import { useState } from "react";

export default function ObjectState() {
    // 객체의 초기값 설정
    const [user, setUser] = useState({name: "John", age: 60});

    // 객체 상태 업데이트
    function UpdateName() {
        setUser(prevUser => ({...prevUser, name: "Jane"})); //...구조 분해 할당(Spread 연산자)
    }
    return (
        <div>
            <p>name: {user.name}</p>
            <p>age: {user.age}</p>
            <button onClick={UpdateName}>UpdateName</button>
        </div>
    )
}