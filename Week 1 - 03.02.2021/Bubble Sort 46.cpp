// Bubble Sort using C++
// Author : Abhishek Sharma

#include<iostream>
using namespace std;
 
int main()
{
 int N,i,j,a[100],c=0;
 cin>>N;
 for(i=0;i<N;i++)
 {
     cin>>a[i];
 }
 for(j=0;j<N-1;j++)
 {
     for(i=0;i<N-j-1;i++)
     {
         if(a[i]>a[i+1])
         {
             a[i]=a[i]+a[i+1];
             a[i+1]=a[i]-a[i+1];
             a[i]=a[i]-a[i+1];
             c++;
         }
     }
 }
 
cout<<c;
    return 0;
}
