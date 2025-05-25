

import java.util.*;
public class Timber {
    String zone;
    int TimberId;
    String kind;
    float weight;
    float height;
    int quality;
    int price;

    Timber(String kzone, int ktimberId,String kkind,float kweight, float kheight,int kquality,int kprice){
        zone=kzone;
        TimberId=ktimberId;
        kind=kkind;
        weight=kweight;
        height=kheight;
        quality=kquality;
        price=kprice;
    }
     void AddNew(){

        Scanner reader=new Scanner(System.in);

        System.out.print("Enter New Zone: ");
        String newZone=reader.nextLine();
        zone=newZone;

        System.out.print("Enter New Timber ID :  ");
        int newtimber=reader.nextInt();
        TimberId=newtimber;

        reader.nextLine();
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

        System.out.println("zone:"+zone+"\n"+"TimberID: "+TimberId+"\n"+"Kind: "+kind+"\n"+"Weight: "+weight+"\n"+"Quality: "+quality+"\n"+"Price: "+price);
        }

        public static void TimberRecord(){
            Timber[] Records=new Timber[5];

            if(Records != null){

                Records[0]=new Timber("Abbottabad", 4728, "Flower", 5, 12, 1, 2000);
                Records[1]=new Timber("Abbottabad", 3737, "oak", 5, 12, 1, 2000);
                Records[2]=new Timber("Abbottabad", 3636, "Abc", 5, 12, 1, 200);
                Records[3]=new Timber("Abbottabad", 3535, "DOD", 5, 12, 1, 20);
                Records[4]=new Timber("Abbottabad", 3434, "FFF", 5, 12, 1, 22);

                System.out.println("Timber Records:");
                for (Timber record : Records) {
                    System.out.println("Zone: " + record.zone);
                    System.out.println("Timber ID: " + record.TimberId);
                    System.out.println("Kind: " + record.kind);
                    System.out.println("Weight: " + record.weight);
                    System.out.println("Height: " + record.height);
                    System.out.println("Quality: " + record.quality);
                    System.out.println("Price: " + record.price);
                    System.out.println();
                }
            }
        }
        public void displayRecordByKind(String searchKind) {
            boolean found = false;
            for (Timber record : Records) {
                if (record != null && record.kind.equalsIgnoreCase(searchKind)) {
                    System.out.println("Zone: " + record.zone);
                    System.out.println("Timber ID: " + record.TimberId);
                    System.out.println("Kind: " + record.kind);
                    System.out.println("Weight: " + record.weight);
                    System.out.println("Height: " + record.height);
                    System.out.println("Quality: " + record.quality);
                    System.out.println("Price: " + record.price);
                    System.out.println();
                    found = true;
                    break; // Since you only want to display one record per kind, you can break the loop once found
                }
            }

            if (!found) {
                System.out.println("No record found for the given kind.");
            }
        }

        public static void main(String[] args) {

            Scanner reader=new Scanner(System.in);
            System.out.println("Select Your Choice: ");
            int choice;

            do{

                System.out.println("1: Add a new Timber records");
                System.out.println("2: Display all records for a given Zone");
                System.out.println("3: Display a particular record given the Kind");
                System.out.println("4: Analysis of record level");
                System.out.println("5: Sales update Report");
                System.out.println("6: Delete a particular Timber record");
                System.out.println("7: Update a particular Timber record");
                System.out.println("8: Exit");
                System.out.print("Please enter your choice: ");
                choice=reader.nextInt();

                switch (choice) {
                    case 1:
                     System.out.println("You Select choice One: ");
                     Timber newobj=new Timber(null, choice, null, choice, choice, choice, choice);
                    newobj.AddNew();
                    System.out.println("Added Succefully:");
                    System.out.println("---------------------------");
                        break;
                  case 2:
                  System.out.println("You Select choice Two: ");
                  TimberRecord();
                  break;
                  case 3:
                  System.out.println("You Select choice Three: ");
                 reader.nextLine(); // Consume newline character
                 System.out.print("Enter the kind to search for: ");
                    String searchKind = reader.nextLine();
                    Timber timber = new Timber(null, 0, null, 0, 0, 0, 0);
                timber.displayRecordByKind(searchKind);
                 break;
                    default:
                        break;
                }
            }while(choice !=3);
        }
    }
