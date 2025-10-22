import { useState } from "react";

const Fact = () => {
  const [number, setNumber] = useState("");
  const [factorial, setFactorial] = useState(null);

  const calculateFactorial = (n) => {
    let result = 1;
    if (n === 0 || n === 1) {
      return result;
    } else {
      for (let i = 2; i <= n; i++) {
        result *= i;
      }
      return result;
    }
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    const num = parseInt(number);
    if (!isNaN(num) && num >= 0) {
      const fact = calculateFactorial(num);
      setFactorial(fact);
    } else {
      alert("Enter a valid number");
    }
    setNumber("");
  };

  return (
    <>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          value={number}
          onChange={(e) => setNumber(e.target.value)}
          placeholder="Enter a number to find factorial"
        />
        <button type="submit">Submit</button>
      </form>

      {factorial !== null && (
        <p>Factorial: {factorial}</p>
      )}
    </>
  );
};

export default Fact;
