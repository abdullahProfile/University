import java.util.*;

public class leapYear {
    public static void main(String [] args){

        Scanner reader=new Scanner(System.in);

        System.out.println("Fell free and Communicate with System");
        System.out.print("Enter Year too check if The year is leap year or not :");

        int year=reader.nextInt();

        if(year % 4==0 || year % 100 == 0 || year % 400 == 0  ){

            System.out.print(year + " " +"The year is leap Year");
        } else {

            System.out.print(year+" "+"The Year is Not a Leap Year");
        }
    }
}
