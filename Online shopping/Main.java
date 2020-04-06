#include<iostream>
using namespace std;
int main()
{
   int fp,fd,fs,sp,sd,ss,ap,ad,as;
   string p[3]={"Flipkart","Snapdeal","Amazon"};
   cin>>fp;
   cin>>fd;
   cin>>fs;
   cin>>sp;
   cin>>sd;
   cin>>ss;
   cin>>ap;
   cin>>ad;
   cin>>as;
   int ft,st,at;
   ft=(fp-(fp*fd/100))+fs;
   st=(sp-(sp*sd/100))+ss;
   at=(ap-(ap*ad/100))+as;
   cout<<"In Flipkart Rs."<<ft;
   cout<<"\nIn Snapdeal Rs."<<st;
   cout<<"\nIn Amazon Rs."<<at;
   int h=ft <= st ? (ft <= at ? 0 : 2) : (st <= at ? 1 : 2);
   if(h==0 or h==1 or h==2)
     cout<<"\nHe will prefer "<<p[h];
   
   return 0;
  //Type your code here.
}