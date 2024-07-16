// 라우터를 사용하기 위해서 필요한 함수 import
import { createBrowserRouter } from "react-router-dom";

// jsx 파일 가져오기(import)
import App from "../../App.jsx";
import RouterPage from '../../pages/02_RouterPage.jsx'; // jsp파일을 불러오는데 RouterPage 별칭으로 부를거다
import QueryString from '../../pages/03_QueryString.jsx';
import PathVariable from '../../pages/04_PathVariable.jsx';
import Jsx from "../../pages/05_JSX.jsx";
import PropsPage from "../../pages/06_PropsPage.jsx";
import RenderPage from "../../pages/06_RenderPage.jsx";
import EventPage from "../../pages/07_EventPage.jsx";
import StatePage from "../../pages/08_StatePage.jsx";

// 사용자 요청 -> react-router -> pages -> components

import AboutPage from "../../pages/training/Ex1_AboutPage.jsx";
import NamePage from "../../pages/training/Ex1_NamePage.jsx";
import AddrPage from "../../pages/training/Ex1_AddrPage.jsx";

import InlinePage from "../../pages/training/Ex2_InlinePage.jsx";
import OutStyleSheetPage from "../../pages/training/Ex2_OutStyleSheetPage.jsx";
// import Home from "./App.jsx";
import StateQuizPage from "../../pages/training/Ex3_StateQuizPage.jsx";


// 경로 설정
const router = createBrowserRouter([
    {
      path: "/", // URL경로
      element: <App/>, // 해당 URL로 왔을 때 이동할 페이지(가져온 파일)
    },
    {
      path: "/RouterPage",
      element: <RouterPage/>,  // import한 별칭
    },
    {
      path: "/QueryString",
      element: <QueryString/>,  // import한 별칭
    },
    {
      path: "/PathVariable/:value",
      element: <PathVariable/>,  // import한 별칭
    },
    {
      path: "/JSX",
      element: <Jsx/>,  // import한 별칭
    },
    {
      path: "/PropsPage",
      element: <PropsPage/>,  // import한 별칭
    },
    {
      path: "/RenderPage",
      element: <RenderPage/>,  // import한 별칭
    },
    {
      path: "/EventPage",
      element: <EventPage/>,  // import한 별칭
    },
    {
      path: "/StatePage",
      element: <StatePage/>,  // import한 별칭
    },


    {
      path: "/training/AboutPage",
      element: <AboutPage/>,  // import한 별칭
    },
    {
      path: "/training/NamePage/:name",
      element: <NamePage/>,  // import한 별칭
    },
    {
      path: "/training/AddrPage",
      element: <AddrPage/>,  // import한 별칭
    },
    {
      path: "/training/InlinePage",
      element: <InlinePage/>,  // import한 별칭
    },
    { 
      path: "/training/OutStyleSheetPage",
      element: <OutStyleSheetPage/>,  // import한 별칭
    },
    
    { 
      path: "/training/StateQuizPage",
      element: <StateQuizPage/>,  // import한 별칭
    },
  ]);

  export default router;