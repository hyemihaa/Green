import LiftingChild from "../components/10_LiftingChild"
import StateChild from "../components/10_StateChild"
import { useState } from "react"

export default function LiftingStatePage() {
    const [count, setCount] = useState(0);

    return (
        <>
        <LiftingChild count={count} setCount={setCount}></LiftingChild> {/* 카운트 증가*/}
        <StateChild count={count}></StateChild> {/* 카운트가 몇인지 조회 */}
        </>
    )
}