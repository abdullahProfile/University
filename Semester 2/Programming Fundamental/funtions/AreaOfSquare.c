#include<stdio.h>

void areaOfsquare() {
	//program for area of traingle 
	//side one and two declared in integar data type
	
	
	int side1,side2;
	int areaOfsquare;
	printf("Please enter Side one of square:");
	scanf("%d",&side1);
	
	printf("Please enter side two of a square:");
	scanf("%d",& side2);
	
	//we find area of square formula=side*side
	
	areaOfsquare=side1*side2;
	
	printf("area of square =%i\n", areaOfsquare);
}
int main(){
	//in main function we call to void function or declared function
	areaOfsquare();
	areaOfsquare();
	areaOfsquare();
	areaOfsquare();
	areaOfsquare();
	areaOfsquare();
	areaOfsquare();
}