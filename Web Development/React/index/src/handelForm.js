import { useState } from "react"

const Handelform=()=> {
  const [input,setinput]=useState("");
  const[printInput, setFromInput]=useState("");

  const [password,setPassword]=useState("");
  const [printFormPass, setFromPass]=useState("");

  const handelInput = (e) => {
    setFromInput(e.target.value);
    setinput(e.target.value);
  }

  const handelPassword = (e) => {
    setFromPass(e.target.value);
    setPassword(e.target.value);
  }

  return (
    <div>
      <form>
        <input type="text" onChange={handelInput} value={input} placeholder="Enter Your Name"></input>
        <input type="password" onChange={handelPassword} value={password} placeholder="Enter Password"></input>
        <button type="submit">Submit</button>
      </form>

      {printInput && <p>{printInput}</p>}
      {printFormPass && <p>{printFormPass}</p>}
    </div>
  )
}

export default Handelform;