import propTypes from "prop-types";

function checkMungBom(name) {
    if(name === "뭉봄이") {
        return <p>강아지의 이름은 뭉봄이 입니다</p>;
    }
    else {
        return <p>뭉봄이가 아닙니다</p>;
    }
}

export default function Child({size, dog, name, count}) {
    const numbers = [1, 2, 3, 4, 5]

    // 기본 numbers배열에서 2를 곱한 배열을 생성
    const doubledNumbers = numbers.map((number) => {
        return number * 2;
    });

    // 배열을 순회하여 새로운 배열을 반환하기 위한 함수
    // * 새로운 배열을 반환하기 때문에 기존 배열의 데이터는 유지됨

    // 기존데이터 : numbers = [1, 2, 3, 4, 5]
    // 1. numbers 배열의 첫번째 값(index:0)을 꺼냄
    //      --> number : 1
    // 2. return number * 2에 의해서 숫자 2가 반환
    // 3. doubledNumbers가 반환을 받아서 배열 [2]

    console.log(doubledNumbers);
    console.log(numbers);

    // filter() 함수
    // 배열을 순회를 하는데 특정 조건에 따라 요소를 필터링, 새로운 배열 생성 후 반환
    const isNumbersThree = numbers.filter((number) => {
        return number === 3;
    });

    console.log(isNumbersThree);




    // 조건부 렌더링(if문)
    // JSP의 if, choose
    // if (name === "뭉봄이") {
        return (
            <>
            {checkMungBom(name)}
            {count === 0 && (
            <>
                <p>뽀삐가 한마리 있습니다</p>
            </>
            )}
            
            <img src={dog.imageURL} 
                 alt={dog.name} 
                 width={size} 
                 height={size}>
            </img>
            
            <hr />
            <h1>map() 함수</h1>
            <ul>
                {doubledNumbers.map((number, index) => (
                    <li key = {index}>{number}</li>
                ))}
                {/* 중괄호 사용할 때 -> return , 자바스크립트 사용 가능 */}
                {doubledNumbers.map((number, index) => {
                    return <li key = {index}>{number}</li>
                })}
            </ul>

            </>
        );
    // }
}

Child.propType = {
    //size를 number타입, 필수로 입력받겠다
    size: propTypes.number.isRequired,
    // shape : 자바스크립트 객체 타입 검사 할 때
    dog: propTypes.shape({
        // imageURL,name은 string타입, 필수로 입력 받겠다
        imageURL: propTypes.string.isRequired,
        name: propTypes.string.isRequired,
    }),

};

