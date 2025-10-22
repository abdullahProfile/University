package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class StringArrayList {
   public static void main(String[] args) {
    ArrayList<String> stringList= new ArrayList<>();

    Scanner reader= new Scanner(System.in);
    System.out.print("Enter Student Strength: ");

    int NameCount=reader.nextInt();
    reader.nextLine();

    for(int i=0; i<=NameCount; i++) {
        System.out.print("Student Name: " + (i+1)+ ":");
        String readeName= reader.nextLine();
        stringList.add(readeName);
    }

    System.out.println("Student Names: "+ stringList);

    System.out.println();

    System.out.print("Enter index to be remove:");

    int readeIndex=reader.nextInt();

    stringList.remove(readeIndex);

    System.out.println("After remove element:" + stringList);
   }

}
