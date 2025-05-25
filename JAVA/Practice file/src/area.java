
public class area {
    public static class bulding {

        int floor;
        double area;
        int occupents;

        void display(){

            System.out.println( floor +"\t" + area +"\t" +occupents  );
        }

        void areaPerPerson( int f,double a, int oc) {

            floor=f;
            area=a;
            occupents=oc;
            double areaPerPerson= area/ occupents;

            System.out.print("Area Per Person" + "\t" + areaPerPerson);
        }
    }

    public static void main(String [] arg) {

        bulding house= new bulding();
        bulding office= new bulding();

        System.out.println("House");
        house.areaPerPerson(120, 200, 10);

        System.out.println();

        System.out.println("office");
        office.areaPerPerson(123, 12000, 110);

    }
}
