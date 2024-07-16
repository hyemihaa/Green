// URL : /Training/NamePage
// <p> 입력된 이름 : [경로파라미터로 가져온 이름] <p>
// 뒤로가기 버튼  

import { useParams } from "react-router-dom";
import BackButton from "../../components/common/BackButton";

function NamePage() {
    const {name} = useParams();
    return (
        <>
        <p>입력된 이름 : {name} </p>
        <BackButton/>
        </>
    )
}

export default NamePage;