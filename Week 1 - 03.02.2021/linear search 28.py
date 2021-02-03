# Linear Search 28 solution in Python
# Author : Abhishek Sharma

str = input().split(" ")
length = int(str[0])
find = str[1]

user = input().split(" ")
for i in range (length,0,-1):
    if user[i-1]==find :
        print (i)
        break
    else:
        print (-1)
