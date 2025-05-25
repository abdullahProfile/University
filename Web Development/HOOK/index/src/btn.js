import React,{useState} from 'react';

const Btn=()=> {
  const [on, setoff]=useState("Button is ON");

  const changeMe= () => {
    let test=on;

    if(test == "Button is ON") {
      setoff("Button is OFF");
    }else {
      setoff("Button is OFF");
    }
  }

  return (
    <div>
      <button onClick={changeMe}>On/OFF</button>
    </div>
  )
}

export default Btn;