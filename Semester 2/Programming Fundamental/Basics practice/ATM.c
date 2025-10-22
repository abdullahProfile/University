#include<stdio.h>

int main(){
	
	// program for the ATM 
	
	int pin,amount,widrawAmount;
	
	printf("Please enter your PIN:");
	
	scanf("%d",& pin);
	
	printf("Please enter your total Amount:");
	
	scanf("%d",&amount);
	
	printf("Please enter your Widraw amount:");
	
	scanf("%d",&widrawAmount);
	
	if(pin==123){
		printf("Correct PIN:\n");
	 if(amount>widrawAmount) {
		printf("Yes we allow you to widraw your mony");
		
	}else
	
	printf("Your balance is low try again"); 
	}  else 
	
	printf("Your total amount is less than widraw amoun:");
}
