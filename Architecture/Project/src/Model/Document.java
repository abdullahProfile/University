package Model;

import java.time.LocalDate;

public class Document {
    private int documentId;
    private String title;
    private String content;
    private LocalDate submissionDate;

    public Document(int documentId, String title, String content, LocalDate submissionDate) {
        this.documentId = documentId;
        this.title = title;
        this.content = content;
        this.submissionDate = submissionDate;
    }

    // Getters
    public int getDocumentId() {
        return documentId;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }
}
