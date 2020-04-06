#include<iostream>
int main()
{
   int n,c=0;
   std::cin>>n;
   do{
       ++c;
       n/=10;
   }while(n!=0);
  std::cout<<c;
  return 0;
  // Type your code here
}