import { useState } from "react";

export default function StateQuiz3() {
  const [q3Name, setQ3Name] = useState();
  const [q3Age, setQ3Age] = useState();
  const [q3Msg, setQ3Msg] = useState();
  const [q3MsgColor, setQ3MsgColor] = useState("black");

  function q3AgeCheck() {
    if (isNaN(q3Age)) {
      setQ3Msg("나이를 유효한 숫자로 입력하세요.");
      setQ3MsgColor("red");
    } else if (q3Age >= 18) {
      setQ3Msg(q3Name + "님, 안녕하세요! 성인 분이시군요.");
      setQ3MsgColor("black");
    } else if (q3Age < 18) {
      setQ3Msg(q3Name + "님, 안녕하세요! 미성년자 분이시군요.");
      setQ3MsgColor("black");
    }
  }

  return (
    <>
      <h3>
        Q3. 사용자의 이름과 나이를 출력입력 받고, 확인 버튼을 누르면 innerHTML을
        활용해 div 태그에 환영 메시지를 출력하세요.
      </h3>
      <p>18세 미만 : `OOO님, 안녕하세요! 미성년자 분이시군요.`</p>
      <p>18세 이상 : `OOO님, 안녕하세요! 성인 분이시군요.`</p>
      <p style={{ color: "red" }}>
        ※ 단, 나이에 숫자를 입력하지 않을 경우 `나이를 유효한 숫자로
        입력하세요.` 출력
      </p>
      <p style={{ color: "red" }}>
        ※ isNaN(나이)을 활용하여 숫자인지 확인할 수 있습니다.
      </p>
      <input
        type="text"
        id="q3-name"
        defaultValue=""
        onChange={(e) => setQ3Name(e.target.value)}
      />
      <input
        type="text"
        id="q3-age"
        onChange={(e) => setQ3Age(e.target.value)}
      />
      <button onClick={q3AgeCheck}>확인</button>
      <div id="welcome" style={{ color: q3MsgColor }}>
        {q3Msg}
      </div>
      <hr />
    </>
  );
}
