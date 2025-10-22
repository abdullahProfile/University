import java.util.*;
public class countDigit {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num=reader.nextInt();

        int count=0;

            while (num !=0) {
                num /=10;
                count++;
            }
        System.out.print(" Number of digit is "+ count);
    }
}
