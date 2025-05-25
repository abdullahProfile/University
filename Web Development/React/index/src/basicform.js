import React, { useState } from "react";

const BasicForm = () => {

  const [name, setName] = useState("");
  const [submittedName, setSubmittedName] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();
    setSubmittedName(name);
    setName("");
  };

  return (
    <div>
      <h1>Basic Form</h1>

      <form onSubmit={handleSubmit}>
        <input
          type="text"
          value={name}
          onChange={(e) => setName(e.target.value)}
          placeholder="Enter your name"
        />
        <button type="submit">Submit</button>
      </form>

      {submittedName && <h2>Submitted Name: {submittedName}</h2>}
    </div>
  );
};

export default BasicForm;
