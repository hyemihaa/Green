import { useState } from "react";

export default function StateQuiz1() {
  const [q1Name, setQ1Name] = useState("");

  function q1AlertName() {
    alert(q1Name + "님 환영합니다");
  }

  return (
    <>
      <h3>
        Q1. 사용자의 이름을 입력받고, 확인 버튼을 누르면 `OOO님 환영합니다`를
        alert으로 출력하세요.
      </h3>
      <input
        type="text"
        id="q1-name"
        onChange={(e) => setQ1Name(e.target.value)}
      />
      <button onClick={q1AlertName}>확인</button>
      <hr></hr>
    </>
  );
}
