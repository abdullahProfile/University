import express from 'express';
import cors from 'cors';
import bodyParser from 'body-parser';
import studentRoutes from './controller/controller.js';

const app = express();
const PORT = 3000;

app.use(cors());
app.use(bodyParser.json());

app.use('/students', studentRoutes);

app.listen(PORT, () => {
  console.log(`Server running at http://localhost:${PORT}`);
});