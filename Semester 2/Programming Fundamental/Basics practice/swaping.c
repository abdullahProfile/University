#include<iostream>
using namespace std;
int main(){
	int x;
	int y;
	int z;
	
	cout<<"Enter the valve of x:"<<endl;
	cin>>x;
	
	cout<<"Enter the valve of y:"<<endl;
	cin>>y;
	cout<<x<<" "<<y<<" "<<endl;
	
    z = y;
    y = x;
    x = z;
	
	cout<<x<<"  "<<y<<" "<<endl;
	
	return 0;
}