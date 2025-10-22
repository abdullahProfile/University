class Computer {
    int SizeInbit;
    int  megabyete;
    int speedInMeghertz;
    int storageSize;
        Computer(int size,int mega,int speed,int storage){
            SizeInbit=size;
            megabyete=mega;
            speedInMeghertz=speed;
            storageSize=storage;
        }

        void show(){
            System.out.println("All data Members of Parent class :");
            System.out.println();
            System.out.println(SizeInbit+"\t"+megabyete+"\t"+speedInMeghertz+"\t"+storageSize);
        }

}

class laptop extends Computer {
    int length,width,height,weight;

    //child class constructor
    laptop(int size,int mega,int speed,int storage,int l,int w,int h,int g){
        super(size, mega, speed, storage); //parent class constructror
        length=l; 
        width=w;
        height=h;
        weight=g;
    }

    void showlaptop(){
        super.show(); // Call superclass show method
        System.out.println("Laptop dimensions: " + length + "x" + width + "x" + height);
        System.out.println();
        System.out.println("Laptop weight: " + weight);
    }
}
public class ComputerMain {

    public static void main(String[] args) {

        laptop nLaptop= new laptop(18, 18, 18, 18, 18, 18, 18, 18);

        nLaptop.showlaptop();
    }
}
