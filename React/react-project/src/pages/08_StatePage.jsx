import ClickCount from "../components/08_State"
import ObjectState from "../components/08_ObjectState"
import ArrayState from "../components/08_ArrayState"
import BooleanState from "../components/08_BooleanState"
import InputState from "../components/08_InputState"

export default function StatePage() {
    return (
    <>  
        <h1>클릭</h1>
        <ClickCount></ClickCount>

        <hr />

        <h1>객체 상태 변경 하기</h1>
        <ObjectState></ObjectState>

        <hr />

        <h1>배열 상태 변경 하기</h1>
        <ArrayState></ArrayState>

        <hr />
        <h1>버튼 토글</h1>
        <BooleanState></BooleanState>

        <hr />
        <h1>인풋 값 받기</h1>
        <InputState/>

    </>
    );
}