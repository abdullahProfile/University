package model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String id;
    private List<String> studentIds = new ArrayList<>();
    private String projectId;
    private String supervisorId;

    public Group(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public List<String> getStudentIds() {
        return studentIds;
    }

    public void addStudent(String studentId) {
        studentIds.add(studentId);
    }

    public void assignProject(String projectId) {
        this.projectId = projectId;
    }

    public void assignSupervisor(String supervisorId) {
        this.supervisorId = supervisorId;
    }
}
