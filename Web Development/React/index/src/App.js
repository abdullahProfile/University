import React from 'react';
import './App.css';
import Header from './header';
import Test from './test';
import Log from './login';
import Lab from './lab';
import Hammad from './hammad';
import Box from './box';
import Panel from './panel';
import Shoppingcart from './shoppincart';
import Books from './books';
import Hook1 from './Hook1';
import Btn from './btn';
import AddUser from './userAdd';
import Handelform from './handelForm';
import Timer from './clock';
import BasicForm from './basicform';
import FormTwo from './formtwo';
import Orderfood from './food';
import Fact from './fact';
// import Calulator from './calulator';
function App() {

  const shoppingitem=["hamad","Rafi","Iazaz", "Talha"];
  const books = [
    { id: 1, name: 'Muhammad Umar', marks: 99 },
    { id: 2, name: 'Adil Khan', marks: 50 },
    { id: 3, name: 'Zubair', marks: 83 },
    { id: 4, name: 'Ali Raza', marks: 60 },
    { id: 5, name: 'Hammad', marks: 45 },
  ];

  return (
    <div>
      <Header />
      <Test x={40} y={200} />
      <Log name="abdullah" age={20} isLogin={false} />
      <Lab />
      <Hammad name="Hammad" age={20} />

      <Box color="red" />
      <Box color="black" />

      <Panel panel="admin"/>

      <Shoppingcart items={shoppingitem} />

      <Books books={books} />

      <Hook1 />

      <Btn />

      <AddUser />

      <Timer />

      <BasicForm />

      <FormTwo />

      <Fact />

      <Orderfood />

      {/* <Calulator /> */}

      <Handelform />
    </div>
  );
}

export default App;
