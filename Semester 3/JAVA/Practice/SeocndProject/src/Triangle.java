public class Triangle {
    int sideOne;
    int sideTwo;
    int sideThree;

    //instructor function that recive the values kyboard
    public Triangle(int s1 ,int s2, int s3) {

        sideOne=s1;
        sideTwo=s2;
        sideThree=s3;
        System.out.println();
    }

    //display result on console
    void display() {
        System.out.println("SideOne"+ "\t"+ "SideTwo"+ "\t"+ "SideThree");
        System.out.println(sideOne+ "\t"+ sideTwo+ "\t"+ sideThree);
        System.out.println("The area of traingle:");
        System.out.print(sideOne*sideTwo*sideThree);
    }

    public static void main(String [] args) {

        Triangle NewTraingle= new Triangle(3, 4, 5);//calling the instruction function and create new object

        //calling the display fucntion for final result
        NewTraingle.display();
    }

}
