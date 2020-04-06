#include<iostream>
using namespace std;
int main()
{
     int s,e,j,i,sum,c=0;
     cin>>s;
     cin>>e;
   for(j=s;j<=e;j++){
     sum=0;
     for(i=1;i<j;i++)
     {
         if(j%i==0)
             sum+=i;
     }
     if(sum==j)
     {
        cout<<j<<" ";
     }
   }
  return 0;
}