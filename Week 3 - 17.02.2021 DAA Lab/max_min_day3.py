# Author : Abhishek Sharma
# DAA Lab 3
# Date : 17.02.2021
# First Problem
# Language used : Python

def minDiff(arr,n,k): 
    result = +2147483647
   
    # Sorting the array. 
    arr.sort() 
   
    # Find minimum value among 
    # all K size subarray. 
    for i in range(n-k+1): 
        result = int(min(result, arr[i+k-1] - arr[i])) 
   
    return result 
  
# Driver code 

arr= [] 

n =int(input())
k = int(input())
for z in range (0,n):
    arr.append(int(input()))


   
print(minDiff(arr, n, k)) 
