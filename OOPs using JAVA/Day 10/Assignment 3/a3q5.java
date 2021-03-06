// Write a Java program to find the range of a 1D array.

import java.io.*; 
// Author : Abhishek Sharma
class a3q5 { 
 
static float getMin(float arr[], int n) 
{ 
    float res = arr[0]; 
    for (int i = 1; i < n; i++) 
        res = Math.min(res, arr[i]); 
    return res; 
} 
static float getMax(float arr[], int n) 
{ 
    float res = arr[0]; 
    for (int i = 1; i < n; i++) 
        res = Math.max(res, arr[i]); 
    return res; 
} 
static void findRangeAndCoefficient(float arr[], int n) 
{ 
    float max = getMax(arr, n); 
    float min = getMin(arr, n); 
    float range = max - min; 
    System.out.println("Range : " + range );  
} 
    public static void main (String[] args) { 
    
    float arr[] = { 5, 10, 15, 20, 56, 54 }; 
    int n = arr.length; 
    findRangeAndCoefficient(arr, n); 
    } 
}

/*
Output :
Range : 51.0
*/
