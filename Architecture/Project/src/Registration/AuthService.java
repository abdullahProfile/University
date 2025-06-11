package Registration;

import Model.User;
import Model.Student;
import Model.Supervisor;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AuthService {

    public User login(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Simulating the user lookup
        if (username.equals("student1") && password.equals("pass")) {
            return new Student(1, username, "student1@email.com", password, "Student");
        } else if (username.equals("supervisor1") && password.equals("pass")) {
            return new Supervisor(1, username, "supervisor1@email.com", password, "Supervisor", null);
        } else {
            return null;
        }
    }

    public boolean signUp(Scanner scanner) {
        // Asking for user registration details
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.print("Enter role (Student/Supervisor): ");
        String role = scanner.nextLine().trim();

        User newUser = null;
        if ("Student".equalsIgnoreCase(role)) {
            newUser = new Student(1, name, email, password, role);
        } else if ("Supervisor".equalsIgnoreCase(role)) {
            newUser = new Supervisor(1, name, email, password, role, null);
        }

        if (newUser != null) {
            // Writing user data into data.txt
            writeUserToFile(newUser);
            return true;
        } else {
            System.out.println("Invalid role.");
            return false;
        }
    }

    private void writeUserToFile(User user) {
        try {
            FileWriter writer = new FileWriter(new File("data.txt"), true);
            String userData = user.getUserId() + "," + user.getName() + "," + user.getEmail() + "," + user.getPassword() + "," + user.getRole() + "\n";
            writer.write(userData);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
