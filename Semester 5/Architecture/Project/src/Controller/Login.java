package Controller;

import Model.User;
import java.util.Scanner;

public class Login {
    public static void proceedAfterLogin(Scanner scanner, User user) {
        System.out.println("Login successful!");
        String role = user.getRole();  // Get role from the User object

        if (role.equals("Student")) {
            studentController studentController = new studentController();
            while (true) {
                System.out.println("\nChoose an action:");
                System.out.println("1. Create Group");
                System.out.println("2. Submit Proposal");
                System.out.println("3. Update Document");
                System.out.println("4. View Feedback");
                System.out.println("5. Track Progress");
                System.out.println("6. Exit");

                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        studentController.createGroup();
                        break;
                    case "2":
                        studentController.submitProposal();
                        break;
                    case "3":
                        studentController.updateDocument();
                        break;
                    case "4":
                        studentController.viewFeedback();
                        break;
                    case "5":
                        studentController.trackProgress();
                        break;
                    case "6":
                        System.out.println("Logging out...");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        } else if (role.equals("Supervisor")) {
            supervisorController supervisorController = new supervisorController(user);
            while (true) {
                System.out.println("\nChoose an action:");
                System.out.println("1. Review Proposal");
                System.out.println("2. Provide Feedback");
                System.out.println("3. Grade Submission");
                System.out.println("4. Define Milestone");
                System.out.println("5. Exit");

                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        supervisorController.reviewProposal();
                        break;
                    case "2":
                        supervisorController.provideFeedback();
                        break;
                    case "3":
                        supervisorController.gradeSubmission();
                        break;
                    case "4":
                        supervisorController.defineMilestone();
                        break;
                    case "5":
                        System.out.println("Logging out...");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        } else {
            System.out.println("Invalid role.");
        }
    }
}
