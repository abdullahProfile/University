
import java.util.*;
public class SumOfArray {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter the Size of The Array: ");
        int size=reader.nextInt();

        int[] array=new int[size];

        int SumOfArray=0;

        //loop for to read all values from user
        for(int i=0; i<size; i++){
            System.out.print("Element: "+(i+1)+ ": ");
            array[i]=reader.nextInt();
        }

        //loop for to sum all the array element
        for(int i=0; i<size; i++){
            SumOfArray +=array[i];

        }
        //print sum of all element
        System.out.println("Sum of the array element is :" +SumOfArray);
    }
}
