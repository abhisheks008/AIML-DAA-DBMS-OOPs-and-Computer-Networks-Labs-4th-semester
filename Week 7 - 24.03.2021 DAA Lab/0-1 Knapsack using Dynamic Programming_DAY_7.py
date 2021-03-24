# 0-1 Knapsack using Dynamic Programming_DAY_7 solved in Python 3
# Difficulty : Medium
# Score : 10
# Design analysis and algorithms lab 7
# date : 24.03.2021
# Code contributed by, Abhishek Sharma, 2021

def knapSack(W, wt, val, n):
    if n == 0 or W == 0:
        return 0
    if (wt[n-1] > W):
        return knapSack(W, wt, val, n-1)
    else:
        return max(
            val[n-1] + knapSack(
                W-wt[n-1], wt, val, n-1),
            knapSack(W, wt, val, n-1))
# Author : Abhishek Sharma
n = int(input())
W = int(input())
wt = list(map(int, input().split()))
val = list(map(int, input().split()))
# pythonpapa
print (knapSack(W, wt, val, n))

