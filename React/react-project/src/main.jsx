import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App.jsx'
import router from './router/config/RouterConfig.jsx';

// 라우터를 사용하기 위해서 필요한 함수들 import
import { RouterProvider } from "react-router-dom";


ReactDOM.createRoot(document.getElementById('root')).render( // index.html -> root 
  <React.StrictMode>
    {/* 라우터 적용 */}
    <RouterProvider router={router}>
      <App /> 
    </RouterProvider>
  </React.StrictMode>,
)
