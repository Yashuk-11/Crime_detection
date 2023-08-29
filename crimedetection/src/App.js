//import logo from './logo.svg';
import './App.css';
import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Home from './components/home'
import Login from './components/signup'
import Complaintform from './components/complaintform'
import Crimepoll from './components/crimepoll';
import Sucess from './components/sucess';
import Userservice from './Services/Userservice';
import popup from './components/popup'
//import crimecar from '/crimecars.jpg'
import complaintservice from './Services/complaintservice';
import { ToastContainer } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import Popup from './components/popup';

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Home />} exact/>
        <Route path="/signup" element={<Login />} />
        <Route path="/Complaintform" element={<Complaintform/>} />
        <Route path="/crimepoll" element={<Crimepoll/>} />
        <Route path="/sucess" element={<Sucess />} />
        
       
        <Route path="/popup" element={<Popup/>} />

      </Routes>
      <ToastContainer position="top-right" />
    </Router>
  );
}

export default App;
