public class Rectangle {
    //blue prent of object
    int width;
    int breath;

    public Rectangle(int w, int b) {//parameters and instructor function
        width=w;
        breath=b;
    }
    void display(){

        //diplay the last results
        System.out.println("Width"+ "\t"+ "breath");
        System.out.println(width +"\t"+ breath);
        System.out.println("The area of Rectangle :");
        System.out.println(width * breath);
    }

    public static void main(String [] args) {
        Rectangle NewTraingle1=new Rectangle(4, 5);//calling and give the values
        NewTraingle1.display();//display result

        System.out.println();

        Rectangle NewTraingle2=new Rectangle(5, 8);
        NewTraingle2.display();
    }
}
