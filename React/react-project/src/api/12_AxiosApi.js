import axiosInstance from "./config/axiosConfig";

export const getUser = async () => {
    try{
        const response = await axiosInstance.get(
            "https://jsonplaceholder.typicode.com/users"
        );

        return response.data;
    }
    catch (error) {
        console.log("Error : " + error);
        throw error;
    }
}