

import java.util.*;
public class UserIputArray {
    public static void main(String[] args) {

        //create on variable that read value from the user (name :reader)
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter the Size of The Array: ");

        //create one varaible that store the size of the varible
        int size=reader.nextInt();

        //create one integer array
        int [] array=new int[size];

        System.out.println("Size of Array : "+size+" intgers:");

        //for loop for user input
        for(int i=0; i<size; i++){
            System.out.print("Element At index "+ (i+1) + ": "); //
            array[i]=reader.nextInt();
        }

        //print the array element
        System.out.println("Array Elements");
        for(int i=0; i< size; i++){
            System.out.println("Element at index: "+ (i+1)+ ": "+ array[i]);
        }
        System.out.println();
    }
}
