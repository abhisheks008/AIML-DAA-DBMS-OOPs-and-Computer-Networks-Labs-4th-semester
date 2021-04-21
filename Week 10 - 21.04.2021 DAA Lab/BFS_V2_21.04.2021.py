# Design Analysis and Algorithms Lab Coding Comp Phase 1
# Breadth First Search using Python 3
# version II
# Code contributed by, Abhishek Sharma

def get_adj(node, graph):
    adj_list = []
    process_list = graph[node]
    for i in range(len(process_list)):
        if process_list[i] == 1:
            adj_list.append(i)
    return adj_list 
def solution(graph, source, destination):
    marked = [False for i in range(n)]
    distance = [-1 for i in range(n)]
    path = [-1 for i in range(n)]
    q = [source]
    distance[source] = 0
    marked[source] = True 
    while (len(q) != 0):
        current_node = q.pop()
        for adj in get_adj(current_node, graph):
            if not marked[adj]:
                q.append(adj)
                marked[adj] = True
                distance[adj] = distance[current_node] + 1
                path[adj] = current_node  
    path_data = [destination]
    current = path[destination] 
    while current != -1:
        path_data.append(current)
        current = path[current]
    path_string = " ".join(str(ele) for ele in path_data[::-1])
    return (distance[destination], path_string) 
 
if __name__ == "__main__":
    t = int(input())
    for i in range(t):
        n = int(input())
        graph = [[0 for j in range(n)] for i in range(n)]
        for j in range(n):
            graph[j] = [int(ele) for ele in input().split()]
        source,destination = map(int, input().split())
        count, path = solution(graph, source, destination)
        print(count)
        print(path)
