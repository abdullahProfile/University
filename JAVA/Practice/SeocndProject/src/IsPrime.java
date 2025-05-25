
import java.util.*;
public class IsPrime {
    void IsNumberPrime() {
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int n=reader.nextInt();
        if(n % 2 !=0) {
            System.out.print("The Number is Prime:");
        } else {
            System.out.print("The Number is Not Prime:");
        }
    }
    public static void  main(String[] args) {

        IsPrime obj=new IsPrime();
        obj.IsNumberPrime();

    }
}
