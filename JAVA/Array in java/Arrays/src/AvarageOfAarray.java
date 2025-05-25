import java.util.*;
public class AvarageOfAarray {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter Size Of the Array: ");
        int size=reader.nextInt();

        int[] array=new int[size];

        int sum=0;
        double Avarage=0;

        int choice=0;
        do{

            for(int i=0; i <size ; i++){
                System.out.print("Element at index : "+ (i+1)+": ");

                array[i]=reader.nextInt();
            }
            for(int i=0; i<size; i++){
                sum += array[i];
            }
            Avarage =(double)sum /size;

            System.out.println("**************************");
            System.out.println("Sum of the array is : "+ sum);
            System.out.println("Averge of the array is : "+ Avarage);
            System.out.println("***************************");
        }while(choice !=size);
    }
}
