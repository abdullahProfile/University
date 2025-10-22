const Panel=(props)=> {
  const x = props.panel;

  return (
    <div>
    {x === "admin" ? <h2>Admin Panel</h2> : <h3>User Dashboard</h3>}
    </div>
  );
}

export default Panel;