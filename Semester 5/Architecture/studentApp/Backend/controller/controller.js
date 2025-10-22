import express from 'express';
import { getStudents, addStudent } from '../model/model.js';

const router = express.Router();

router.get('/', (req, res) => {
  try {
    const students = getStudents(); // This should be synchronous if reading synchronously from file
    res.json(students);
  } catch (error) {
    res.status(500).json({ error: 'Failed to load students' });
  }
});

router.post('/', (req, res) => {
  try {
    const { regNumber, name, gpa } = req.body;
    const newStudent = { regNumber, name, gpa };
    addStudent(newStudent);
    res.status(201).json({ message: 'Student added', student: newStudent });
  } catch (error) {
    res.status(500).json({ error: 'Failed to add student' });
  }
});

export default router; // ✅ Export default to fix "does not provide an export named 'default'"

