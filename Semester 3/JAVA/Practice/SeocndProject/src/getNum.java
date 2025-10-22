import java.util.Scanner;

public class getNum {
    int num1;
    int num2;

    void display(){
        System.out.println("Num"+ num1 +" Num2 "+ num2);

        int result= num1 * num2;
        System.out.println("Result is "+ result);
    }
    void get(){
        Scanner reader= new Scanner(System.in);
        System.out.print("Enter num 1: ");
         num1= reader.nextInt();

        System.out.print("Enter Num 2: ");
         num2= reader.nextInt();

    }

    public static void main(String[] args) {
        getNum obj1=new getNum();
        obj1.get();
        obj1.display();
    }

}

