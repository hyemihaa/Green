export default function Rendering({animals}) {

    // 1. map() 사용해서 animals에 있는 요소들을 li태그로 렌더링
    // const animal = animals.map((animal, index) => {
    //     return <li key={index}>{animal}</li>
    // })}
    // 2. filter() 사용해서 animals에 있는 요소들을 li태그로 렌더링
    //    -조건 : 나이가 홀수인 동물만 조회
    // const animalsFilter = animals.filter((animal) => animal.age % 2 === 1);
    // console.log(animalsFilter);
    // const animalsMap = animalsFilter.map((animal, index) => {
        const animalsFilter = animals
        .filter((animal) => animal.age % 2 === 1)
        .map((animal) => {
          return (
            <li key={animal.no}>
              <p>
                이름:{animal.name}, 나이:{animal.age}
              </p>
            </li>
          );
        });
      return (
        <>
          <ul>
            {animalsFilter}
            {/* {animal} */}
            {/* {animals.map((animal, index) => (
              <li key={index}>{animal}</li>
            ))} */}
    
            {/* {animals.map((animal, index) => {
              return <li key={index}>{animal}</li>;
            })} */}
          </ul>
        </>
      );
    }