# Design Analysis and algorithms lab
# Travelling Salesman Problem using Python 3

from sys import maxsize
from itertools import permutations
V = 3

def travellingSalesmanProblem(graph, s):

    vertex = [0]
    for i in range(V):
        if i != s:
            vertex.append(i)

    min_path = maxsize
    next_permutation=permutations(vertex)
    for i in next_permutation:
        current_pathweight = 0

        k = s
        for j in i:
            current_pathweight += graph[k][j]
            k = j
            
        current_pathweight += graph[k][s]

        min_path = min(min_path, current_pathweight)
    
    for z in range (0,V):
        print (vertex[z], end = " ")
    return min_path




if __name__ == "__main__":

    n = int(input())

    p = list(map(int, input().split(" ")))
    q = list(map(int, input().split(" ")))
    r = list(map(int, input().split(" ")))
    s = list(map(int, input().split(" ")))
    total = [p,q,r,s]

    arr1 = []
    graph = []
    for i in range (0,n):
        for j in range (0,n):
            dest = int((((total[j][1] - total[i][1])**2) + ((total[j][2] - total[i][2])**2))**0.5)
            arr1.append(dest)
        
        graph.append(arr1)
        arr1 = []

    s = 0
    print(travellingSalesmanProblem(graph, s))
