package ArrayList;
import java.util.*;

class item {
    String name;
    int specifiNo;
    int quantatity;

    item(String n, int s, int q) {
        name=n;
        specifiNo=s;
        quantatity= q;
    }

    void printItem() {
        System.out.println("Item Name: "+ name +"|" + "Item Specific Number: "+ specifiNo+ "|"+ "quantity: "+ quantatity);
    }
}
public class storeManagment {
    public static void main(String[] args) {

       ArrayList<item> newItem=new ArrayList<>();

        Scanner reader= new Scanner(System.in);

        System.out.print("Enter Item Number to Be add:");
        int toStore= reader.nextInt();
        reader.nextLine();

        for(int i=0; i<=toStore; i++) {
            System.out.print("\n item:"+ (i+1)+ ":");

            System.out.print("Enter Item Name: ");
            String itemNameIndex=reader.nextLine();

            System.out.print("Enter item Specific Number: ");
            int specificNumber=reader.nextInt();

            System.out.print("Enter Item Quantity:");
            int itemquatity=reader.nextInt();

            reader.nextLine();

            newItem.add(new item(itemNameIndex, specificNumber, itemquatity));
        }

        System.out.println("\nAll Items in the Store:");
        for(int i=0; i<newItem.size(); i++){
            newItem.get(i).printItem();
        }

        System.out.print("Enter item Name To be remove:");
        String removeItem=reader.nextLine();

       item toRemove=null;

       for(int i=0; i<newItem.size(); i++){
        if(newItem.get(i).name.equals(removeItem)){
            toRemove=newItem.get(i);
            break;
        }
    }

    if(toRemove != null) {
        newItem.remove(toRemove);
        System.out.println("Item removed!");
    }else {
        System.out.println("Item Not found!");
    }

       System.out.println("after item removal:");
       for(int i=0; i<newItem.size(); i++){
        newItem.get(i).printItem();
       }
    }
}
