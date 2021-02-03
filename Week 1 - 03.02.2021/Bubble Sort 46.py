# Bubble Sort using Python
# Author : Abhishek Sharma

n = int(input().strip())
user= list(map(int, input().split()))
           
count = 0
for j in range (0,n-1):
    for i in range (0,n-j-1):
        if user[i]>user[i+1]:
            user[i]=user[i]+user[i+1]
            user[i+1]=user[i]-user[i+1]
            user[i]=user[i]-user[i+1]
            count = count + 1
            
print (count)
