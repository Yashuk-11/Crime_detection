import React,{useState} from "react";
import { useNavigate} from 'react-router-dom'
import { Link } from "react-router-dom";
import axios from "axios";
import {ToastContainer, toast} from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import './style.css';

export default function Home(){

  const Navigate=useNavigate();
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
 
  const handleUsernameChange = (event) => {
    setEmail(event.target.value);
  };
      
  const handlePasswordChange = (event) => {
    setPassword(event.target.value);
  };

  const handlebutton=async(e)=>{
    e.preventDefault();
    const respons=await axios.post('http://localhost:8080/api/v1/check-password',{
      email: email,
      password: password
    });

  const match=respons.data;
    if(match){
     
          window.location.href='/Complaintform';
    }
    else{
      toast.error('Invalid email or password',{
        onClose:()=>{
          setEmail('');
          setPassword('');
        }
      });
    }
  };

  return(
    <div className="background-container" >
      <div className="boxStyle">
        <p className="heading">Login page</p>
        <form onSubmit={handlebutton}>
        <label className="labeling">Enter your id</label>
        <input className="input" type="text" value={email} onChange={handleUsernameChange} placeholder="Enter email id" required/><br></br>
        <label className="labeling">Password</label>
        <input className="input" type="password" value={password} onChange={handlePasswordChange} placeholder="Enter password" required/>
        <button  type="submit" className="but" >Login </button> 
        </form>
        <p className="signup-link">Don't have an account?<Link to="/signup">  Signup</Link></p>
      </div>
    </div>
  )
}