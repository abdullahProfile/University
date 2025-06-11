package Model;

import java.util.List;

public class Group {
    private static int groupCounter = 1;
    private int groupId;
    private List<User> students;
    private User supervisor;
    private String projectTitle;

    public Group(List<User> students, User supervisor, String projectTitle) {
        this.groupId = groupCounter++;
        this.students = students;
        this.supervisor = supervisor;
        this.projectTitle = projectTitle;
    }

    public int getGroupId() {
        return groupId;
    }

    public List<User> getStudents() {
        return students;
    }

    public User getSupervisor() {
        return supervisor;
    }

    public String getProjectTitle() {
        return projectTitle;
    }
}
