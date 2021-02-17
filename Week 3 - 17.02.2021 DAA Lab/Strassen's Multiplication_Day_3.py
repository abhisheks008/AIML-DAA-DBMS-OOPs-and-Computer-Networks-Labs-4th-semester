# Author : Abhishek Sharma
# DAA Lab 3
# Date : 17.02.2021
# Languages used : Python
# Second Problem

def divide11(a,n):
    k=int(n/2)
    a11=[ [[0] for i in range(0,k)] for j in range(0,k)]#initialization matrix
    for i in range(0,k):
        for j in range(0,k):
            a11[i][j]=a[i][j]
    return a11
 
def divide12(a,n):
    k=int(n/2)
    a12=[ [ [0] for i in range(0,k)]  for j in range(0,k)]
    for i in range(0,k):
        for j in range(0,k):
            a12[i][j]=a[i][j+k]
    return a12
 
def divide21(a,n):
    k=int(n/2)
    a21=[ [ [0] for i in range(0,k)]  for j in range(0,k)]
    for i in range(0,k):
        for j in range(0,k):
            a21[i][j]=a[i+k][j]
    return a21
 
def divide22(a,n):
    k=int(n/2)
    a22=[ [ [0] for i in range(0,k)]  for j in range(0,k)]
    for i in range(0,k):
        for j in range(0,k):
            a22[i][j]=a[i+k][j+k]
    return a22
 
def Merge(a11,a12,a21,a22,n):
    k=int(2*n)
    a = [[[0] for i in range(0, k)] for j in range(0, k)]
    for i in range(0,n):
        for j in range(0,n):
            a[i][j]=a11[i][j]
            a[i][j+n]=a12[i][j]
            a[i+n][j]=a21[i][j]
            a[i+n][j+n]=a22[i][j]
    return a
 
def Plus(a,b,n):
    c=[[[0] for i in range(0, n)] for j in range(0, n)]
    for i in range(0,n):
        for j in range(0,n):
            c[i][j]=a[i][j]+b[i][j]
    return  c
 
def Minus(a,b,n):
    c=[[[0] for i in range(0, n)] for j in range(0, n)]
    for i in range(0,n):
        for j in range(0,n):
            c[i][j]=a[i][j]-b[i][j]
    return  c
 
 
def Strassen(a, b, n):
    k = n
    if k == 2:
        d = [[[0] for i in range(2)] for i in range(2)]
        d[0][0] = a[0][0] * b[0][0] + a[0][1] * b[1][0]
        d[0][1] = a[0][0] * b[0][1] + a[0][1] * b[1][1]
        d[1][0] = a[1][0] * b[0][0] + a[1][1] * b[1][0]
        d[1][1] = a[1][0] * b[0][1] + a[1][1] * b[1][1]
        return d
    else:
        a11 = divide11(a, n)
        a12 = divide12(a, n)
        a21 = divide21(a, n)
        a22 = divide22(a, n)
        b11 = divide11(b, n)
        b12 = divide12(b, n)
        b21 = divide21(b, n)
        b22 = divide22(b, n)
        k = int(n / 2)
        m1 = Strassen(a11, Minus(b12, b22, k), k)
        m2 = Strassen(Plus(a11, a12, k), b22, k)
        m3 = Strassen(Plus(a21, a22, k), b11, k)
        m4 = Strassen(a22, Minus(b21, b11, k), k)
        m5 = Strassen(Plus(a11, a22, k), Plus(b11, b22, k), k)
        m6 = Strassen(Minus(a12, a22, k), Plus(b21, b22, k), k)
        m7 = Strassen(Minus(a11, a21, k), Plus(b11, b12, k), k)
 
        c11 = Plus(Minus(Plus(m5, m4, k), m2, k), m6, k)
        c12 = Plus(m1, m2, k)
        c21 = Plus(m3, m4, k)
        c22 = Minus(Minus(Plus(m5, m1, k), m3, k), m7, k)
        c = Merge(c11, c12, c21, c22, k)   
        return c
 
 
y = int(input())
z = int(input())
a1 = list(map(int, input().split()))
a2 = list(map(int, input().split()))
b1 = list(map(int, input().split()))
b2 = list(map(int, input().split()))
a=[a1,a2]
b=[b1,b2]
Z = Strassen(a, b, y)

for i in range (0,y):
    for j in range (0,z):
        print(Z[i][j], end = " ")
    print ()
