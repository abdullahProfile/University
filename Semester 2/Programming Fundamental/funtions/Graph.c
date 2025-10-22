#include<stdio.h>

void quadrante()
{
	
	int x,y,quadrante;
	
	printf("Please enter X and Y:");
	
	scanf("%d", &x,&y);
	
   switch(quadrante){
   	case '+':
   		if(x=='+' && y=='+'){
   			printf("First quadrante");
   		break;
		   }
   		
   		
   }
}
int main(){
	quadrante();

}