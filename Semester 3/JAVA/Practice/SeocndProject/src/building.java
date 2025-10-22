import java.util.*;
public class building {
    int area;
    int floor;
    int occupation;

    public building(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter area : ");

        int karea=reader.nextInt();
        area=karea;

        System.out.print("Enter floor : ");

        int kfloor=reader.nextInt();
        area=kfloor;

        System.out.print("Enter occupation : ");

        int koccupation=reader.nextInt();
        area=koccupation;
    }
    double AreapOfPerson() {
         return (double)area / occupation;
    }

    void display(){
        System.out.print(area+"\t" + floor + "\t" + occupation);
    }

    public static void main(String[] args) {

        building obj=new building();
        double areaPerPerson= obj.AreapOfPerson();
        System.out.println("Area per Person is :" + areaPerPerson);
        obj.display();;
    }
}
