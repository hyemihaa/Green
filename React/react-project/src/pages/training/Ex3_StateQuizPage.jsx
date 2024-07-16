import StateQuiz1 from "../../components/training/Ex3_StateQuiz1";
import StateQuiz2 from "../../components/training/Ex3_StateQuiz2";

export default function StateQuizPage() {
    return (
    <>
    <h3>Q1. 사용자의 이름을 입력받고, 확인 버튼을 누르면 OOO님 환영합니다 를 alert으로 출력하세요.</h3>
    <StateQuiz1></StateQuiz1>
    <hr/>

    <h3>Q2. 몇단을 출력할지 입력받고, 확인 버튼을 누르면 innerHTML을 활용해 구구단의 합계를 div 태그에 출력하세요.</h3>
    <StateQuiz2></StateQuiz2>
    <hr/>

    <h3>Q3. 사용자의 이름과 나이를 출력입력 받고, 확인 버튼을 누르면
        innerHTML을 활용해 div 태그에 환영 메시지를 출력하세요.</h3>
    <p>18세 미만 : OOO님, 안녕하세요! 미성년자 분이시군요.</p>
    <p>18세 이상 : OOO님, 안녕하세요! 성인 분이시군요.</p>
    <p style={{color: "red"}}>※ 단, 나이에 숫자를 입력하지 않을 경우 나이를 유효한 숫자로 입력하세요. 출력</p>
    <p style={{color: "red"}}>※ isNaN(나이)을 활용하여 숫자인지 확인할 수 있습니다.</p>
    <input type="text" id="q3-name" value=""/>
    <input type="text" id="q3-age"/>
    <button onClick="ageCheck()">확인</button>
    <div id="welcome"></div>
    <hr/>
    
    <h3>Q4. 사용자로부터 숫자를 하나 입력받아 확인 버튼을 누르면
        홀수인지 짝수인지 판별하고, inerrHTML을 활용해 div 태그에 출력하세요.
    </h3>
    <input type="text" id="q4-number"/>
    <button onClick="numberCheck()">확인</button>
    <div id="number" style={{color: "blue"}}></div>
    <p>출력 : 입력한 숫자는 짝수입니다.</p>
    <p>출력 : 입력한 숫자는 홀수입니다.</p>
    <p style={{color: "red"}}>※ 홀수는 빨간색, 짝수는 파란색으로 출력</p>
    <hr/>

    <h3>
        Q5. 입력 받은 값이 0 또는 12 이상일 경우, 
        “값이 너무 크거나 작습니다.”를 출력 하시오.
    </h3> 
    <input type="text" id="q5-num"/>
    <button onClick="q5Num()">확인</button>
    <div id="q5-result"></div>

    <br/>

    <hr/>
    <h3> Q6. 입력 받은 월에 따라 계절을 출력 하시오.
        1. 스캐너로 사용자로부터 몇 월인지 입력 받으세요.
        2. 해당하는 계절과 출력 메시지는 아래와 같습니다.
        3, 4, 5 : 봄
        6, 7, 8 : 여름
        9, 10, 11 : 가을
        12, 1, 2 : 겨울
        그 외 : 해당하는 계절이 없습니다.
        ex) 1을 입력 받을 경우 “겨울” 출력
        3. 위의 예시를 활용하여 OR 연산자 또는 AND 연산자를 활용하여 문제를 풀어보세요.
    </h3> 
    <input type="text" id="q6-num"/>
    <button onClick="season()">확인</button>
    <div id="q6-result"></div>
    </>
    );
}