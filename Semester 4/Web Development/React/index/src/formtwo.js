import { useState } from "react";

const FormTwo = () => {
  const [name, setName] = useState("");
  const [submitN, setSubmitName] = useState("");
  const [submitp, setSubmitPassword] = useState("");
  const [password, setPassword] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();
    setSubmitName(name);
    setSubmitPassword(password);
    setName("");
    setPassword("");
  };

  const handleNameChange = (e) => {
    setName(e.target.value);
  };

  const handlePasswordChange = (e) => {
    setPassword(e.target.value);
  };

  return (
    <div>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          value={name}
          onChange={handleNameChange}
          placeholder="Enter Name"
        />
        <input
          type="password"
          value={password}
          onChange={handlePasswordChange}
          placeholder="Enter Password"
        />
        <button type="submit">Submit</button>
      </form>

      {submitN && <p>Submit Name: {submitN}</p>}
      {submitp && <p>Submit Password: {submitp}</p>}
    </div>
  );
};

export default FormTwo;
