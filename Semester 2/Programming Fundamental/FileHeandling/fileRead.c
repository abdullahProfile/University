#include <stdio.h>
#include<stdlib.h>
#include<string.h>

void readFile(){

  FILE *rd= fopen("read.tax", "r");
  
  char ch;
  while((ch=fgetc(rd))!=EOF){
    printf("%c",ch);
  }
}

  void readfile(){

    FILE *rp=fopen("read1.Tax", "r");

    char ch;

    // ch=fgetc(rp); 

  
   while((ch=fgetc(rp)) !=EOF){
        printf("%c",ch);
    }
  } 
  void readthirdfile(){

    FILE *read=fopen("readthird.tax", "r");
    
    char ch;

   

    while((ch=fgetc(read)) !=EOF){
        printf("%c",ch);
    }

  }


int main(void) {

 readthirdfile();

 readFile();
  
  return 0;
}