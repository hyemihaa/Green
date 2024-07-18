import { configureStore } from "@reduxjs/toolkit";
import counter from "../modules/counter";
import FreeListSlice from "../modules/board/free/FreeListSlice";

export default configureStore({
    reducer: {
        counter: counter,
        freeList: FreeListSlice
    },
});