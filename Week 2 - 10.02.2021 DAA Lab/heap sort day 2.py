# Author : Abhishek Sharma
# Heap Sort using Python

# Input Line :
# 5
# 4
# 3
# 2
# 1

# Output Line :
# 1 2 3 4 5


# Code :
def heapify(arr, n, i):
    largest = i
    l = 2 * i + 1
    r = 2 * i + 2
    # Libu : Author - Abhishek Sharma
    if l < n and arr[i] < arr[l]:
        largest = l
    if r < n and arr[largest] < arr[r]:
        largest = r
    if largest != i:
        arr[i], arr[largest] = arr[largest], arr[i]
        heapify(arr, n, largest)
  
  
def heapSort(arr):
    n = len(arr)
    for i in range(n//2, -1, -1):
        heapify(arr, n, i)
        # Libu : Heap Sort Using python
    for i in range(n-1, 0, -1):
        arr[i], arr[0] = arr[0], arr[i]
        heapify(arr, i, 0)
  

arr = []
for j in range (0,5):
    arr.append(int(input()))
heapSort(arr)
n = 5
for i in range(n):
    print(arr[i], end=' ')
