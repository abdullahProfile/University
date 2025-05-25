import React,{useState} from "react";

const Order=()=> {
  const [foodprice,setfoodprice]=useState("");
  const [foodquantity, setfoodquantity]=useState("");
  const [total, settotal]=useState("");

  const foodpricread=(e)=> {
    setfoodprice(parseInt(e.target.value));
  }

  const foodquantityRec=(e)=> {
    setfoodquantity(parseInt(e.target.value));
  }

  const totalbill=(e)=> {
    e.preventDefault();
    settotal(foodprice * foodquantity);
  }

  return (
    <div>
      <select onChange={foodpricread} value={foodprice}>
        <option value="310">pizza</option>
        <option value="121">piza</option>
        <option value="31131">zza</option>
        <option value="31131">piz</option>
      </select>

      <select onChange={foodquantityRec} value={foodquantity}>
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
      </select>

      <button type="submit" onClick={totalbill}>submit</button>

      <h3>total: <input type="text" value={total}></input></h3>
    </div>
  )
}

export default Order;