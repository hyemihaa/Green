import { useState } from "react";

export default function StateQuiz5() {
  const [q5Number, setQ5Number] = useState(0);
  const [q5Msg, setQ5Msg] = useState();

  const q5NumberFunction = () => {
    console.log(typeof q5Number);

    // 0:string    0:number
    // string == number  :  데이터 타입을 안보기 때문에 true
    // string === number :  데이터 타입을 확인하기 때문에 false
    if (q5Number == 0 || q5Number >= 12) {
      setQ5Msg("값이 너무 크거나 작습니다.");
    }
  };

  return (
    <>
      <h3>Q5입력 받은 값이 0 또는 12 이상일 경우, 
          “값이 너무 크거나 작습니다.”를 출력 하시오.</h3>
      <input
        type="text"
        id="q5-num"
        onChange={(e) => setQ5Number(e.target.value)}
      />
      <button onClick={q5NumberFunction}>확인</button>
      <div id="q5-result">{q5Msg}</div>
    </>
  );
}
