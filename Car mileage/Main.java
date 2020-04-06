#include<iostream>
using namespace std;
int main()
{
   float m;
   int p,d;
   cin>>m;
   cin>>p;
   cin>>d;
   float g=m*(float)p;
   if(g<d)
      cout<<"Cannot reach";
  else
      cout<<"Can reach";
  return 0;
  //Type your code here.
}