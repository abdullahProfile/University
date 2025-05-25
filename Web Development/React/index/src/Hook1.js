import React, {use, useState} from 'react';

function Hook1(){
  const [x, setX]= useState(0);
 
  const add =() => {
    setX(x+1);
  }

  const reduce=()=>{
    setX(x-1);
  }

  const reset=()=> {
    setX(0);
  }
  return (
    <>
     <h1>Number:{x}</h1>

     <button onClick={add}>click Add</button>

     <button onClick={reduce}>reduce</button>

     <button onClick={reset}>Reset</button>
    </>
  )
}

export default Hook1;