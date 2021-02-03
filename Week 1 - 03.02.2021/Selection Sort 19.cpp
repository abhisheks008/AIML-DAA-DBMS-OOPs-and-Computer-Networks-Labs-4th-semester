// Selection Sort using C++
// Author : Abhishek Sharma

#include<iostream>
 
using std::cout;
using std::cin;
using std::endl;
 
void insertionsort(int p[],int no_of_steps,int n)
{
    int min_ele;
    int addr;
    int temp;
 
    for (int i = 0; i<no_of_steps; ++i)
    {
 
        min_ele = p[i];
        addr = i;
 
        for(int j=i+1;j<n;++j)
        {
            if (p[j]<min_ele)
            {
                min_ele = p[j];
                addr = j;
            }
        }
 
        temp = p[i];
        p[i] = p[addr];
        p[addr] = temp;
    }
 
}
 
int main()
{
    int n,no_of_steps;
    cin>>n>>no_of_steps;
    int a[n];
    for(int i=0;i<n;++i)
    {
        cin>>a[i];
    }
 
    // cout<<"output:"<<endl<<endl;
 
    // for(int i=0;i<n;++i)
    // {
    //     cout<<a[i]<<' ';
    // }
 
    insertionsort(a,no_of_steps,n);
 
    for(int i=0;i<n;++i)
    {
        cout<<a[i]<<' ';
    }
 
    return 0;
}
