#include<stdio.h>

int main() {

    int var;
  printf("Enter A number to print Rectangal:");
    scanf("%d",& var);
        for(int i=1; i<=var; i++ ) {
            for(int j=1; j<=var; j++){
                if(i==1||j==1 || j==var || i==var)
                printf(" *");
                else
                printf("  ");
            }
            printf("\n");
        }
}