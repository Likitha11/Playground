#include<iostream>
int main(){
  int m=1,n;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    m*=i;
  }
  std::cout<<m;
  return 0;
  // Type your code here
}