#include<stdio.h>

int main()
{
   int length;
   int width;
   int peimerter,area;
  
   
   printf("Please enter lenght of rectangle:");
   
   scanf("%d", &length);
   
   printf("Please enter witght of the rectengal\n ");
   scanf("%d",&width);
   
   peimerter=2*(length+width);
   area=width*length;
   
   printf("Peimerter =%d\n",peimerter);
   printf("Area of retengale is =%d", area);
}