const btn=document.getElementById("btn");

function btnfun(){
  alert("Good let go you do this");
}

function handelform() {
  const name = document.getElementById("name").value;
  const password = document.getElementById("password").value;
  const text = document.getElementById("text");


  const nameRegex = /^[A-Za-z]+$/;
  const passwordRegex = /^[0-9]+$/;

  if (!nameRegex.test(name)) {
    text.innerHTML = "Name should only contain letters.";
    text.style.color = "red";
    return;
  }

  if (!passwordRegex.test(password)) {
    text.innerHTML = "Password should only contain numbers.";
    text.style.color = "red";
    return;
  }


  text.innerHTML = "Login successful!";
  text.style.color = "green";
}

function calculateBill() {

  const foodSelect = document.getElementById("food");
  const foodPrice = parseInt(foodSelect.value);

  const quantity = document.getElementById("quantity").value;
  const quantityNumber = parseInt(quantity);

  if (isNaN(quantityNumber) || quantityNumber <= 0) {
    alert("Please enter a valid quantity.");
    return;
  }

  const totalBill = foodPrice * quantityNumber;

  const billInput = document.getElementById("bill");
  billInput.value = totalBill;
}

function squarefun() {
  const value = document.getElementById("number").value;
  const resultField = document.getElementById("result");
  const number = parseInt(value);

  // Check for square checkbox
  if (!isNaN(number) && document.getElementById("square").checked) {
    let result = number * number;
    resultField.value = result; // Update the result field with the square value
  } 
  // Check for cube checkbox
  else if (!isNaN(number) && document.getElementById("cub").checked) {
    let result = number * number * number;
    resultField.value = result; // Update the result field with the cube value
  } else {
    resultField.value = ""; // Clear the result field if invalid input or no checkbox is checked
  }
}

document.getElementById("square").addEventListener("change", squarefun);