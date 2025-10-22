
import java.util.*;
public class StringArray {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        System.out.print("Enter the Size Of the Array : ");
        int size= reader.nextInt();
        reader.nextLine();
        String[] stringArray=new String[size];

        for(int i=0; i<size; i++) {
            System.out.print("Element at index: "+(i+1)+": ");
            stringArray[i]=reader.nextLine();
        }
        System.out.println("_________________________________");
        for(int i=0; i<size; i++) {
            System.out.println("Element at index: " +(i+1)+": "+ stringArray[i] );
        }
    }

}
