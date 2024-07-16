// import PrintWorld from "./components/01_PrintWorld";
import { Link } from "react-router-dom";
// 리액트에서 쓰는 <a>태그 -> Link
import "./styles/App.css"

function App() {
  // 자바스크립트 코드작성
  return (
      //HTML 코드 작성 (태그는 1개만 가능) 
    <div>
      <ul>
        <li>
          <Link to="/" className="no-underline">Home</Link>
        </li>
        <li>
          <Link to="/RouterPage" className="no-underline">02_RouterPage</Link>
        </li>
        <li>
          <Link to="/QueryString?age=8&name=혜미" className="no-underline">03_QueryString</Link>
        </li>
        <li>
          <Link to="/PathVariable/혜미" className="no-underline">04_PathVariable</Link>
        </li>
        <li>
          <Link to="/JSX" className="no-underline">05_JSX</Link>
        </li>
        <li>
          <Link to="/PropsPage" className="no-underline">06_PropsPage</Link>
        </li>
        <li>
          <Link to="/RenderPage" className="no-underline">06_RenderPage</Link>
        </li>
        <li>
          <Link to="/EventPage" className="no-underline">07_EventPage</Link>
        </li>
        <li>
          <Link to="/StatePage" className="no-underline">08_StatePage</Link>
        </li>
      </ul>   

      <hr/>
      <h1>Ex1_실습 문제</h1>
      <ul>
        <li>
          <Link to="/training/AboutPage">Ex1_AboutPage</Link>
        </li>
        <li>
          <Link to="/training/AddrPage?addr=안양시">Ex1_AddrPage</Link>
        </li>
        <li>
          <Link to="/training/NamePage/뭉봄">Ex1_NamePage</Link>
        </li>
      </ul>   

      <hr/>
      <h1>Ex2_실습문제</h1>
      <ul>
        <li>
          <Link to="/InlinePage">Ex2_InlinePage</Link>
        </li>
        <li>
          <Link to="/OutStyleSheetPage">Ex2_OutStyleSheetPage</Link>
        </li>
      </ul>

      <hr/>
      <h1>Ex3_실습 문제</h1>
      <ul>
          <li>
            <Link to="/training/StateQuizPage">Ex3_StateQuizPage</Link>
          </li>
      </ul>
    </div>
  );
}

export default App;

