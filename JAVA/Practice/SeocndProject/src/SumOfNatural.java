import java.util.*;

public class SumOfNatural {
    public static void main(String [] args) {

        Scanner reader=new Scanner (System.in);
        System.out.print("Enter A number: ");

        int num=reader.nextInt();

        int sum=0;
        System.out.println("Natural numbers:");
        for(int i=1; i<=num; i++){
            if(i % 2 !=0) {
                System.out.print(i + " ");
                sum+=i;
            }
           System.out.println();
        }
        System.out.print("Sum of natural Numbers is = " + sum);
    }
}
