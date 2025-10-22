var express = require('express');
var app = express();

app.get('/', (req, res) => {
  res.send('Ya Allah meri Madad Farma-Ameen');
});

app.get('/help', (req, res) => {
  res.send(`
    <h1 style="color:red;">God, please help me out.....</h1>
    <a href='/'>Go to Index Page</a>
  `);
});


app.get('/search', (req, res) => {
  console.log('Data sent by client!!!', req.query);
  if (req.query.name) {
    res.send('This is Search Results of Name: ' + req.query.name);
  } else {
    res.send('No query parameters provided.');
  }
});


const PORT = 3000;
app.listen(PORT, () => {
  console.log(`Server is running on http://localhost:${PORT}`);
});
