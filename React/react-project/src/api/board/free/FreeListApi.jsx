import axiosInstance from "../../config/axiosConfig";

export const getFreeList = async ({ cpage, category, searchText }) => {
  try {
    const response = await axiosInstance.get("/freeBoard", {
      params: {
        cpage: 1,
        category: "fb_title",
        searchText: "",
      },
    });

    return response.data;
  } catch (err) {
    console.log("Axios Failed : " + err);
    throw err;
  }
};
