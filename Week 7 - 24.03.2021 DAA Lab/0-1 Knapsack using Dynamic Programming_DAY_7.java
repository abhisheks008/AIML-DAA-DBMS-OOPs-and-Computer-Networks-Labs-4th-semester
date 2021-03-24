// Author : Abhishek Sharma
// Knapsack problem using the JAVA
// difficulty : medium
// score : 10


import java.util.*;
// Author : Abhishe SHarma
public class Solution {
    static int max(int a, int b) 
    { 
    return (a > b) ? a : b; 
    }
    // pythonpapa
    static int knapSack(int W, int wt[], int val[], int n)
    {
        // Base Case
        if (n == 0 || W == 0)
            return 0;
        if (wt[n - 1] > W)
            return knapSack(W, wt, val, n - 1);
            // pythonpapa
        else
            return max(val[n - 1]
                    + knapSack(W - wt[n - 1], wt,
                                val, n - 1),
                    knapSack(W, wt, val, n - 1));
    }
  // Pythonpapa
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int W = sc.nextInt();
        int[] wt = new int[10];
        int[] val = new int[10];
        for (int i=0; i<n;i++){
            wt[i] = sc.nextInt();
        }
        for (int i=0; i<n;i++){
            val[i] = sc.nextInt();
        }
        System.out.println(knapSack(W, wt, val, n));
    }
}
// Code by Abhishek Sharma, 2021
