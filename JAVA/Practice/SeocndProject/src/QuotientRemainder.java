import java.util.*;

public class QuotientRemainder {

    public static void main(String [] args) {

        Scanner deviden=new Scanner(System.in);
        System.out.print("Enter dividen Number:");
        int number= deviden.nextInt();

        Scanner remainder= new Scanner(System.in);
        System.out.print("Enter divisore:");

        int number1=remainder.nextInt();

        int result= number/number1;
        int remainderOfNum=number%number1;

        System.out.println("The Quotient => "+ result);
        System.out.println("The reminder => " + remainderOfNum);
    }
}
