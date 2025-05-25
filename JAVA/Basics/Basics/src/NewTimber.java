import java.util.Scanner;

public class NewTimber {
    char zone;
    int timberID;
    String kind;
    float weight;
    float height;
    int quantity;
    int price;

    NewTimber(char zone, int timberID, String kind, float weight, float height, int quantity, int price) {
        this.zone = zone;
        this.timberID = timberID;
        this.kind = kind;
        this.weight = weight;
        this.height = height;
        this.quantity = quantity;
        this.price = price;
    }

    void display() {
        System.out.println("Zone: " + zone);
        System.out.println("TimberID: " + timberID);
        System.out.println("Kind: " + kind);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NewTimber[] inventory = new NewTimber[100];
        int count = 0;
        int choice;

        do {
            System.out.println("Main Menu");
            System.out.println("1. Add a new Timber record");
            System.out.println("2. Display all records for a given Zone");
            System.out.println("3. Display a particular record given the Kind");
            System.out.println("4. Analysis of record level");
            System.out.println("5. Sales update Report");
            System.out.println("6. Delete a particular Timber record");
            System.out.println("7. Update a particular Timber record");
            System.out.println("8. Exit");
            System.out.print("Enter your Choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addNewTimber(scanner, inventory, count);
                    count++;
                    break;
                case 2:
                    displayRecordsByZone(scanner, inventory, count);
                    break;
                case 3:
                    displayRecordByKind(scanner, inventory, count);
                    break;
                case 4:
                    analysisOfRecordLevel(inventory, count);
                    break;
                case 5:
                    salesUpdateReport(scanner, inventory, count);
                    break;
                case 6:
                    deleteRecord(scanner, inventory, count);
                    count--;
                    break;
                case 7:
                    updateRecord(scanner, inventory, count);
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
                    break;
            }
        } while (choice != 8);
    }

      static void addNewTimber(Scanner scanner, NewTimber[] inventory, int count) {
        System.out.println("Enter Timber Details:");
        System.out.print("Zone: ");
        char zone = scanner.nextLine().charAt(0);
        System.out.print("TimberID: ");
        int timberID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Kind: ");
        String kind = scanner.nextLine();
        System.out.print("Weight: ");
        float weight = scanner.nextFloat();
        System.out.print("Height: ");
        float height = scanner.nextFloat();
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();
        if(quantity < 1){
            System.out.println("The Quantity must be positive");
        }
        System.out.print("Price: ");
        int price = scanner.nextInt();
        scanner.nextLine();
        NewTimber timber = new NewTimber(zone, timberID, kind, weight, height, quantity, price);
        inventory[count] = timber;
        System.out.println("Timber added successfully!");
    }

      static void displayRecordsByZone(Scanner scanner, NewTimber[] inventory, int count) {
        System.out.print("Enter Zone: ");
        char zone = scanner.nextLine().charAt(0);
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (inventory[i].zone == zone) {
                inventory[i].display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No timber records available for Zone " + zone);
        }
    }

    static void displayRecordByKind(Scanner scanner, NewTimber[] inventory, int count) {
        System.out.print("Enter Kind: ");
        String kind = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (inventory[i].kind.equalsIgnoreCase(kind)) {
                inventory[i].display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No timber records available for Kind " + kind);
        }
    }

    static void analysisOfRecordLevel(NewTimber[] inventory, int count) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (inventory[i].quantity < 100) {
                inventory[i].display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No timber records have a quantity lower than 100.");
        }
    }

    static void salesUpdateReport(Scanner scanner, NewTimber[] inventory, int count) {
        System.out.print("Enter TimberID to be sold: ");
        int timberID = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (inventory[i].timberID == timberID) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("TimberID not found!");
            return;
        }
        System.out.print("Enter Quantity to be sold: ");
        int quantitySold = scanner.nextInt();
        if (quantitySold > inventory[index].quantity) {
            System.out.println("Error: Quantity to be sold is greater than quantity on hand!");
        } else {
            inventory[index].quantity -= quantitySold;
            System.out.println("Sales report:");
            inventory[index].display();
        }
    }

    static void deleteRecord(Scanner scanner, NewTimber[] inventory, int count) {
        System.out.print("Enter TimberID to be deleted: ");
        int timberID = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (inventory[i].timberID == timberID) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("TimberID not found!");
        } else {
            for (int i = index; i < count - 1; i++) {
                inventory[i] = inventory[i + 1];
            }
            count--;
            System.out.println("Timber record deleted successfully!");
        }
    }

    static void updateRecord(Scanner scanner, NewTimber[] inventory, int count) {
        System.out.print("Enter TimberID to be updated: ");
        int timberID = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (inventory[i].timberID == timberID) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("TimberID not found!");
        } else {
            System.out.println("Enter updated Timber Details:");
            System.out.print("Zone: ");
            char zone = scanner.next().charAt(0);
            inventory[index].zone = zone;
            System.out.print("Kind: ");
            String kind = scanner.next();
            inventory[index].kind = kind;
            System.out.print("Weight: ");
            float weight = scanner.nextFloat();
            inventory[index].weight = weight; 
            System.out.print("Height: ");
            float height = scanner.nextFloat();
            inventory[index].height = height;
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            inventory[index].quantity = quantity;
            System.out.print("Price: ");
            int price = scanner.nextInt();
            inventory[index].price = price;
            System.out.println("Timber record updated successfully!");
        }
    }
}
