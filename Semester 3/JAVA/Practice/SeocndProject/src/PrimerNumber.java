
import java.util.*;
public class PrimerNumber {
    public static void main(String [] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter Your Number: ");

        int number=reader.nextInt();
        int i;
        for( i=20; i<=50; i++) {
            if(number % i !=0)
            System.out.println(i);
        }
       //to be continue tommoro
    }
}
