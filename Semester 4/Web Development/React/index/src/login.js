function log(props){

  return (
    <>
    <h1> age: {props.age} {props.isLogin ? "welcome" :"Please Login"} {props.name}</h1>
    </>
  )
}

export default log;