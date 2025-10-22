const shoppingcart=({items})=> {

  return (
    <>

    <h1>Shopping cart</h1>

    <ul>
      {items.map((items,index) =>
       <li key={index}>{items}</li>
      )}
    </ul>
    </>
  )
}

export default shoppingcart;