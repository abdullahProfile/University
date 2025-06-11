package src.Controller;
class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void addStudent(String regNumber, String name, double gpa) {
        Student s = new Student(regNumber, name, gpa);
        model.addStudent(s);
    }

    public List<Student> getStudents() {
        return model.getStudents();
    }

    public double getAverageGpa() {
        List<Student> students = model.getStudents();
        if (students.isEmpty()) return 0.0;

        double total = 0;
        for (Student s : students) {
            total += s.getGpa();
        }
        return total / students.size();
    }

    public double getTopGpa() {
        List<Student> students = model.getStudents();
        if (students.isEmpty()) return 0.0;

        double top = Double.MIN_VALUE;
        for (Student s : students) {
            if (s.getGpa() > top) {
                top = s.getGpa();
            }
        }
        return top;
    }

    public double getLowGpa() {
        List<Student> students = model.getStudents();
        if (students.isEmpty()) return 0.0;

        double low = Double.MAX_VALUE;
        for (Student s : students) {
            if (s.getGpa() < low) {
                low = s.getGpa();
            }
        }
        return low;
    }

    public void updateView() {
        view.printStudents(model.getStudents());
        view.printStatistics(getAverageGpa(), getTopGpa(), getLowGpa());
    }
}
