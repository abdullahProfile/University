import java.util.*;

public class swapNumber{

    public static void main(String [] args) {

        Scanner reader=new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int first=reader.nextInt();

        System.out.print("Enter Second Number : ");

        int second =reader.nextInt();

        System.out.println("___________________________");

        System.out.println("Before Swap= "+ first+""+ second);

        int temprary=first;
        first=second;
        second=temprary;

        System.out.println("after swap= "+ first + ""+ second);

        System.out.println("___________________________");

    }
}