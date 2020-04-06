#include<iostream>
using namespace std;
int main()
{
  int m,n,s=0;
  cin>>m;
  cin>>n;
  int f=m+n;
  for(int i=1;i<f;i++)
  {
     if(f%i==0)
     {
        s=s+i;
     }
  }
  if(s==f)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
  return 0;
}