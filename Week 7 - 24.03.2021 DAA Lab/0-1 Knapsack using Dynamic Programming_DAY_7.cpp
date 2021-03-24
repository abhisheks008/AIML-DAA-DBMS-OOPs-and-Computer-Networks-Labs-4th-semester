// Author : Abhishek Sharma
// Knapsack Problem using C++ language
// difficulty : medium
// score : 10



#include <bits/stdc++.h>
using namespace std;
int max(int a, int b) 
{ 
  return (a > b) ? a : b; 
}
// pythonpapa
int knapSack(int W, int wt[], int val[], int n)
{

    if (n == 0 || W == 0)
        return 0;

    if (wt[n - 1] > W)
        return knapSack(W, wt, val, n - 1);

    else
        return max(
            val[n - 1]
                + knapSack(W - wt[n - 1], 
                        wt, val, n - 1),
            knapSack(W, wt, val, n - 1));
}

// Author : Abhishek Sharma
int main()
{
    int n, W, wt[10], val[10];
    cin>>n;
    cin>>W;
    for (int i = 0; i<n; i++){
        cin>>wt[i];
    }
    for (int i = 0; i<n; i++){
        cin>>val[i];
    }
    // pythonpapa
    cout << knapSack(W, wt, val, n);
    return 0;
}
// Author : Abhishek Sharma
