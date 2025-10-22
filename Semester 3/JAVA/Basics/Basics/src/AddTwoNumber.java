import java.util.*;

public class AddTwoNumber{
    public static void main(String[] args) {

        //Scanner is constant that read vlues from user
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1=reader.nextInt();

        System.out.print("Enter Second Number: ");
        int num2=reader.nextInt();

        int result=num1+num2;

        System.out.print("The Result of two Number is: "+ result);
    }
}