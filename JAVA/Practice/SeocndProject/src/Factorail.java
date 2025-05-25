import java.util.*;
public class Factorail {
    
    public static void main(String [] args) {

        Scanner reader= new Scanner(System.in);
        System.out.print("Enter A number for Finding thier Factorial: ");

        int num=reader.nextInt();

        int fact=1;


        for(int i=1; i<=num; i++){

            System.out.print(i+ " ") ;
            fact=fact*i;
        }
        System.out.println();
        System.out.print("Factorail of the "+ num +" is " + fact);
    }


}
