#include<stdio.h>

void fun(int x, int y);

int main()   {
	
	int x=17, y=15;
	
	fun(x,y);
	
	printf("Calling function :\n");
	printf("x=%d y=%d\n", x,y);
}

void fun(int x, int y) {
	
	 x=17;
	 y=15;
	
	printf("Called function or definition function:\n");
	printf("x=%d y=%d\n", x,y);
}