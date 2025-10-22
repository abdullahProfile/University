import java.util.*;

public class Students {
    int id;
    String name;
    int marks; 
    int totalmarks;
    double percent;

    void Student() {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        id = reader.nextInt();

        reader.nextLine(); // skip the newline character

        System.out.print("Enter Student Name: ");
        name = reader.nextLine();
        System.out.print("Enter Student obtain Marks: ");
        marks = reader.nextInt();

        System.out.print("Your total Maks is : ");
        totalmarks= reader.nextInt();
        percent=(double) marks /totalmarks *100;
    }

    void Show() {
        System.out.println("ID"+"\t"+"NAME"+ "\t\t" +"MARKS"+"\t"+ "TOTAL MARKS");
        System.out.print(id + "\t" + name + "\t" + marks+"\t"+ totalmarks);
        System.out.print("\nPercentage: "+ percent);
    }

    public static void main(String[] args) {
        Students obj = new Students();
        obj.Student();
        obj.Show();
    }
}
