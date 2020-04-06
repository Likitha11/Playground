#include<iostream>
using namespace std;
int main()
{
	int x,a,b,c;
	cin>>a;
	cin>>b;
	cin>>c;
	x=(a>=b && a>=c)?((b>=c)?b:c):((b>=c)?((a>=c)?a:c):((a>=b)?a:b));
    cout<<"The treasure is in box which has number "<<x<<"\n";
	if(b%a==0 && c%a==0)
    {
    	cout<<"The code to open the box is "<<a;
	}
	else if(a%b==0 && c%b==0)
	{
		cout<<"The code to open the box is "<<b;
	}
	else if(a%c==0 && b%c==0)
	{
		cout<<"The code to open the box is "<<c;
	}
	else
	{
		cout<<"The code to open the box is "<<1;
	}	
 return 0;
}