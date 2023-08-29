import React from "react";
import { useNavigate } from "react-router-dom";
import { useState } from "react";
import complaintservice from "../Services/complaintservice";
import axios from "axios";
import {toast} from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';

export default function Complaintform(){
    const Navigate=useNavigate();
    const [error,seterror]=useState('');
    const [aadhar,setaadhar]=useState('');
    const [name,setname]=useState('');
    const [requestdata,setrequest]=useState({
        name:"",
        aadhar:""
    });
    const [complaint,setcomplaint] = useState ({
        id: "",
        aadhar: "",
        loc: "",
        date: "",
        descp: ""
        
        }); 

   const handlechange=(e)=>{
    const value=e.target.value;
    setcomplaint({...complaint,[e.target.name]:value});

    if(e.target.name==="aadhar"){
        setrequest({...requestdata,[e.target.name]:value})
    }
    if(e.target.name==="name"){
        setrequest({...requestdata,[e.target.name]:value});
    }
   }

    const handlebutton=async(e)=>{
        e.preventDefault();
        const response=await axios.post('http://localhost:8080/api/v1/check-aadhar',requestdata);
        if(response.data){
            const respo=await axios.post('http://localhost:8080/api/v1/Complaint',complaint);
            if(respo.status===200){
                Navigate('/crimepoll');
            }

        }
        else{
            toast.error('The provided aadhar number is not registered with us',{
                onClose:()=>{
                    setcomplaint('');
                }
            });
            
            }
        }
     
       
    
    return(
        <div className="background-container">
            <div className="boxStyle1">
            <p className="heading"> New complaint form</p>
            <form onSubmit={handlebutton}>
            <label className="labeling">Full name</label>
            <input className="input" type="text" name="name" value={complaint.name} onChange={handlechange} placeholder="enter your name" required/>
            <label className="labeling">Aadhar number</label>
            <input className="input" type="text" name="aadhar" value={complaint.aadhar} onChange={handlechange} placeholder="enter Aadhar number" required/>
            <label className="labeling">Location of crime</label>
            <input className="input" type="text" name="loc" value={complaint.loc} onChange={handlechange} placeholder="enter loaction of crime" required/>
            <label className="labeling">Crime date</label>
            <input className="input" type="date" name="date" value={complaint.date} onChange={handlechange} placeholder="enter date of crime" required/>
            <label className="labeling">Description</label>
            <input className="input" type="textarea" name="descp" value={complaint.descp} onChange={handlechange} placeholder="enter description about crime" required/>
            <button className="but" type="submit" >Submit</button>
            </form>
        </div>
        </div>
    )
}