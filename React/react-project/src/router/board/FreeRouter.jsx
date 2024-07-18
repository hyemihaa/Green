import { Route, Routes } from "react-router-dom";
import FreeListPage from "../../pages/board/free/FreeListPage";

export const FreeRoutes = () => {
  return (
    <Routes>
      <Route path="/list" element={<FreeListPage></FreeListPage>}></Route>
    </Routes>
  );
};
