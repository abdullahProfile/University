import java.util.*;
public class SwapNumber {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("enter: ");
        int number=reader.nextInt();

        int b=0;

       number=number+b;
       b= number-b;
        number=number-b;

        System.out.println(number);

    }
}
