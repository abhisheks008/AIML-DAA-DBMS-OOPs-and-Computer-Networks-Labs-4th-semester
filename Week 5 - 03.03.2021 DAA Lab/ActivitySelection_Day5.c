// Author : Abhishek Sharma
// Acitivity Selection Problem using C language
// difficulty : medium
// score : 10


#include<stdio.h>
// pythonpapa
void printMaxActivities(int s[], int f[], int n)
{
    int i, j;
    int count = 1;
    // Code by Abhishek Sharma
    i = 0;
    // code in C
    for (j = 1; j < n; j++)
    {
    // pyhtonpapa
    if (s[j] >= f[i])
    {
        count = count + 1;
        i = j;
    }
    }
    printf ("%d", count);
}

// pythonpapa
int main()
{
    int n, s[10], f[10];
    scanf ("%d", &n);
    int z = 0;
    for (z=0; z<n; z++){
        scanf ("%d", &s[z]);
    }
    for (z=0; z<n; z++){
        scanf ("%d", &f[z]);
    }
    printMaxActivities(s, f, n);
    return 0;
}
// Code by Abhishek Sharma, 2021
