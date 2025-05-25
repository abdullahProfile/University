package Model;

import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    private List<Project> projects;

    public Student(int userId, String name, String email, String password, String role) {
        super(userId, name, email, password, role);  // Make sure parameters match User constructor
        this.projects = new ArrayList<>();
    }

    // Getter and method to add projects
    public List<Project> getProjects() {
        return projects;
    }

    public void addProject(Project project) {
        projects.add(project);
    }
}
