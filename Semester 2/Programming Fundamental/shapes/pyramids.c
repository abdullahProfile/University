#include<stdio.h>

int main()
{
    int var=0,space=0;
    printf("Enter a Number:");

    scanf("%d", &var);

    space=var;

    for(int i=1; i<=var; i++)
    {
        for(int k=1; k<=space; k++) {
            printf(" ");
        }
        space--;

        for(int j=1; j<=i; j++){
            printf("%d ",i);
        }
        printf("\n");
        }
        return 0;
    }

