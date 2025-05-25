import java.util.*;
public class Area {
    int length;
    int width;

    void setDim(){

        Scanner reader= new Scanner(System.in);
        System.out.print("Enter the Area: ");
       int a= reader.nextInt();
        length=a;
        System.out.print("Enter the width :");
        int w=reader.nextInt();
        width=w;
    }

    void getArea (){
        System.out.print("Area of the rectangle is :");
        System.out.print(length * width);
    }
    public static void main(String [] args) {
        Area obj= new Area();

        obj.setDim();
        obj.getArea();
    }
}
