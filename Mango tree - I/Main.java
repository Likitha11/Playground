#include<iostream>
using namespace std;
int main()
{
	int r,c,t,p=1,cp=0;
	cin>>r;
	cin>>c;
	cin>>t;
	int a[r][c];
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			a[i][j]=p;
			p=p+1;
		}
	}
	
    for(int i=0;i<c;i++)
    {
    	if(a[0][i]==t)
    	{
    		cout<<"Yes";
    		cp=1;
    		break;
		}
	}
	if(cp==0){
	for(int i=0;i<r;i++)
	{
		if(a[i][0]==t || a[i][c-1]==t)
		{
			cout<<"Yes";
			cp=1;
			break;
		}
	}
  }
  if(cp==0)
      cout<<"No";
 return 0;
}