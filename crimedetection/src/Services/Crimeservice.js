import axios from "axios";
const user_api_url="http://localhost:8080/api/v1/Crime";

class Crimeservice{
    savecrime(c){
        return axios.post(user_api_url,c);
    }
}
export default new Crimeservice();