#include<iostream>
using namespace std;
int main()
{
   float s,f;
   int a;
   cin>>a;
   cin>>s;
  f=13.30;
   if(a<=13)
   {
      if(s==f)
         cout<<"$2.00";
      else
         cout<<"$4.00";
   }
  else
  {
    if(s==f)
         cout<<"$5.00";
      else
         cout<<"$8.00";
  }
  return 0;
  //Type your code here.
}