import React,{useState} from "react";
import { useNavigate } from "react-router-dom";
import Crimeservice from "../Services/Crimeservice";
import axios from "axios";
import {toast} from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';

export default function Crimepoll(){
    const Navigate=useNavigate();
    const [errormessage,seterror]=useState('');
    const [selectedValue, setSelectedValue] = useState({
        crimetype:""
    }); 

    const handleRadioChange = (event) => {
        const value=event.target.value;
        setSelectedValue({...selectedValue,[event.target.name]:value}); // Update the selected value in state
  };

  const handleSubmit = async(e) => {
    e.preventDefault();
    const respo=await axios.post('http://localhost:8080/api/v1/Crime',selectedValue);
    if(respo.status===200){
        window.location.href='/sucess'
    }else{
        toast('Invalid input or make sure to enter all details');
    }
  }

  return (
    <div className="background-container" >
      <div className="boxStyle">
        <p className="heading">What type of crime?</p>
      <label className="label">
        <input className="input1" type="radio"
          name="crimetype"
          value="murder"
         // checked={selectedValue === "murder"}
          onChange={handleRadioChange}
        />
       Murder</label><br/>
      <label className="label">
        <input
        className="input1"
          type="radio"
          name="crimetype"
          value="theft"
         // checked={selectedValue === "theft"}
          onChange={handleRadioChange}
        />
       Theft
       </label><br/>
       <label className="label">
        <input
        className="input1"
          type="radio"
          name="crimetype"
          value="sexual"
          //checked={selectedValue === "sexual"}
          onChange={handleRadioChange}
        //  placeholder="Murder"
        />
        Sexual haressement
        </label><br/>
        <label className="label">
        <input
        className="input1"
          type="radio"
          name="crimetype"
          value="cyber"
         // checked={selectedValue === "cyber"}
          onChange={handleRadioChange}
        />
        Cyber crime
        </label >
      <button className="but" onClick={handleSubmit}>Submit</button>
    </div>
    </div>
  );
 
}



