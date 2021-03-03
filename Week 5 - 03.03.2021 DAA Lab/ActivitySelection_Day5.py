# Author : Abhishek Sharma
# Q2. Activity Selection problem using Python 3
# Design analysis and Algorithm Problems
# difficulty : medium
# score : 10


def printMaxActivities(start , finish):
    n = len(start)    
    z = 1
    i = 0

    for j in range(1,n):

        if start[j] >= finish[i]:
            z = z + 1
            i = j
    print (z)

# Author : Abhishek Sharma
n = int(input())
start = list(map(int, input().strip().split()))
finish = list(map(int, input().strip().split()))
printMaxActivities(start , finish)
