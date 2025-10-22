function lab(props) {
  let hrs=new Date() .getHours();
  let str='';
  if(hrs > 12) {
    str=<h1>Good Evening Man</h1>
  }else {
    str=<h2>Good Morning</h2>
  }

  return (
   <h3>{str}</h3>
  )
}

export default lab;