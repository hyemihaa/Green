import { useState } from "react";

export default function BooleanState() {
    // 버튼 클릭 됐을 때 텍스트를 숨기고
    // 다시 클릭되면 텍스트를 보여지게 하는 코드
    const [isClick, setIsClick] = useState(true);

    return (
        <>  
            <button onClick={() => setIsClick(!isClick)}>
                {isClick ? "Hide" : "Show"}
            </button>
            {isClick && <p>안녕하세요!</p>}
            {/* isClick가 true 일때 && 실행 */}
        </>
    )
}