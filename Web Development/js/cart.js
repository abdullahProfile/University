function addItem() {
  const food=document.getElementById("food");
  const quantity=document.getElementById("quantity");
  const items=document.getElementById("orderList")

  const foodText = food.options[food.selectedIndex].text;
  const foodquantity=parseInt(quantity.value);
  const foodprice=parseInt(food.value);

  const totalprice=foodquantity * foodprice;

  const itemlis=document.createElement("li");
  itemlis.textContent=`${foodText}: ${foodprice} x ${foodquantity}: $${totalprice}`;

  orderList.appendChild(itemlis);
}