#include<stdio.h>

#include<stdlib.h>
#include<string.h>

void writeFile(){

    FILE *wf;

    wf=fopen("WriteFile.txt", "w");

    if(wf==NULL){
        printf("Error no content in File:");

        exit(1);
    }
    fprintf(wf,"%s","This my first practice to write file in c language");


    fclose(wf);
}
int main(){
    writeFile();

    return 0;
}