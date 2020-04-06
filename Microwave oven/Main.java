
#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
	 float a,b,c;
	 int x,y,z;
	 cin>>x;
	 cin>>a;
	 if(x<=2){
	 c=a*0.5;
	 b=c+a;
	 cout<<fixed<<setprecision(2)<<b;
    }
    else if(x==3)
    {
       c=a*0.5;
	   b=(2*c)+a;
	   cout<<fixed<<setprecision(2)<<b;	
	}
    else
      cout<<"Number of items is more";
    return 0;
}
	 
