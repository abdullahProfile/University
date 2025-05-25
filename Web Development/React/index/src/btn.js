import { useState } from "react";

const Btn = () => {
  const [status, setStatus] = useState("OFF");

  const toggleStatus = () => {
    setStatus((prevStatus) => (prevStatus === "OFF" ? "ON" : "OFF"));
  };

  return (
    <>
      <button onClick={toggleStatus}>
        {status}
      </button>
    </>
  );
};

export default Btn;
