import { useState } from "react"

const Handelform=()=> {

  const [name, setname]=useState("");
  const [password,setpassword]=useState("");
  const [printname,setPrintName]=useState("");
  const {printPassword,setPrintPaswrod}=useState("");

  const handelName =(e)=> {
    setname(e.target.value);
  }

  const handelPassword = (e) => {
    setpassword(e.target.value)
  }

  const handelSumit=(e)=> {
    e.preventDefault();
    setPrintName(name);
    setPrintPaswrod(password)
  }
  return (
    <div>
      <form>
        <input type="text" value={name} onChange={handelName} placeholder="Enter Your Name"/>
        <input type="password" value={password} onChange={handelPassword} placeholder="Enter Password"/>

        <input type="submit" value="Submit"/>
      </form>

      {printname && <h2>{printname}</h2>}
      {printPassword && <h2>{printPassword}</h2>}
    </div>
  )
}

export default Handelform