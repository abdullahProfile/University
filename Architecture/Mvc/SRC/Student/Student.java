package src.Student;
public class Student {
    private String regNumber;
    private String name;
    private double gpa;

    public Student(String regNumber, String name, double gpa) {
        this.regNumber = regNumber;
        this.name = name;
        this.gpa = gpa;
    }

    public String getRegNumber() { return regNumber; }
    public String getName() { return name; }
    public double getGpa() { return gpa; }
}