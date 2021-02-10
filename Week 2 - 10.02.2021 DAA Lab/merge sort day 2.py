# Merge Sort using Python
# Author : Abhishek Sharma

# Input Line :
# 5
# 5 4 3 2 1

# Output Line :
# 1 2 3 4 5



def mergeSort(array):
    if len(array) > 1:
        r = len(array)//2
        L = array[:r]
        M = array[r:]
        mergeSort(L)
        mergeSort(M)
        i = j = k = 0
        while i < len(L) and j < len(M):
            if L[i] < M[j]:
                array[k] = L[i]
                i += 1
            else:
                array[k] = M[j]
                j += 1
            k += 1
        while i < len(L):
            array[k] = L[i]
            i += 1
            k += 1

        while j < len(M):
            array[k] = M[j]
            j += 1
            k += 1
# Author : Abhishek Sharma
def printList(array):
    for i in range(len(array)):
        print(array[i], end=" ")
    print()

# Merge Sort using Python
if __name__ == '__main__':
    z = int(input())
    array = list(map(int, input().split()))
    mergeSort(array)
    printList(array)
