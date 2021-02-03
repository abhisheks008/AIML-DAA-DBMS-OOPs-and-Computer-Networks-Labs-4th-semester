# Selection Sort using Python
# Author : Abhishek Sharma

def selection_sort(user, s, n):
    for i in range (0,s):
        min_val = user[i]
        addr = i
        for j in range (i+1,n):
            if user[j]<min_val:
                min_val = user[j]
                addr = j
        temp = user[i]
        user[i]=user[addr]
        user[addr]=temp
        

first = list(map(int, input().split(" ")))
n = first[0]
s = first[1]
user = list(map(int, input().split(" ")))
selection_sort(user,s,n)
for k in range (0,n):
    print (user[k], end = " ")
