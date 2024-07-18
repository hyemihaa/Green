import { useState } from "react";

export default function StateQuiz6() {
  const [q5Number, setQ5Number] = useState(); // 사용자 입력
  const [q5Msg, setQ5Msg] = useState();

  function season() {
    const number = parseInt(q5Number);
    if ([3, 4, 5].includes(number)) {
      setQ5Msg("봄");
    } else if ([6, 7, 8].includes(number)) {
      setQ5Msg("여름");
    } else if ([9, 10, 11].includes(number)) {
      setQ5Msg("가을");
    } else if ([12, 1, 2].includes(number)) {
      setQ5Msg("겨울");
    } else {
      setQ5Msg("해당하는 계정이 없습니다.");
    }
  }

  return (
    <>
      <hr />
      <h3> 입력 받은 월에 따라 계절을 출력 하시오.
        1. 스캐너로 사용자로부터 몇 월인지 입력 받으세요.
        2. 해당하는 계절과 출력 메시지는 아래와 같습니다.
            3, 4, 5 : 봄
            6, 7, 8 : 여름
            9, 10, 11 : 가을
            12, 1, 2 : 겨울
            그 외 : 해당하는 계절이 없습니다.
            ex) 1을 입력 받을 경우 “겨울” 출력
        3. 위의 예시를 활용하여 OR 연산자 또는 AND 연산자를 활용하여 문제를 풀어보세요</h3>
      <input
        type="text"
        id="q6-num"
        onChange={(e) => setQ5Number(e.target.value)}
      />
      <button onClick={season}>확인</button>
      <div id="q6-result">{q5Msg}</div>
    </>
  );
}
