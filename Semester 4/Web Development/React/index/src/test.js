function Test(props) {
  let str='';

  if(props.x > props.y){
    str= <div> {props.x} have greater value</div>
  }else {
    str=<p>{props.y} has greater value</p>
  }

  return (
    <h1>{str}</h1>
  )
}

export default Test;