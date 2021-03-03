// Author : Abhishek Sharma
// Activity Selection problem using the C++ language
// difficulty : medium
// score : 10


#include <bits/stdc++.h>
using namespace std;
// pythonpapa
void printMaxActivities(int s[], int f[], int n)
{
    int i, j;
    int count = 1;
    i = 0;
    for (j = 1; j < n; j++)
    {
    // pythonpapa
    if (s[j] >= f[i])
    {
        count++;
        i = j;
    }
    }
    cout<<count;
}

int main()
{
    int n, s[10], f[10];
    cin>>n;
    for (int i = 0; i<n;i++){
        cin>>s[i];
    }
    for (int i = 0; i<n;i++){
        cin>>f[i];
    }

    printMaxActivities(s, f, n);
    return 0;
}
// Code by, Abhishek Sharma, 2021 @abhisheks008
