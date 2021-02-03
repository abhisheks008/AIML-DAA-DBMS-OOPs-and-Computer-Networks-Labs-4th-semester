# Insertion Sort 24 in Python
# Author : Abhishek Sharma


length = int(input())
user = input().split(" ")
new = []
for i in range (0,length):
    new.append(int(user[i]))

new.sort()

for i in range (0,length):
    print (new[i], end = " ")
