#include<stdio.h>
#include<math.h>
int main(){
	
	//program is writen for greatest in three number
	//variable declaration 
	int a=15;
	int b=35;
	int c=15;
    //codition statment 
    //compliler check codition if it ture then direct show result on screen and ignore other
    if(a>b && a>c){
    	printf("A is greater than b and c");
    	
    	/* if first condition is not ture then 
		compliler check second condition 
		if the second condition is ture then the result show
		 on screen and ignore other codition*/
    	}else if(b>a && b> c){
    		
    		printf("B is greater than a and c");
    		
    		//if second condition is false then compiler check thired codition
		} else if(c>a && c>b){
			
			printf("C is greater than a and c");
		}
	}
     
	
	
