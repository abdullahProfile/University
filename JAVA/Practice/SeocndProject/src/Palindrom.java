import java.util.*;
public class Palindrom {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=reader.nextInt();

        int orignalNum=num;
        int digit=0;
        int reversed=0;

        while (num !=0) {
            digit= num%10;
            reversed=reversed*10+digit;

          num/=10;
        }
        if(reversed==orignalNum){
            System.out.print("The Number is Palindrom Number");
        }
        else
        System.out.print("The Number is Not palindrom");
    }
}
