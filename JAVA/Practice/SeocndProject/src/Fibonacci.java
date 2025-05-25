import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);

        System.out.print("Enter A Number: ");
        int num=reader.nextInt();

        int first=0;
        int second=1;

        for(int i=1; i<=num; ++i ) {

            System.out.print(first + ", ");

            //cumpute the next term
 
            int nextTerm= first +second;
            first=second;
            second=nextTerm;

            //no comma print after last number
            if(i==num)
                System.out.print(first+" ");
    }
}
}