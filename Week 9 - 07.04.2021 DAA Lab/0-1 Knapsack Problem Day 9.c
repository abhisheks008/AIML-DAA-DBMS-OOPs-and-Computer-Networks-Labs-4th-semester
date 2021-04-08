// DAA Lab 9 Week 9
// 0-1 Knapsack problem using the DP
// Author : Abhishek Sharma



#include <stdio.h>
int max(int a, int b) 
{ 
  return (a > b) ? a : b; 
}
// Author : Abhishek Sharma
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
// pythonpapa
int main()
{
    int W, wt[10], val[10], n;
    scanf ("%d",&n);
    scanf ("%d", &W);
    int i = 0;
    for(i = 0; i<n; i++){
        scanf ("%d", &wt[i]);
    }
    for(i = 0; i<n; i++){
        scanf ("%d", &val[i]);
    }
    printf("%d", knapSack(W, wt, val, n));
    return 0;
}
