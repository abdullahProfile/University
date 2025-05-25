#include<stdio.h>

void password(){
	//program create for passowrd with the hepl of function
	
	int n,password;
	
	printf("Please enter your passowrd:");
	scanf("%d",&n);
	//if password is equal to 1234 then that are correct 
	if(n==1234){
		printf("Correct password:\n");
		
	} else {
		//else that are wrong password
		printf("wrong passowrd:\n");
	}
}

int main(){
	//in their we call to the function at 7 times
	password();
		password();
			password();
				password();
					password();
						password();
							password();
}