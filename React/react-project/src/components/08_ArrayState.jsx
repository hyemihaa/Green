import { useState } from "react";

export default function ArrayState() {
    //상태 초기값 설정
    const [items, setItems] = useState(["item-1", "item-2", "item-3"]);

    // 상태 업데이트 (아이템 추가)
    function addItem() {
        setItems((items) => [...items, "new-item"]);
    }

    // 상태 업데이트 (특정 아이템 삭제)
    function deleteItem(index) {     // _ : 쓰지 않는 매개변수 (요소를 쓰지 않는다)
        setItems((items) => items.filter((_, i) => i !== index));
    }                       // filter : 배열 순회 -> 특정 조건 -> 새로운 배열 반환

    // item-2 삭제 버튼을 클릭했을때
    // items = ["item-1", "item-2", "item-3"]
    // i = 0, index = 1  -> return 0 !== 1 -> true -> 새로운 배열을 반환
    // 결과 : ["item-1"]

    // items = ["item-1", "item-2", "item-3"]
    // i = 1, index = 1  -> return 0 !== 1 -> false -> 반환 X
    // 결과 : ["item-1"]

    // items = ["item-1", "item-2", "item-3"]
    // i = 2, index = 1  -> return 0 !== 1 -> true -> 새로운 배열을 반환
    // 결과 : ["item-1", "item-3"]

    function updateItem(index, newItem) {
        setItems((items) => items.map((item, i) => (i === index ? newItem : item)))
        // item-2 변경 버튼을 클릭했을때
        // index : 1, newItem : "변경됨"
        // items = ["item-1", "item-2", "item-3"]

        // item : "item-1", i = 0
        // i === index -> 0 === 1 -> flase -> return item
        // ["item-1"]

        // item : "item-2", i = 1
        // i === index -> 1 === 1 -> true -> return newItem
        // ["item-1", "변경됨"]

        // item : "item-3", i = 2
        // i === index -> 2 === 1 -> flase -> return item
        // ["item-1", "변경됨", "item-3"]

    }


    return (
        <>
            <ul>
                {items.map((item, index) => (
                    <li key={index}>
                        {item}
                        {/* 화살표 함수를 사용하면 즉시 실행을 방지한다고 생각 */}
                        <button onClick={() => updateItem(index, "변경됨")}>변경</button>
                        <button onClick={() => deleteItem(index)}>삭제</button>
                    </li>
                ))}
            </ul>
            <button onClick={addItem}>Add Item</button>
        </>
    )
}