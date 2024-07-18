import { useEffect } from "react"; // DOM이 랜더링 된 이후에 한번만 실행하도록 도와주는 리액트 훅
import { getUser } from "../api/12_AxiosApi";

export default function AxiosPage() {
    useEffect(() => {
        const fetchUser = () => {   
            try{
                const userList = getUser();
                console.log(userList);
            }
            catch(error) {
                console.log("Error : " + error);
            }
        };

        fetchUser();
    });

    return "테스트";
}