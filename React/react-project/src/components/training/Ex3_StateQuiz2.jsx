import { useState } from "react";

export default function StateQuiz2() {
  const [q2Gugudan, setQ2Gugudan] = useState();
  const [q2Sum, setQ2Sum] = useState();
  let sum = 0;

  function gugudan() {
    for (let i = 1; i < 10; i++) {
      sum += q2Gugudan * i;
    }
    setQ2Sum(sum);
  }

  return (
    <>
      <h3>
        Q2. 몇단을 출력할지 입력받고, 확인 버튼을 누르면 innerHTML을 활용해
        구구단의 합계를 div 태그에 출력하세요.
      </h3>
      <input
        type="text"
        id="input-gugudan"
        onChange={(e) => setQ2Gugudan(e.target.value)}
      />
      <button onClick={gugudan}>확인</button>
      <div id="gugudan">{q2Sum}</div>
      <hr />
    </>
  );
}
