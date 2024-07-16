import Child from "../components/06_Child"; // 자식 component

export default function PropsPage() { // 부모 component
    const numbers = Array.from({ length: 10000000}, (_, i) => i);

    console.time("A : ");
    const A = numbers.map((number) => number * 2);
    console.timeEnd("A : ");

    console.time("B : ");
    const B = numbers.filter((number) => number % 2 === 0);
    console.timeEnd("B : ");


    return (
        <Child size={300}
                dog={
                    {name: "강아지", imageURL: "/src/assets/bombom.jpg"}}
                    name="뭉봄이"
                    count={0}
                /> // 자바스크립트 객체 타입으로 보냄
    );
}