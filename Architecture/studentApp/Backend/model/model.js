import fs from 'fs';
const filePath = './backend/data/students.json';

export function getStudents() {
  try {
    const data = fs.readFileSync(filePath, 'utf-8');
    return JSON.parse(data);
  } catch (error) {
    return [];
  }
}

export function addStudent(student) {
  const students = getStudents();
  students.push(student);
  fs.writeFileSync(filePath, JSON.stringify(students, null, 2));
}