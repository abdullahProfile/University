class person{

    String name;
    int age;
    String cast;
    String representation;

    person(String n, int ag,String c,String represent){

        name=n;
        age=ag;
        cast=c;
        representation=represent;
    }
}

class Student extends person{

    int year;
    String information;

    Student(String n,int ag,String c,String represent,int y,String infor){
        super(n, ag, c, represent);
        
        year=y;
        information=infor;
    }
    void ShowStudent(){
        System.out.println("Stuedent Name: "+name);
        System.out.println("Student Age: "+ age);
        System.out.println("Student Representation :"+ representation);
        System.out.println("Student Study of Year in his field :"+year);
        System.out.println("Extra Information: "+ information);
        System.out.println();
    }
}

class teacher extends person {

    int year;
    String information;

    teacher(String n,int ag,String c,String represent,int y,String infor){
        super(n, ag, c, represent);
        
        year=y;
        information=infor;
    }

    void ShowTeacher(){
        System.out.println("Teacher Name: "+name);
        System.out.println("teacher Age: "+ age);
        System.out.println("Teacher Representation :"+ representation);
        System.out.println("Teacher Study in his field:"+year);
        System.out.println("Extra Information: "+ information);
        System.out.println();
    }
}


public class PersonMain {
    public static void main(String[] args) {
        
        teacher nTeacher=new teacher("Prof.tariq Baloch", 35,"DI Khan" , "Professor", 20, "belong From DI Khan");
        nTeacher.ShowTeacher();

        Student nStudent=new Student("Abdullah", 20, "Pakhtun", "Student", 2, "Study at comsats university Islamabad Abbottabad Campus");
        nStudent.ShowStudent();
    }
}
