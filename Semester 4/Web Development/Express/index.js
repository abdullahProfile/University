var express=require('express');

var app=express();

app.get('/', (req,res) =>
{
  app.get('/', (req, res) => {
    res.send(`
      <h1>Welcome to the Home Page</h1>
      <a href="/help">Go to Help Page</a><br>
      <a href="/search?name=Hammad">Search for Hammad</a>
    `);
  });
}
);

app.get('/factorail', (req,res) => {

 const n=parseInt(req.query.t1);

 let fact=1;

  for(let i=2; i<=n; i++){
    fact *= i;
  }

  res.send(`Factorial of ${n} is ${fact}`);
});

app.get('/sqaure', (req,res) => {
  let number=parseInt(req.query.t2);

  res.send(`square of the number is: ${number} is ${number * number}`)
});

app.get('/help', (req,res) =>
{
  res.send("Hamad Khan are you😎:");
}
)

app.get('/searh', (req,res) =>
{
  console.log("Data send by: ", req.query)

  if(req.query.name) {
    res.send("Request send by: " + res.query.name);
  }else {
    res.send("No query parameters provided.");
  }
}
);

const PORT=500;

app.listen(PORT, () => {
  console.log(`Sever is runing on http://localhost:${PORT}`);
});