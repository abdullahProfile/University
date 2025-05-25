import java.util.Scanner;

public class addNumber {

   public static void main(String [] arg) {

    Scanner obj=new Scanner(System.in);
    System.out.print("Enter Number=>");

    int Number= obj.nextInt();

    Scanner obj1=new Scanner(System.in);
    System.out.print("Enter Second Number=>");

    int Number1=obj1.nextInt();

    int result= Number+Number1;

    System.out.println("************************");
    System.out.println("Your First Number is  =>" + Number);
    System.out.println("Your Second Number is =>" + Number1);

    System.out.println("Addition of Your Number is =" + " " + result);

    System.out.println("************************");
   }

}