package java.Assignment.Inventory;
import java.util.*;
import java.util.*;
 class Timber {
     char zone;
     int timberID;
     String kind;
     float weight;
     float height;
     int quantity;
     int price;

    public Timber(char zone, int timberID, String kind, float weight, float height, int quantity, int price) {
        this.zone = zone;
        this.timberID = timberID;
        this.kind = kind;
        this.weight = weight;
        this.height = height;
        this.quantity = quantity;
        this.price = price;
    }

    public char getZone() {
        return zone;
    }

    public int getTimberID() {
        return timberID;
    }

    public String getKind() {
        return kind;
    }

    public float getWeight() {
        return weight;
    }

    public float getHeight() {
        return height;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "Timber{" +
                "zone=" + zone +
                ", timberID=" + timberID +
                ", kind='" + kind + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

}
public class TimberInventory {
     Timber[] timbers;
     int size;

    public TimberInventory(int capacity) {
        timbers = new Timber[capacity];
        size = 0;
    }

    public void addNewTimber(Scanner scanner) {
        System.out.println("Enter TimberID:");
        int timberID = scanner.nextInt();

        // Check for duplicate TimberID
        if (findTimberByID(timberID) != null) {
            System.out.println("TimberID already exists. Please enter a unique TimberID.");
            return;
        }

        System.out.println("Enter Zone:");
        char zone = scanner.next().charAt(0);

        System.out.println("Enter Kind:");
        String kind = scanner.next();

        System.out.println("Enter Weight:");
        float weight = scanner.nextFloat();

        System.out.println("Enter Height:");
        float height = scanner.nextFloat();

        System.out.println("Enter Quantity:");
        int quantity = scanner.nextInt();

        System.out.println("Enter Price:");
        int price = scanner.nextInt();

        Timber timber = new Timber(zone, timberID, kind, weight, height, quantity, price);
        timbers[size++] = timber;

        System.out.println("Timber record added successfully.");
    }

    public void displayRecordsForZone(Scanner scanner) {
        System.out.println("Enter Zone to display records:");
        char zone = scanner.next().charAt(0);

        System.out.println("Timber records for Zone " + zone + ":");
        for (int i = 0; i < size; i++) {
            if (timbers[i].getZone() == zone) {
                System.out.println(timbers[i]);
            }
        }
    }

    public void displayParticularRecord(Scanner scanner) {
        System.out.println("Enter Kind to display records:");
        String kind = scanner.next();

        boolean found = false;
        System.out.println("Timber records for Kind " + kind + ":");
        for (int i = 0; i < size; i++) {
            if (timbers[i].getKind().equalsIgnoreCase(kind)) {
                System.out.println(timbers[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No records found for Kind " + kind);
        }
    }

    public void analyzeRecordLevel() {
        System.out.println("Timber records with quantity on hand lower than 100:");
        for (int i = 0; i < size; i++) {
            if (timbers[i].getQuantity() < 100) {
                System.out.println(timbers[i]);
            }
        }
    }

    public void salesUpdateReport(Scanner scanner) {
        System.out.println("Enter TimberID to be sold:");
        int timberID = scanner.nextInt();

        Timber timber = findTimberByID(timberID);
        if (timber == null) {
            System.out.println("TimberID not found.");
            return;
        }

        System.out.println("Enter Quantity to be sold:");
        int quantitySold = scanner.nextInt();

        if (quantitySold > timber.getQuantity()) {
            System.out.println("Error: Quantity to be sold exceeds quantity on hand.");
            return;
        }

        timber.setQuantity(timber.getQuantity() - quantitySold);
        System.out.println("Sales report:");
        System.out.println("TimberID: " + timberID + ", Quantity sold: " + quantitySold);
    }

    public void deleteTimberRecord(Scanner scanner) {
        System.out.println("Enter TimberID to be deleted:");
        int timberID = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (timbers[i].getTimberID() == timberID) {
                // Shift elements to left to remove the element
                for (int j = i; j < size - 1; j++) {
                    timbers[j] = timbers[j + 1];
                }
                size--;
                found = true;
                System.out.println("Timber record with TimberID " + timberID + " deleted successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("TimberID not found.");
        }
    }

    public void updateTimberRecord(Scanner scanner) {
        System.out.println("Enter TimberID to be updated:");
        int timberID = scanner.nextInt();

        Timber timber = findTimberByID(timberID);
        if (timber == null) {
            System.out.println("TimberID not found.");
            return;
        }

        System.out.println("Enter new Quantity:");
        int quantity = scanner.nextInt();
        timber.setQuantity(quantity);
        System.out.println("Timber record updated successfully.");
    }

    public Timber findTimberByID(int timberID) {
        for (int i = 0; i < size; i++) {
            if (timbers[i].getTimberID() == timberID) {
                return timbers[i];
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TimberInventory inventory = new TimberInventory(100); // Set initial capacity

        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("[1] Add a new Timber record");
            System.out.println("[2] Display all records for a given Zone");
            System.out.println("[3] Display a particular record given the Kind");
            System.out.println("[4] Analysis of record level");
            System.out.println("[5] Sales update Report");
            System.out.println("[6] Delete a particular Timber record");
            System.out.println("[7] Update a particular Timber record");
            System.out.println("[8] Exit");
            System.out.println("Please enter your choice:");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inventory.addNewTimber(scanner);
                    break;
                case 2:
                    inventory.displayRecordsForZone(scanner);
                    break;
                case 3:
                    inventory.displayParticularRecord(scanner);
                    break;
                case 4:
                    inventory.analyzeRecordLevel();
                    break;
                case 5:
                    inventory.salesUpdateReport(scanner);
                    break;
                case 6:
                    inventory.deleteTimberRecord(scanner);
                    break;
                case 7:
                    inventory.updateTimberRecord(scanner);
                    break;
                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
            }
        }
    }
}
