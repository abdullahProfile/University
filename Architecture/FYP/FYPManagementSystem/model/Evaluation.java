package model;

public class Evaluation {
    private String groupId;
    private String criteria;
    private int marks;

    public Evaluation(String groupId, String criteria, int marks) {
        this.groupId = groupId;
        this.criteria = criteria;
        this.marks = marks;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getCriteria() {
        return criteria;
    }

    public int getMarks() {
        return marks;
    }
}
