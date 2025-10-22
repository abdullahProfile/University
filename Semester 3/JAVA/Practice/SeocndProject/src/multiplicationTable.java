import java.util.*;
public class multiplicationTable {

    public static void main(String [] args) {

        Scanner reader=new Scanner(System.in);
        System.out.print("Enter a Number for Mutiplication Table: ");

        int num=reader.nextInt();

        System.out.println("Num" + "\t" + "i"+ "\t" + "Mulitplication Table");
        for(int i=0; i<=num; i++) {

            System.out.print(num +"\t" + i+ "\t\t" + num *i);
            System.out.println();
        }

        System.out.println();
    }
}
