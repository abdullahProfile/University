import java.util.*;
public class testT {
    String zone;
    int TimberId;
    String kind;
    float weight;
    float height;
    int quality;
    int price;

    testT(String kzone, int ktimberId,String kkind,float kweight, float kheight,int kquality,int kprice){
        zone=kzone;
        TimberId=ktimberId;
        kind=kkind;
        weight=kweight;
        height=kheight;
        quality=kquality;
        price=kprice;
    }

    public static void main(String[]args){
        static class InventoryControl{
            static Timber[] timberRecord=new Timber[10];
            static int size=0;
            static Scanner scanner= new Scanner(System.in);
        }
    
    static void AddNew(){

        if(size==TimberRecord.length){
            increasecapcit++;
        }
        Scanner reader=new Scanner(System.in);

        System.out.print("Enter New Zone: ");
        String newZone=reader.nextLine();
        zone=newZone;

        System.out.print("Enter New Timber ID :  ");
        int newtimber=reader.nextInt();
        TimberId=newtimber;

        System.out.print("Enter New Kind: ");
        String newkind=reader.nextLine();
        kind=newkind;

        System.out.print("Enter Weight: ");

        float newWeight=reader.nextFloat();
        weight=newWeight;

        System.out.print("Enter Height : ");
        float newheight=reader.nextFloat();
        height=newheight;

        System.out.print("Enter Quality: ");
        int newQuality=reader.nextInt();
        quality=newQuality;

        System.out.print("Enter Price: ");
        int newPrice=reader.nextInt();
        price=newPrice;

        Timber timber=new Timber(zone, TimberId, kind, weight, height, quality, price){
            TimberRecord[size++]=timber;
            System.out.print("Recored Added Sucessfully:");
        }
      
    }
}
    
}
