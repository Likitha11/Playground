#include<iostream>
#include<cmath>
#include<math.h>
#include<iomanip>
using namespace std;
int main()
{
	int tb,tr,rs,bb;
	float rr;
	cin>>tb;
	cin>>tr;
	cin>>rs;
	cin>>bb;
	int o=tb/6;
	cout<<o;
	float b,c,d;
	int a=bb%6;
	b=float(a)/10;
	c=floorf((float)bb/6.0);
	d=(float)c+b;
	cout<<"\n"<<d;
	float e,f,g;
	e=(float)rs/d;
	cout<<"\n"<<round(e*10)/10;
	f=(float)tr/(float)o;
    g=round(f*10)/10;
	cout<<"\n"<<g;
    if(d<g)
       cout<<"\nEligible to Win";
    else
       cout<<"\nNot Eligible to Win";
  return 0;
}