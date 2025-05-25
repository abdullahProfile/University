package Model;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private int projectId;
    private String title;
    private String description;
    private List<Document> documents;
    private List<Evaluation> evaluations;

    public Project(int projectId, String title, String description) {
        this.projectId = projectId;
        this.title = title;
        this.description = description;
        this.documents = new ArrayList<>();
        this.evaluations = new ArrayList<>();
    }

    // Getters and Setters
    public int getProjectId() {
        return projectId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public List<Evaluation> getEvaluations() {
        return evaluations;
    }

    // Methods to add documents and evaluations
    public void addDocument(Document document) {
        documents.add(document);
    }

    public void addEvaluation(Evaluation evaluation) {
        evaluations.add(evaluation);
    }
}
