#ifndef Final_H
#define Final_H

// Function prototypes
void addProduct(struct Product products[], int *productCount);
void generateBill(struct Product products[], int productCount);
void displayProducts(struct Product products[], int productCount);
void searchProductByName(struct Product products[], int productCount);
void searchProductByCategory(struct Product products[], int productCount);
void updateProductPrice(struct Product products[], int productCount);
void deleteProduct(struct Product products[], int *productCount);
void displayCustomerDetails(struct Customer customer);


#endif;