import java.util.*;

public class MyClass {
    int id;
    String name;
    int marks;

    public MyClass(){
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter Your Id: ");
        int kid=reader.nextInt();
        id=kid;

        reader.nextLine();//skip the new line

        System.out.print("Enter Your Name: ");
         name=reader.nextLine();

         System.out.print("Enter Your Marks: ");
         int kmarks=reader.nextInt();
         marks=kmarks;
    }

    void show(){
        System.out.print(id+"\t"+ name+ "\t"+ marks);
    }

    public static void main(String[] args){

        MyClass obj=new MyClass();
        obj.show();

        System.out.println();
         MyClass obj1= new MyClass();
        obj1.show();
    }
}
