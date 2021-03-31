# Longest Common Subsequences using Python 3
# Design Analysis and Algorithms Lab 8
# Date : 31.03.2021



def lcs(X, Y, m, n):

    if m == 0 or n == 0:
        return 0
    elif X[m-1] == Y[n-1]:
        return 1 + lcs(X, Y, m-1, n-1)
    else:
        return max(lcs(X, Y, m, n-1), lcs(X, Y, m-1, n))


X = input().strip()
z = input()
Y = input().strip()
print (lcs(X , Y, len(X), len(Y)))
