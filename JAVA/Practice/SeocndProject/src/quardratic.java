import java.util.*;

public class quardratic {
    
    public static void main(String[] args) {

        Scanner reader=new Scanner(System.in);
        System.out.print("Enter the value of A: ");
    
        double a=reader.nextInt();

        System.out.print("Enter the value of b: ");

        double b=reader.nextInt();

        System.out.print("Enter the value of c: ");
        double c=reader.nextInt();

        double root1;
        double root2;

        double determine= b*b -4 * a*c;

        if(determine>0) {

            root1=(-b + Math.sqrt(determine))/2*a;
            root2=(-b -Math.sqrt(determine))/2 *a;

            System.out.print("root1="+root1+"= " + "root2"+ root2);
        }
        else if (determine == 0) {
            root1=root2=-b /(2*a);
            System.out.print("root1 = root2 = %.2f;"+ root1);
        }
        else {

            double real=-b /(2*a);
            double imaginary=Math.sqrt(-determine) / (2 * a);

            System.out.print("root1 ="+ real +"imagenary "+ imaginary);
            System.out.print("\nroot2 ="+real+"imaganary "+ imaginary);
        }
    }
}
