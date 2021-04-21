# Design Analysis and Algorithms Lab Coding Comp Phase 1
# Max Min problem using Python 3
# Code Contributed by, Abhishek Sharma


def minDiff(arr,n,k): 
    result = +2147483647
    arr.sort() 
    for i in range(n-k+1): 
        result = int(min(result, arr[i+k-1] - arr[i])) 
   
    return result 


arr= [] 

n =int(input())
k = int(input())
for z in range (0,n):
    arr.append(int(input()))


   
print(minDiff(arr, n, k)) 
