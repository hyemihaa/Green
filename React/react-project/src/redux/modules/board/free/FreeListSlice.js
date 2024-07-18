import { createAsyncThunk, createSlice } from "@reduxjs/toolkit";
import { getFreeList } from "../../../../api/board/free/FreeListApi";

//createAsyncThunk 비동기 처리를 도와주는 함수
// params 액션이 호출될 때 전달되는 파라미터
// rejectWithValue 오류 발생 시 사용자가 정의한 오류값을 반환
export const fetchFreeList = createAsyncThunk(
  "getFreeList",
  async (params, {rejectWithValue}) => {
    try{
      const response = await getFreeList(params);
      return response;
    }
    catch (err) {
      return rejectWithValue(err.response.data);
    }
  }
)

const initialState = {
  // 내가 사용할 상태(변수) 정의하는 공간
  list:[],
  row: 0,
  pi: {},
  loading: false,
  error: null
}

const freeListSlice = createSlice({
  name: "freeList",
  initialState,
  reducers: {}, // 상태(변수) 변화시키는 함수
  extraReducers: (builder) => { // 비동기 작업의 상태에 따라서 추가적인 동작을 수행할 리듀서를 사용 가능
    // pending : 작업이 시작된 상태
    builder.addCase(fetchFreeList.pending, (state) => {
      state.loading = true;
      state.error = null;
    })
    //fulfilled: 작업이 성공한 상태
    .addCase(fetchFreeList.fulfilled, (state, action) => {
      state.list = action.payload.list;
      state.row = action.payload.row;
      state.pi = action.payload.pi;
      state.loading = false;
    })
    // rejected: 작업이 실패한 상태
    .addCase(fetchFreeList.rejected, (state, action) => {
      state.loading = true;
      state.error = action.payload;
    });
  },
});

export default freeListSlice.reducer;