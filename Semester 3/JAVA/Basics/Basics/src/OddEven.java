import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num=reader.nextInt();

        if(num % 2==0){
            System.out.print("The Number is Even: "+num);
        }else {
            System.out.print("The Number is odd: "+num);
        }
    }
}
