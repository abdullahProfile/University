package Main;

import Registration.AuthService;
import Controller.GroupController;
import Model.User;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AuthService auth = new AuthService();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nAre you already registered? (yes/no): ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("yes")) {
                User loggedInUser = auth.login(scanner);
                if (loggedInUser != null) {
                    System.out.println("Welcome " + loggedInUser.getName() + "!");
                    GroupController groupController = new GroupController();
                    // For the sake of simplicity, adding one student and one supervisor
                    groupController.createGroup(List.of(loggedInUser), loggedInUser, "Sample Project");
                } else {
                    System.out.println("Invalid login. Please try again.");
                }
            } else if (input.equals("no")) {
                if (auth.signUp(scanner)) {
                    System.out.println("Sign up successful!");
                } else {
                    System.out.println("Sign up failed. Please try again.");
                }
            } else {
                System.out.println("Invalid input.");
            }
        }
    }
}
