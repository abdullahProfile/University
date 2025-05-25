#include<stdio.h>

int main(){
	
	int age,ok,clear;
	int healtly=ok;
	char dmt=clear;
	
	printf("Please enter your age:");
	scanf("%d", & age);
	
	printf("Please enter your healt:");
	scanf("%s", & healtly );
	
	
	printf("Please enter your Document:");
	scanf("%d",  dmt);
	
	if(age>=18 ){
		if(healtly==ok){
			if(dmt==clear){
			}
		}
		
		printf("Your eligible for ID card");
	} else 
	
		printf("Your are not eligible sorry:");
	
}