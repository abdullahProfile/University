
import java.util.*;
public class largestNumber {
    
    public static  void main(String[] args){

        Scanner reader=new Scanner(System.in);
        System.out.print("Enter first number : ");

        int num1=reader.nextInt();

        System.out.print("Enter Second Number : ");
        int num2=reader.nextInt();

        System.out.print("Enter Third Number : ");
        int num3=reader.nextInt();

        if(num1>=num2 && num1>=num3){
            System.out.print("Num1 is greatest Number ");
        }else if(num2>=num1 && num2>= num3) {
            System.out.print("Num2 is greatest Number ");
        }else {
            System.out.print("Num3 is greatest Number ");
        }
    }
}
