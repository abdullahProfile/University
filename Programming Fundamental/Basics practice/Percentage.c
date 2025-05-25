//#include is preprossor directive and they include liabrary in program
//stdio.h is liabray of :C: programming lanuage
//math.h is mathematical liabrary in C language
//.h is the extenshion
#include<stdio.h>
#include<math.h>
int main(){
	
	int num1,num2;
	double result;
	char oparation;
	 
	 	
	 	printf("Please enter first number:");
	 	scanf("%i",& num1);
	 	
	 	printf("Please enter oparation(+,-,/,*):");
	 	scanf("%i",&oparation);
	 	
	 	printf("Please enter second Number:");
	 	scanf("%i",num2);
	 	
	 	
	 	double result;
	 	if(oparation=='+'){
	 		result=num1+num2;
	 		printf("Result =%i",result);
	 		
		 } else if(oparation=='-'){
		 	result=num1-num2;
		 	printf("Result =%i",result);
		 	
		 } else if(oparation=='*'){
		 	result==num1*num2;
		 	printf("Result =%i",result);
		 } else if(oparation=='/'){
		 	if(num2!=0){
		 		result=num1/num2;
		 		printf("Result= %i",result);
		 		
		 	
			 }
		}
	}
			 

