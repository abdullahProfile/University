import { useState } from "react";

const AddUser = () => {
  const [data, setData] = useState([
    { name: "Muhammad Abdullah", age: 15, city: "Mardan" },
    { name: "Muhammad hamad", age: 15, city: "Mardan" },
  ]);

  const add = () => {
    const user = { name: "Muhammad Hamad Tariq", age: 15, city: "Mardan" };
    setData([...data, user]);
  };

  return (
    <>
      {data.map((user, index) => {
        return (
          <div key={index}>
            <h2>{user.name} - {user.age} : {user.city}</h2>
          </div>
        );
      })}
      <button onClick={add}>Press Add</button>
    </>
  );
};

export default AddUser;
