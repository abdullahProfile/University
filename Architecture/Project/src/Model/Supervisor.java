package Model;

import java.util.ArrayList;
import java.util.List;

public class Supervisor extends User {
    private List<Integer> superviseeIds;
    private List<Project> supervisedProjects;

    public Supervisor(int userId, String name, String email, String password, String role, List<Integer> superviseeIds) {
        super(userId, name, email, password, role);
        this.superviseeIds = superviseeIds;
        this.supervisedProjects = new ArrayList<>();
    }

    // Getters and methods to manage supervisees and projects
    public List<Integer> getSuperviseeIds() {
        return superviseeIds;
    }

    public void addSupervisee(int studentId) {
        superviseeIds.add(studentId);
    }

    public List<Project> getSupervisedProjects() {
        return supervisedProjects;
    }

    public void addSupervisedProject(Project project) {
        supervisedProjects.add(project);
    }
}
