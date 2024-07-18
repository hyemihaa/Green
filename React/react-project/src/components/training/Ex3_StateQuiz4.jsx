import { useState } from "react";

export default function StateQuiz4() {
  const [q4Number, setQ4Number] = useState(0);
  const [q4Msg, setQ4Msg] = useState();
  const [q4MsgColor, setQ4MsgColor] = useState();

  function q4NumberCheck() {
    if (q4Number % 2 === 0 && q4Number !== 0) {
      // 짝수 일 때
      setQ4Msg("입력한 숫자는 짝수입니다.");
      setQ4MsgColor("blue");
    } else if (q4Number !== 0) {
      setQ4Msg("입력한 숫자는 홀수입니다.");
      setQ4MsgColor("red");
    }
  }
  return (
    <>
      <h3>
        Q4. 사용자로부터 숫자를 하나 입력받아 확인 버튼을 누르면 홀수인지
        짝수인지 판별하고, inerrHTML을 활용해 div 태그에 출력하세요.
      </h3>
      <input
        type="text"
        id="q4-number"
        onChange={(e) => setQ4Number(e.target.value)}
      />
      <button onClick={q4NumberCheck}>확인</button>
      <div id="number" style={{ color: "blue" }} />
      <p style={{ color: q4MsgColor }}>{q4Msg}</p>
      <hr />
    </>
  );
}
