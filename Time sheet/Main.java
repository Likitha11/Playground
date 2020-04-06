#include<iostream>
using namespace std;
int main()
{
	int a[7],s=0,f=0,su=50,st=25,n=0;
	for(int i=0;i<7;i++)
	{
		cin>>a[i];
	}
		for(int i=1;i<6;i++)
		{
			if(a[i]<=8)
			{
				f+=a[i]*100;
			}
			else if(a[i]>8)
			{
				int h=(a[i]-8)*15;
				f+=(a[i]*100)+h;
			}
		}
	if(a[0]!=0)
	{
		f+=(a[0]*100)+(a[0]*su);
	}
	if(a[6]!=0)
	{
		f+=(a[6]*100)+(a[6]*st);
	}
  cout<<f;
  return 0;
}