export default function LiftingChild({count, setCount}) {
    return (
        <>
        <h1>LiftingChild</h1>
        <button onClick={() => setCount(count + 1)}>count증가</button>
        </>
    );
}