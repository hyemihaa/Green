function Jsx() {
    const todoClass = "className";
    return (
        <>
            <h1 className={todoClass}>Todo List</h1>
            <ul style={{backgroundColor: "black", color:"hotpink", fontSize:"20px"}}> {/*안의 {} -> 자바스크립트 객체  ,  css인라인방식 거의 사용 X*/}
                <li>잠자기</li>
                <li>먹기</li>
                <li>놀기</li>
            </ul>
        </>
    );
}

export default Jsx;