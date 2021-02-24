# Author : Abhishek Sharma
# Problem : DFS_Day_4
# Language used : Python 3



class Graph:
    def __init__(self, V):
        self.V = V
        self.adj = [[] for i in range(V)]

    def addEdge(self, v, w):
        self.adj[v].append(w) # Add w to v’s list. 
        self.adj[w].append(v) # Add v to w's list.
    
    def DFSUtil(self, v, visited):
        
        # Mark the current node as 
        # visited and print it 
        visited[v] = True
    
        # Recur for all the vertices 
        # adjacent to this vertex
        i = self.adj[v][0]
        for i in self.adj[v]:
            if (not visited[i]): 
                self.DFSUtil(i, visited) 
    
    # Returns count of not reachable 
    # nodes from vertex v. 
    # It uses recursive DFSUtil() 
    def countNotReach(self, v):
        
        # Mark all the vertices as not visited 
        visited = [False] * self.V
    
        # Call the recursive helper 
        # function to prDFS traversal 
        self.DFSUtil(v, visited) 
    
        # Return count of not visited nodes 
        count = 0
        for i in range(self.V):
            if (visited[i] == False): 
                count += 1
        return count

# Driver Code
if __name__ == '__main__':

    # Author : Abhishek Sharma
    g = Graph(8) 
    g.addEdge(0, 1) 
    g.addEdge(0, 2) 
    g.addEdge(1, 2) 
    g.addEdge(3, 4) 
    g.addEdge(4, 5) 
    g.addEdge(6, 7) 

    print(0)
