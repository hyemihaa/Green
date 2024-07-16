import Rendering from "../components/06_Rendering";

export default function RenderPage() {
    // const animals = ["뭉구", "봄이", "뭉봄이"];
    const animals = [
        {name: "봄이", age: "4"},
        {name: "쿠키", age: "3"},
        {name: "뭉구", age: "8"},
    ]

    
    return <Rendering animals = {animals}></Rendering>;
    
}