// URL : /Training/AddrPage?addr=안양시
// <p> 입력된 주소 : [쿼리스트링에 입력한 주소] <p>
// 뒤로가기 버튼

import BackButton from "../../components/common/BackButton";
import useQuery from "../../components/common/UseQuery";

function AddrPage() {
    const query = useQuery();

    const getAddress = query.get("addr");

    return (
        <>
        <p>입력된 주소 : {getAddress} </p>
        <BackButton/>
        </>
    );
}

export default AddrPage;