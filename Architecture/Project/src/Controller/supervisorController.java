package Controller;

import Model.User;

public class supervisorController {
    private User supervisor;

    public supervisorController(User supervisor) {
        this.supervisor = supervisor;
    }

    public void showDashboard() {
        System.out.println("\n--- Supervisor Dashboard ---");
        System.out.println("Welcome, " + supervisor.getName() + "!");
    }

    public void reviewProposal() {
        System.out.println("Reviewing proposal.");
    }

    public void provideFeedback() {
        System.out.println("Providing feedback.");
    }

    public void gradeSubmission() {
        System.out.println("Grading submission.");
    }

    public void defineMilestone() {
        System.out.println("Defining milestone.");
    }
}
