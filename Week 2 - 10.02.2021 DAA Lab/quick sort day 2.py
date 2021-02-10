# Author : Abhishek Sharma
# Quick Sort using Python

# Input Line :
# 5
# 5 4 2 3 1

# Output Line :
# 1 2 3 4 5


# Code :
def partition(array, low, high):
    pivot = array[high]
    i = low - 1
    for j in range(low, high):
        if array[j] <= pivot:
            i = i + 1
            (array[i], array[j]) = (array[j], array[i])
    (array[i + 1], array[high]) = (array[high], array[i + 1])
    return i + 1

# author : Abhishek Sharma
def quickSort(array, low, high):
    if low < high:
        pi = partition(array, low, high)
        quickSort(array, low, pi - 1)
        quickSort(array, pi + 1, high)

# Quick Sort using Python 3
size = int(input())
data = list(map(int, input().split()))
quickSort(data, 0, size - 1)
for z in range (0,size):
    print (data[z], end = " ")
