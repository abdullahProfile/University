#include<stdio.h>

void percentage() {
	
	int obtain,totalNumber,percentage;
	

	
	printf("please enter your obtain number:\n");
	printf("please enter your total Number:");
		
	scanf("%d%d ", &obtain,&totalNumber);
	

		percentage=obtain/totalNumber*100;
	
	
	
	printf("You Got =%d percente Number",&percentage);
}

int main() {
	
	percentage();
}