#include<stdio.h>
void sum(){
	
	//user define function and called function
	
	//user enter two numbers and after entering then adding them 
	//as a result sum is printing
	int num1,num2,sum;
	
	printf("Please enter Num1:");
	
	scanf("%i",&num1);
	
	printf("Please enter Num2:");
	
	scanf("%i",&num2);
	
	sum=num1+num2;
	
	printf("sum =%d\n",sum);
}
int main()
{
	
	//calling function
	sum();
	
	printf("......\n");
	
	sum();

}