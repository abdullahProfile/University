function box({color}){
  const bg={
    backgroundColor: color,
    color: '#fff',
    border: 'none',
    padding: '10px 20px',
    margin: '10px',
    borderRadius: '5px',
    cursor: 'pointer',
  };

  const click=()=> {
    alert("Are You Know Rabeea Hamad");
  }
  return <button style={bg} onClick={click}>Hamad</button>
}

export default box;