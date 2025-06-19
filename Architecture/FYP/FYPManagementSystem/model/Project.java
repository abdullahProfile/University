package model;

public class Project {
    private String title;
    private String category;
    private String assignedGroupId;

    public Project(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public void assignGroup(String groupId) {
        this.assignedGroupId = groupId;
    }

    public String getAssignedGroupId() {
        return assignedGroupId;
    }
}