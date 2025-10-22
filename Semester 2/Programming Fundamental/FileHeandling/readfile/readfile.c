#include<stdio.h>

#include<stdlib.h>

int main(){

    FILE *rf= fopen("read.taxt","r");

    int a=0, b=0;

    // rf=fopen("rf","r");

    if(rf==NULL){

        printf("Error\n %d",rf);


    }
    fscanf(rf,"%d %d", &a,&b);
    fclose(rf);

    printf(" %d %d \n", a,b);

    return 0;
}