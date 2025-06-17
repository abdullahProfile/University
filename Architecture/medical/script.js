import { symptomDatabase } from './data/symptoms-database.js';

const form = document.getElementById('symptom-form');
const input = document.getElementById('symptom-input');
const resultsDiv = document.getElementById('results');
const adviceDiv = document.getElementById('ai-advice');

// Dummy AI advice based on keywords
function getFreeAIAdvice(symptom) {
  const lowerSymptom = symptom.toLowerCase();
  if (lowerSymptom.includes('chest')) {
    return 'Chest pain can be serious. Seek immediate medical help if it is severe, crushing, or accompanied by shortness of breath.';
  } else if (lowerSymptom.includes('headache')) {
    return 'Headaches are often due to stress, dehydration, or screen time. Rest, hydration, and reducing stress may help.';
  } else if (lowerSymptom.includes('fever')) {
    return 'Fever is a sign your body is fighting an infection. Stay hydrated and monitor your temperature.';
  } else if (lowerSymptom.includes('cough')) {
    return 'A cough could be caused by a cold, flu, or allergies. If it lasts more than a week, consult a doctor.';
  } else {
    return 'Sorry, specific advice is not available. Please consult a healthcare professional for further guidance.';
  }
}

form.addEventListener('submit', async (e) => {
  e.preventDefault();
  const userSymptom = input.value.toLowerCase().trim();
  if (!userSymptom) {
    resultsDiv.innerHTML = '<p>Please enter a symptom.</p>';
    return;
  }

  const match = symptomDatabase.find(item => userSymptom.includes(item.symptom));
  if (match) {
    resultsDiv.innerHTML = `
      <h3>Possible Conditions:</h3>
      <ul>
        ${match.possibleConditions.map(c => `<li>${c}</li>`).join('')}
      </ul>
    `;
  } else {
    resultsDiv.innerHTML = '<p>No matching symptom found. Try a different one.</p>';
  }

  adviceDiv.innerHTML = '<p>Generating free advice...</p>';
  const advice = getFreeAIAdvice(userSymptom);
  adviceDiv.innerHTML = `<h3>AI Advice:</h3><p>${advice}</p>`;

  input.value = '';
});
