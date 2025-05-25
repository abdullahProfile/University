import React, { useState } from "react";

const Orderfood = () => {
  const [foodPrice, setFoodPrice] = useState(400);
  const [foodQuantity, setQuantity] = useState(1);
  const [totalBill, setTotalBill] = useState(400);

  const handleFoodChange = (event) => {
    const selectedPrice = parseInt(event.target.value);
    setFoodPrice(selectedPrice);
  };

  const handleQuantityChange = (event) => {
    const enteredQuantity = parseInt(event.target.value);

    if (isNaN(enteredQuantity) || enteredQuantity <= 0) {
      alert("Please enter a valid quantity.");
      return;
    }
    setQuantity(enteredQuantity);
  };

  const calculateBill = () => {
    const bill = foodPrice * foodQuantity;
    setTotalBill(bill);
  };

  return (
    <>
      <select id="food" onChange={handleFoodChange} value={foodPrice}>
        <option value="400">Pizza</option>
        <option value="500">Burger</option>
      </select>

      <select  onChange={handleQuantityChange} value={foodQuantity}>
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
        <option value="5">5</option>

      </select>

      <button type="button" onClick={calculateBill}>
        Calculate Bill
      </button>

      <input
        type="text"
        id="bill"
        value={totalBill}
        readOnly
        placeholder="Total Bill"
      />
    </>
  );
};

export default Orderfood;
