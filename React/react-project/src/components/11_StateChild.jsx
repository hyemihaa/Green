import { useSelector } from "react-redux";

export default function StateChild() {
    const count = useSelector((state) => state.counter.count);
    
    return (
        <>
            <h1>StateChild</h1>
            <p> 현재 카운트 값 : {count} </p>
        </>
    );
}