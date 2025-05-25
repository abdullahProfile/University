function hammad(props){

  let str='';

  if(props.age >= 20){
    str=<p>{props.name} lotta</p>
  }else {
    str=<p>Gandu</p>
  }

  return (
    <>
    <h1>{str}</h1>
    </>
  )
}

export default hammad;