#include<stdio.h>
#include<stdlib.h>
#include<string.h>

#include "headerfile.h"

#define MAX_PRODUCTS 100
#define MAX_CUSTOMERS 100

struct Product {
    char name[50];
    float  price;
    int quantity;
    char  category[50];
};
struct Customer{

       char name[50];
        char address[100];
       char email[50];
       char phone[15];
};


 void readfile(){
    FILE *rf=fopen("readfile.taxt","r");

    char ch;

   if(rf==NULL){
    printf("File not found");
   }
   else {
    while((ch=fgetc(rf)) !=EOF);
    }
}

int main() {

void readfile();

	system("color C");
    struct Product products[MAX_PRODUCTS];
    int productCount = 0;

    int choice;
    do {
        printf("\n------ Customer Billing System ------\n");
        printf("1. Add Product\n");
        printf("2. Generate Bill\n");
        printf("3. Display Products\n");
        printf("4. Search Product by Name\n");
        printf("5. Search Product by Category\n");
        printf("6. Update Product Price\n");
        printf("7. Delete Product\n");
        printf("8. Display Customer Details\n");
        printf("9. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                addProduct(products, &productCount);
                break;
            case 2:
                generateBill(products, productCount);
                break;
            case 3:
                displayProducts(products, productCount);
                break;
            case 4:
                searchProductByName(products, productCount);
                break;
            case 5:
                searchProductByCategory(products, productCount);
                break;
            case 6:
                updateProductPrice(products, productCount);
                break;
            case 7:
                deleteProduct(products, &productCount);
                break;
            case 8:
                // Assuming we have a customer object to display customer details.
                struct Customer customer;
                displayCustomerDetails(customer);
                break;
            case 9:
                printf("Exiting the program. Goodbye!\n");
                break;
            default:
                printf("Invalid choice. Please try again.\n");
        }
    } while (choice != 9);

    return 0;
}

// Function to add a new product
void addProduct(struct Product products[], int *productCount) {
    if (*productCount >= MAX_PRODUCTS) {
        printf("Cannot add more products. Maximum limit reached.\n");
        return;
    }

    struct Product newProduct;
    printf("Enter product name: ");
    scanf("%s", &newProduct.name);
    printf("Enter product price: ");
    scanf("%f", &newProduct.price);
    printf("Enter product quantity: ");
    scanf("%d", &newProduct.quantity);
    printf("Enter product category: ");
    scanf("%s", newProduct.category);

    products[*productCount] = newProduct;
    (*productCount)++;
}

// Function to generate a bill for a customer
void generateBill(struct Product products[], int productCount) {
    char customerName[50];
    float totalAmount = 0.0;

    printf("Enter customer name: ");
    scanf("%s", &customerName);

    struct Customer customer;
    printf("Enter customer address: ");
    scanf("%s",&customer.address); // Allowing spaces in the address
    printf("Enter customer email: ");
    scanf("%s", &customer.email);
    printf("Enter customer phone number: ");
    scanf("%s", &customer.phone);

    int purchaseCount;
    printf("Enter the number of products purchased: ");
    scanf("%d", &purchaseCount);

    for (int i = 0; i < purchaseCount; i++) {
        char productName[50];
        int quantity;
        printf("Enter product name (Product %d): ", i + 1);
        scanf("%s", &productName);
        printf("Enter quantity: ");
        scanf("%d", &quantity);

        int found = 0;
        for (int j = 0; j < productCount; j++) {
            if (strcmp(products[j].name, productName) == 0) {
                totalAmount = totalAmount + products[j].price * quantity;
                found = 1;
                break;
            }
        }
        if (!found) {
            printf("Product not found: %s\n", productName);
        }
    }

    printf("\n----------BILL----------\n");
    printf("Customer Name: %s\n", customerName);
    printf("Address: %s\n", customer.address);
    printf("Email: %s\n", customer.email);
    printf("Phone: %s\n", customer.phone);
    printf("Total Amount: $%.2f\n", totalAmount);
    printf("------------------------\n");
}

// Function to display all products
void displayProducts(struct Product products[], int productCount) {
    printf("\n--- Available Products ---\n");
    for (int i = 0; i < productCount; i++) {
        printf("Product %d:\n", i + 1);
        printf("Name: %s\n", products[i].name);
        printf("Price: $%.2f\n", products[i].price);
        printf("Quantity: %d\n", products[i].quantity);
        printf("Category: %s\n", products[i].category);
        printf("-------------------------\n");
    }
}

// Function to search for a product by name
void searchProductByName(struct Product products[], int productCount) {
    char productName[50];
    printf("Enter the product name to search: ");
    scanf("%s", productName);

    int found = 0;
    for (int i = 0; i < productCount; i++) {
        if (strcmp(products[i].name, productName) == 0) {
            printf("Product found:\n");
            printf("Name: %s\n", products[i].name);
            printf("Price: $%.2f\n", products[i].price);
            printf("Quantity: %d\n", products[i].quantity);
            printf("Category: %s\n", products[i].category);
            printf("-------------------------\n");
            found = 1;
            break;
        }
    }

    if (!found) {
        printf("Product not found: %s\n", productName);
    }
}

// Function to search for products by category
void searchProductByCategory(struct Product products[], int productCount) {
    char category[50];
    printf("Enter the product category to search: ");
    scanf("%s", category);

    int found = 0;
    printf("Products in the category \"%s\":\n", category);
    for (int i = 0; i < productCount; i++) {
        if (strcmp(products[i].category, category) == 0) {
            printf("%s\n", products[i].name);
            found = 1;
        }
    }

    if (!found) {
        printf("No products found in the category: %s\n", category);
    }
}

// Function to update the price of a product
void updateProductPrice(struct Product products[], int productCount) {
    char productName[50];
    printf("Enter the product name to update the price: ");
    scanf("%s", productName);

    int found = 0;
    for (int i = 0; i < productCount; i++) {
        if (strcmp(products[i].name, productName) == 0) {
            printf("Enter the new price: ");
            scanf("%f", &products[i].price);
            printf("Price updated successfully!\n");
            found = 1;
            break;
        }
    }

    if (!found) {
        printf("Product not found: %s\n", productName);
    }
}

// Function to delete a product
void deleteProduct(struct Product products[], int *productCount) {
    char productName[50];
    printf("Enter the product name to delete: ");
    scanf("%s", productName);

    int found = 0;
    for (int i = 0; i < *productCount; i++) {
        if (strcmp(products[i].name, productName) == 0) {
            // Move the last product to the current position and reduce the count
            products[i] = products[(*productCount) - 1];
            (*productCount)--;
            printf("Product deleted successfully!\n");
            found = 1;
            break;
        }
    }

    if (!found) {
        printf("Product not found: %s\n", productName);
    }
}

// Function to display customer details
void displayCustomerDetails(struct Customer customer) {
    printf("\n--- Customer Details ---\n");
    printf("Name: %s\n", customer.name);
    printf("Address: %s\n", customer.address);
    printf("Email: %s\n", customer.email);
    printf("Phone: %s\n", customer.phone);
    printf("------------------------\n");


}

