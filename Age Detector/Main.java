#include<iostream>
using namespace std;
int main()
{
   int c,b,y;
   cin>>b;
   cin>>c;
   if(c<b)
   {
      b=100-b;
      y=b+c;
     cout<<y;
   }
   else
      cout<<c-b;
  return 0;
  //Type your code here.
}