# binary search 6 in Python
# author : Abhishek Sharma

n = int(input())
user = list(map(int, input().split(" ")))

t = int(input())
for i in range (0,t):
    c = int(input())
    for j in range (0,len(user)):
        if user[j]==c:
            print (j+1)
            break
