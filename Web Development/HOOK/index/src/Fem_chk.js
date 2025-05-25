import { useState } from "react"
function Frm_chk(){
const[books, setBooks] = useState([])

const change = (e) =>{
const value = e.target.value;
const checked = e.target.checked;

if(checked){
setBooks([
...books, value
])
}
else{
setBooks(books.filter((e) => (e!==value) ));
}
}
const sub = (e) =>{
e.preventDefault();
console.log(books)
}
return(
<div>
<form onSubmit={sub}>
<input type="checkbox" name="book" value="JAVA" onChange={change}></input>
<label htmlFor="">JAVA</label>
<input type="checkbox" name="book" value="FoxPro" onChange={change}></input>
<label htmlFor="">FoxPro</label>
<input type="checkbox" name="book" value="Pascal" onChange={change}></input>
<label htmlFor="">Pascal</label>
<input type="checkbox" name="book" value="Fortran" onChange={change}></input>
<label htmlFor="">Fortran</label>
<input type="submit"></input>
</form>
<h3>{books}</h3>
</div>
)
}
export default Frm_chk;