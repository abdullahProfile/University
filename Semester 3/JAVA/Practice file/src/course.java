public class course {
    public static class result{
        String name;
        String subject;
        char grade;

        void display(){
            System.out.println(name+" "+subject + " " +grade);
        }

        void set(String n, String s, char g) {
            name=n;
            subject=s;
            grade=g;
        }
    }

    public static void main(String [] arg) {

        result result1= new result();

        result1.set("Abdullah" , "OOP" ,'A');
        result1.display();
    }
}
