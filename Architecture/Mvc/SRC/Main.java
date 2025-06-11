import java.util.ArrayList;
import java.util.List;
package src;
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.addStudent("SP34-BSE-001", "Ahmed Al-Farsi", 3.7);
        controller.addStudent("SP34-BSE-002", "Fatima Al-Zahra", 3.9);
        controller.addStudent("SP34-BSE-003", "Hassan Al-Mansoori", 2.8);
        controller.addStudent("SP34-BSE-004", "Layla Al-Amiri", 3.2);
        controller.addStudent("SP34-BSE-005", "Omar Al-Khalid", 3.5);

        controller.updateView();
    }
}