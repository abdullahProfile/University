
import java.util.*;
public class MaxArrayElement {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter The Size of The array: ");
        int size=reader.nextInt();

        int[] array= new int[size];

        int Max_element=0;

        for(int i=0; i<size; i++){
            System.out.print("Element at index: "+ (i+1)+": ");

            array[i]=reader.nextInt();
        }
        for(int i=0; i<size; i++){
            if(array[i] > Max_element){
                Max_element=array[i];
            }
        }
        System.out.println("Max element in this array is: "+ Max_element);
    }
}
