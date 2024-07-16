import { useParams } from "react-router-dom";
import BackButton from "../components/common/BackButton";

function PathVariable() {
    const {value} = useParams();
    return (
        <div>
            <p>경로파라미터 : {value} </p>
            <BackButton/>
        </div>
    )
}

export default PathVariable;