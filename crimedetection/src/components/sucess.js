import React from "react";

import { Pie ,Cell,index} from 'react-chartjs-2';
import { Chart } from "chart.js/auto";
import Piechart from "./chart";
import { Colors } from "chart.js";
import axios from "axios";


const encodedValue = encodeURIComponent("theft");
const r =await axios.get(`http://localhost:8080/api/v1/counttype?crimetype=${encodedValue}`);

const e = encodeURIComponent("murder");
const r1 =await axios.get(`http://localhost:8080/api/v1/counttype?crimetype=${e}`);

const e2 = encodeURIComponent("sexual");
const r2 =await axios.get(`http://localhost:8080/api/v1/counttype?crimetype=${e2}`);

const e3 = encodeURIComponent("cyber");
const r3 =await axios.get(`http://localhost:8080/api/v1/counttype?crimetype=${e3}`);

//const r=await axios.get('')

const labels=['Sexual harssement', 'Cyber crime', 'Theft','Murder']
const data = {
  labels:labels,
  datasets: [
    {
      label:"Poll results",
      backgroundColor: ['red','blue','green','yellow'],
      borderColor:"rgb(0,0,255)",
      data:[r2.data,r3.data,r.data,r1.data]
    //  hoverBackgroundColor: ['#FF6384', '#36A2EB', '#FFCE56'],
    },
  ],
};

const options={
  maintainAspectRatio:false,
  responsive:true,
  elements:{
    arc:{
      borderWidth:1,
    },
    },
    plugins:{
      legend:{
        display:true,
      },
      tooltrip:{
        callbacks:{
          labels:function(context){
            return context.labels+ ':'+context.parsed+'%';
          }
        }
      }
    },
    radius:'75%',
  };  


const Sucess = () => {
 

  return (
    <div  style={{width:'400px', height:'300px'}}>

      
      <h2 className="heading">Pie Chart Example</h2>
      <Pie data={data} options={options}/>
      
    </div>
  );
};

export default Sucess;

       
