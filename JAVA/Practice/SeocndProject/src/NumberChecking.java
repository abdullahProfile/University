import java.util.*;

public class NumberChecking {
    public static void main(String [] args){

        Scanner reader= new Scanner(System.in);
        System.out.print("Enter A Number : ");

        int number=reader.nextInt();

        if(number>=0){
            System.out.print("The Number is Positive");
        }else {
            System.out.print("The Number is Negative");
        }
    }
}
