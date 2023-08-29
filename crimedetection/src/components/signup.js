import React from "react";
import { useNavigate } from "react-router-dom";
import { useState } from "react";
import Userservice from "../Services/Userservice";
import axios from "axios";
import {toast} from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';

export default function Login(){
    
    const Navigate = useNavigate()
    const [errormessage,seterror]=useState('');
    const [user,setuser] = useState ({
        id:"",
        name:"",
        email:"",
        password:"",
        address:"",
        aadhar:"",
        gender:"",
        mob:""
        }); 
    
    const handlechange=(e)=>{
        const value=e.target.value;
        setuser({...user,[e.target.name]:value});
    };

    const handlebutton=async(e)=>{
        e.preventDefault();
        const response=await axios.post('http://localhost:8080/api/v1/Crimedetection',user);
        if(response.status===200){
            toast.success('Login sucessfully');
            window.location.href='/Complaintform'
        }else{
            toast('Invalid input or make sure to enter all details');
        }
     };

    return(
        <div className="background-container">
            <div className="boxStyle1">
            <p className="heading">New Registration page</p>
            <form onSubmit={handlebutton}>
            <label className="labeling">Full name </label>
            <input className="input" type="text" name="name" value={user.name} onChange={handlechange} placeholder="Enter your name" required />
            <label className="labeling">Email id</label>
            <input className="input" type="email" name="email" value={user.email} onChange={handlechange} placeholder="Enter your email id" required />
            <label className="labeling">Password</label>
            <input className="input" type="password" name="password" value={user.password} onChange={handlechange} placeholder="Enter password" required/>
            <label className="labeling">Address</label>
            <input className="input" type="textarea" name="address" value={user.address} onChange={handlechange} placeholder="Enter your address" required/>
            <label className="labeling">Aadhar number</label>
            <input className="input" type="text" name="aadhar" value={user.aadhar} onChange={handlechange} placeholder="Enter your adhar number" required/>
            <label className="labeling">Gender</label>
            <select className="input" name="gender" value={user.gender} onChange={handlechange}>
                <option>Select a gender</option>
                <option>Male</option>
                <option>Female</option>
            </select>
            <label className="labeling">Contact number</label>
            <input className="input" type="text" name="mob" value={user.mob} onChange={handlechange} placeholder="Enter your phone number" />
            <button type="submit" className="but" >Signin</button>
            </form>
        </div>
        </div>
    )
}