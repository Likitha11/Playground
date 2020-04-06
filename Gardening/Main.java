#include<iostream>
using namespace std;
int main()
{
    int r,c,t,f=0;
    cin>>r;
    cin>>c;
    cin>>t;
    int e=1;
    int a[r][c];
    for(int i=0;i<c;i++){
	
       for(int j=0;j<r;j++){
	   
           a[j][i]=e;
           e=e+1;
    }
}
   int p=1,q=c-2;
   for(int i=0;i<r;i++)
   {
   	  if(a[i][p]==t or a[i][q]==t){
   	  	 f=1;
   	      cout<<"It is a mango tree";
   	      break;
   	   } 	      
   }
   if(f==0)
      cout<<"It is not a mango tree";
   return 0;   
  //Type your code here.
}