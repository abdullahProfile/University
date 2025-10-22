package src.View;
import java.util.ArrayList;
import java.util.List;
import src.Student.*;
class View {
    public void printStudents(List<Student> students) {
        System.out.println("Student List:");
        for (Student s : students) {
            System.out.printf("Reg#: %s, Name: %s, GPA: %.2f\n",
                    s.getRegNumber(), s.getName(), s.getGpa());
        }
    }

    public void printStatistics(double avg, double top, double low) {
        System.out.println("\nStatistics:");
        System.out.printf("Average GPA: %.2f\n", avg);
        System.out.printf("Top GPA: %.2f\n", top);
        System.out.printf("Lowest GPA: %.2f\n", low);
    }
}