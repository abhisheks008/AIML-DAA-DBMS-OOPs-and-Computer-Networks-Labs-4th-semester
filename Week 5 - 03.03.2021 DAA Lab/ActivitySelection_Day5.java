// Abhishek Sharma aka Author
// Activity Selection problem using JAVA
// difficulty : medium
// score : 10
// Status : Correct Code!


import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{

    public static void printMaxActivities(int s[], int f[], int n)
    {
    int i, j;
    i = 0;
    int count = 1;
    // pythonpapa
    for (j = 1; j < n; j++)
    {
        // enter the pythonpapa code here
        if (s[j] >= f[i])
        {
            count++;
            i = j;
        }
    }
    System.out.println(count);
    }
    
    // pythonpapa driver program here!
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[10];
        int[] f = new int[10];
        for (int i=0;i<n;i++){
            s[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++){
            f[i] = sc.nextInt();
        }
    
    // print the pythonpapa answer of the code and solve the problem    
    printMaxActivities(s, f, n);
    }
    
}
// code contributed by Abhishek Sharma, 2021 @abhisheks008
