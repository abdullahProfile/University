#include<stdio.h>

//create user define function for sum 
void sum()

  {
  	//a and b declared in integar data type
  	int a,b, sum=0;
  
  
  //out put message on screen
  printf("Please enter two number:");
  
  //user enter two numbers
  scanf("%d%d", &a, &b);
  //sum is equal to thier two numbers a and b
  sum=a+b;
  
  //print the sum of two numbers
  printf("sum=%d\n", sum);
}
  //main function and we call to user or void function
  int main(){
  	//first sum is print on c=screen 
  	sum();
  	
  	//print hello on screen
  	printf("Hello \n");
  	//sum print on screen
  	sum();
  	//sum print on screen
  	sum();
  	
  	//we three time to void function and result is show at three time
  }
  