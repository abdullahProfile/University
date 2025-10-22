package Model;

import java.time.LocalDate;

public class Evaluation {
    private int evaluationId;
    private String evaluatorName;
    private double score;
    private String feedback;
    private LocalDate evaluationDate;

    public Evaluation(int evaluationId, String evaluatorName, double score, String feedback, LocalDate evaluationDate) {
        this.evaluationId = evaluationId;
        this.evaluatorName = evaluatorName;
        this.score = score;
        this.feedback = feedback;
        this.evaluationDate = evaluationDate;
    }

    // Getters
    public int getEvaluationId() {
        return evaluationId;
    }

    public String getEvaluatorName() {
        return evaluatorName;
    }

    public double getScore() {
        return score;
    }

    public String getFeedback() {
        return feedback;
    }

    public LocalDate getEvaluationDate() {
        return evaluationDate;
    }
}
