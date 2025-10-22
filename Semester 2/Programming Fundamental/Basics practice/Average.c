#include<stdio.h>

void avergOfnumber(){
	
	int n,averge=0;
	
	printf("Please enter a number\n");
	scanf("%d",&n);
	
	averge=n+n+n%n;
	
	printf("Averge of number is=%d\n",averge);
	
}
int main(){
	
	avergOfnumber();
	avergOfnumber();
	avergOfnumber();
	avergOfnumber();
}