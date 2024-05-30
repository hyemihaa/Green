// Terminal - tsc명령어 :TypeScript -> JavaScript 변환

let userName:string = "홍길동";
let members:string[]|number[] = ["홍길동", "하혜미"]; // 문자거나 숫자

let members2:[string, number] =["홍길동", 33]; // 순서와 타입 맞춰줘야 함

type IdType = string | number; // type변수는 IdType (관례적으로 문자의 시작을 대문자로)
let id:IdType ="하";

let gender:'M' | 'W' // 성별,.. : 정해진 값이 있는 경우

console.log(userName);

// 함수 
function testFunc(num:number) :number { // 변수명:데이터타입:반환되는 데이터 타입
    return 1;
}
testFunc(10);

// 객체
type ObjType = {
    // name: string,
    // age: number,
    // adds?: string // 키(속성)? -> 있어도 되고 없어도 된다
    [key:string] : string // 키(속성)의 개수 조절가능 -> 그대신 string타입
}

let obj:ObjType = {
    name: "문자열",
    age: "20",
    age2: "20",
    age3: "20"
}