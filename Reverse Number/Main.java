#include <iostream>
int main() 
{
   int n,r,s=0;
   std::cin>>n;
   while(n!=0){
     r=n%10;
     s=s*10+r;
     n/=10;
   }
  std::cout<<s;
	// Type your code here
	return 0;
}