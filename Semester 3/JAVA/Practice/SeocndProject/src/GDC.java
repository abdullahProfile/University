import java.util.*;
public class GDC {
    
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstNum=reader.nextInt();

        System.out.print("Enter Second Number:");
        int secondNum=reader.nextInt();

       int GDC=0;
        for(int i= 1; i<=firstNum && i<= secondNum; i++) {

            if(firstNum % i == 0 && secondNum % i==0 ) {
                GDC=i;
            }
        }
        System.out.print("GDC of " + firstNum +" and "+ secondNum+ " is = " +GDC);
    }
}
