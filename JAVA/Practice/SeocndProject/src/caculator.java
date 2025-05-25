import java.util.*;
public class caculator {
    public static void main(String [] args) {

        Scanner obj1=new Scanner(System.in);
        System.out.print("Enter first number:");
        int num=obj1.nextInt();

        System.out.print("Enter oparator (+,-,/) :");

        Scanner opartors=new Scanner(System.in);
        char operator = opartors.next().charAt(0);

        Scanner obj2=new Scanner(System.in);
        System.out.print("Enter second Number:");
        int num1=obj2.nextInt();


        int result;
       switch (operator) {
        case '+':
            result=num + num1;
            System.out.print("Addition of this two number is = " + result);
            break;
       case '-':
       result=num-num1;
       System.out.print("Subtraction of this two number is = " + result);
       break;

       case '/':
       result=num/num1;
       System.out.print("The division of this two number is = " + result);
        break;

        default:
        System.out.print("Their have no oparator to perform this oparation Thank you see you next time 😂");
            break;
       }
    }
}
