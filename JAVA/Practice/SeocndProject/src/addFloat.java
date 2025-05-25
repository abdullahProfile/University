
import java.util.*;
public class addFloat {

    public static void main(String [] args) {

        Scanner obj= new Scanner(System.in);
        System.out.print("Your first Float Number " + " ");

        float first = obj.nextFloat();

        Scanner obj1= new Scanner(System.in);
        System.out.print("Your Second Float Number " + " ");

        float second = obj1.nextFloat();


        float result=first * second;
        System.out.print("Multiplication of two floating number is =" + " " + result);
    }
}
