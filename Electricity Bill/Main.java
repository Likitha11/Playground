#include<iostream>
using namespace std;
int main()
{
    int  e;
    cin>>e;
   if(e<=200)
   {
      float f=float(e)*0.5;
      cout<<"Rs."<<int(f);
   }
  else if(e<=400)
  {
     int s=(e*0.65*10)+100;
     cout<<"Rs."<<s;
  }
  else if(e<=600)
  {
     int s=(e*0.8*10)+200;
     cout<<"Rs."<<s;
  }
  else
  {
     int s=(e*1.25*10)+425;
     cout<<"Rs."<<s;
  }
  return 0;

  //Type your code here.
}