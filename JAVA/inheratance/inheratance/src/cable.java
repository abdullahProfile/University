import java.util.Scanner;

class Customer {
    int accountNumber;
    char customerCode;
    int premiumChannels;

    public Customer(int accountNumber, char customerCode, int premiumChannels) {
        this.accountNumber = accountNumber;
        this.customerCode = customerCode;
        this.premiumChannels = premiumChannels;
    }

    public void calculateBill() {
        System.out.println("Customer's account number: " + accountNumber);
    }
}

class ResidentialCustomer extends Customer {
    static final int BILL_PROCESSING_FEE = 500;
    static final int BASIC_SERVICE_FEE = 350;
    static final int PREMIUM_CHANNEL_RATE = 250;

    public ResidentialCustomer(int accountNumber, char customerCode, int premiumChannels) {
        super(accountNumber, customerCode, premiumChannels);
    }

    @Override
    public void calculateBill() {
        int total = BILL_PROCESSING_FEE + BASIC_SERVICE_FEE + (PREMIUM_CHANNEL_RATE * premiumChannels);
        System.out.println("Billing amount: Rs. " + total);
    }
}

class BusinessCustomer extends Customer {
    static final int BILL_PROCESSING_FEE = 1000;
    static final int BASIC_SERVICE_FEE_FIRST_10 = 750;
    static final int ADDITIONAL_BASIC_SERVICE_FEE = 200;
    static final int PREMIUM_CHANNEL_RATE = 550;

    int basicConnections;

    public BusinessCustomer(int accountNumber, char customerCode, int premiumChannels, int basicConnections) {
        super(accountNumber, customerCode, premiumChannels);
        this.basicConnections = basicConnections;
    }

    @Override
    public void calculateBill() {
        int basicServiceFee = (basicConnections > 10) ? 
                              BASIC_SERVICE_FEE_FIRST_10 + (basicConnections - 10) * ADDITIONAL_BASIC_SERVICE_FEE :
                              BASIC_SERVICE_FEE_FIRST_10;
        int total = BILL_PROCESSING_FEE + basicServiceFee + (PREMIUM_CHANNEL_RATE * premiumChannels);
        System.out.println("Billing amount: Rs. " + total);
    }
}

public class cable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        System.out.print("Enter customer code (R/r for residential, B/b for business): ");
        char customerCode = scanner.next().charAt(0);

        System.out.print("Enter number of premium channels: ");
        int premiumChannels = scanner.nextInt();

        Customer customer;
        if (customerCode == 'R' || customerCode == 'r') {
            customer = new ResidentialCustomer(accountNumber, customerCode, premiumChannels);
        } else if (customerCode == 'B' || customerCode == 'b') {
            System.out.print("Enter number of basic service connections: ");
            int basicConnections = scanner.nextInt();
            customer = new BusinessCustomer(accountNumber, customerCode, premiumChannels, basicConnections);
        } else {
            System.out.println("Invalid customer code.");
            return;
        }

        customer.calculateBill();

        scanner.close();
    }
}
