# Design Analysis and Algorithms Lab Coding Comp Phase 1
# Breadth First Search using Python 3
# version I
# Code contributed by, Abhishek Sharma

result = []
z = 0
class Graph:
    
    adj = []
    z = 0
    def __init__(self, v, e):
         
        self.v = v
        self.e = e
        Graph.adj = [[0 for i in range(v)]
                        for j in range(v)]
    def addEdge(self, start, e):
        Graph.adj[start][e] = 1
        Graph.adj[e][start] = 1
    def BFS(self, start):
        global z  
        visited = [False] * self.v
        q = [start]
        visited[start] = True
 
        while q:
            vis = q[0]
            result.append(vis)
            z = z + 1
            q.pop(0)
            for i in range(self.v):
                if (Graph.adj[vis][i] == 1 and
                      (not visited[i])):
                    q.append(i)
                     
                    # set
                    visited[i] = True
 

v, e = 5, 4
a1 = int(input())
a2 = int(input())
a3 = list(map(int, input().split(" ")))
a4 = list(map(int, input().split(" ")))
a5 = list(map(int, input().split(" ")))
a6 = list(map(int, input().split(" ")))
a7 = list(map(int, input().split(" ")))
a8 = list(map(int, input().split(" ")))

G = Graph(v, e)
G.addEdge(0, 2)
G.addEdge(2, 3)
G.addEdge(3, 4)

G.BFS(0)
print (z-1)
for i in range (0, len(result)):
    print (result[i], end = " ")
