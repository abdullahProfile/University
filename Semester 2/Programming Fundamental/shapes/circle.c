#include <stdio.h>
#include <math.h>

int main() {

    int var;
    printf("Enter your favorite Number to Print Circle:");
    scanf("%d", &var);
    for (int i =-var; i <= var; i++) {
        for (int j =-var; j <=var; j++) {
            if (sqrt(i*i + j*j) <= var + 0.5) {
                printf("* ");
            } else {
                printf("  ");
            }
        }
        printf("\n");
    }
    return 0;
}
