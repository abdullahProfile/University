import { useState } from "react";
const Calulator = () => {
  const [input, setinput]=useState("");
  const [result, setResult]=useState("");

  const handelInput = (value) => {
    setinput(input + value);
  }

  const handEqual = () => {
    try {
      setResult(eval(input))
    }catch(error) {
      alert("Error");
    }
  };

  const handelClear= () => {
    setinput("");
    setResult("");
  }

  return (
    <div>
      <input type="text" value={input} readOnly></input>

      <div>
        <button onClick={()=>handelInput("1")}>1</button>
        <button onClick={()=>handelInput("2")}>2</button>
        <button onClick={()=>handelInput("3")}>3</button>
        <button onClick={()=>handelInput("+")}>+</button>
      </div>

      <div>
        <button onClick={()=>handelInput("4")}>4</button>
        <button onClick={()=>handelInput("5")}>5</button>
        <button onClick={()=>handelInput("6")}>6</button>
        <button onClick={()=>handelInput("-")}>-</button>
      </div>

      <div>
        <button onClick={()=>handelInput("7")}>7</button>
        <button onClick={()=>handelInput("8")}>8</button>
        <button onClick={()=>handelInput("9")}>9</button>
        <button onClick={()=>handelInput("*")}>*</button>
      </div>

      <div>
        <button onClick={()=>handelInput("0")}>0</button>
        <button onClick={()=>handelInput(".")}>.</button>
        <button onClick={handEqual}>=</button>
        <button onClick={()=>handelInput("/")}>/</button>
      </div>

        <div>Result: {result}</div>
       <button onClick={handelClear}>Clear</button>
    </div>

  )
}

export default Calulator