import java.util.*;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner reader=new Scanner (System.in);
        System.out.print("Enter a Number: ");
        int num=reader.nextInt();

       int reversed=0;

       while (num !=0) {
        int digit=num %10;
        reversed= reversed * 10 + digit;
        num /=10;
       }
       System.out.print(" after reverse: "+ reversed);

    }
}
