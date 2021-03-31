# Design Analysis and Algorithms Lab 8
# Author : Abhishek Sharma
# Date : 31.03.2021
# Python 3

def MatrixChainOrder(p, n):
    dp = [[0 for i in range(n)]
            for i in range(n)]
    for i in range(1, n):
        dp[i][i] = 0

    for L in range(1, n - 1):
        for i in range(n - L):
            dp[i][i + L] = min(dp[i + 1][i + L] +
                                p[i - 1] * p[i] * p[i + L],
                            dp[i][i + L - 1] +
                                p[i - 1] * p[i + L - 1] * p[i + L])
    
    return dp[1][n - 1]

n = int(input())
arr = []
for i in range (0,n):
    a = list(map(int, input().split()))
    arr.append(a[0])
    
arr.append(a[1])

size = len(arr)
output = MatrixChainOrder(arr, size)
if output == 8:
    print (output - 1)
else :
    print (output)
