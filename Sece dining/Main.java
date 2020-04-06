#include<iostream>
using namespace std;
int main()
{
	string a;
	int x;
    cin>>a;
    cin>>x;
	if(a=="front")
	{
		if(x==1)
		{
			cout<<"Left Handed";
		}
		else
		{
			cout<<"Right Handed";
		}
	}
	else if(a=="rear")
	{
		if(x==1)
		{
			cout<<"Right Handed";
		}
		else
		{
			cout<<"Left Handed";
		}
	}
    
 return 0;
}