import { createSlice } from "@reduxjs/toolkit";

//count 초기값 설정
const initialState = {
    count: 0,
};

// 슬라이스
// 구성요소 : 이름, 초기값, 리듀서
const counterReducer = createSlice({
    name: "counter", // 슬라이스 이름
    initialState, // 초기값

    // 상태 변경 함수들 정의
    reducers: {
        increment: state => {
            // 리듀서
            state.count += 1;
        },
    },
});

// 리듀서 : 상태를 변경하는 함수 (state, action을 매개변수로 받아 사용)
// 액션 : 상태에 어떠한 변화가 필요할 때 발생시키는 하나의 객체

export const {increment} = counterReducer.actions;
export default counterReducer.reducer;