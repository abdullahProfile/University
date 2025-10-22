#include<stdio.h>

int main (){

    for(int i=1; i<=17; i++) {
        for(int j=1; j<=17; j++){
            if(i==17 || j==1 ||i==j)
            printf(" *");
            else
            printf("  ");
        }
        printf("\n");
    }
}