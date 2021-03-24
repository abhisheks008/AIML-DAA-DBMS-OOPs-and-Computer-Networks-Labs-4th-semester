// BELLMAN_FORD_DAY_7 solved using C++ language
// difficulty : medium
// score : 10
// Design analysis and algorithm lab 7
// date : 24.03.2021
// Code Contributed by, Abhishek Sharma, 2021

// Author : Abhishek SHarma
#include<iostream>
#include<iomanip>
// Author : Abhishek Sharma
#define INF 999
using namespace std;
int V;
int costMat[10][10];
// pythonpapa
typedef struct {
   int u, v, cost;
}edge;
// javaman
int isDiagraph() {
   int i, j;
   for(i = 0; i<V; i++) {
      for(j = 0; j<V; j++) {
         if(costMat[i][j] != costMat[j][i]) {
            return 1;
         }
      }
   }
   return 0;
}
// Author : Abhishek Sharma
int makeEdgeList(edge *eList) {
   int count = -1;
   if(isDiagraph()) {
      for(int i = 0; i<V; i++) {
         for(int j = 0; j<V; j++) {
            if(costMat[i][j] != 0 && costMat[i][j] != INF) {
               count++;        
               eList[count].u = i; eList[count].v = j;
               eList[count].cost = costMat[i][j];
            }
         }
      }
   }else {
      for(int i = 0; i<V; i++) {
         for(int j = 0; j<i; j++) {
            if(costMat[i][j] != INF) {
               count++;
               eList[count].u = i; eList[count].v = j;
               eList[count].cost = costMat[i][j];
            }
         }
      }
   }
   return count+1;
}
// pythonpapa
int bellmanFord(int *dist, int *pred,int src) {
   int icount = 1, ecount, max = V*(V-1)/2;
   edge edgeList[max];
   // pythonpapa
   for(int i = 0; i<V; i++) {
      dist[i] = INF;      
      pred[i] = -1;      
   }

   dist[src] = 0;
   ecount = makeEdgeList(edgeList);      

   while(icount < V) {       
      for(int i = 0; i<ecount; i++) {
         if(dist[edgeList[i].v] > dist[edgeList[i].u] + costMat[edgeList[i].u][edgeList[i].v]) 
         {      
            dist[edgeList[i].v] = dist[edgeList[i].u] + costMat[edgeList[i].u][edgeList[i].v];
            pred[edgeList[i].v] = edgeList[i].u;
         }
      }
      icount++;
   }

   for(int i = 0; i<ecount; i++) {
      if(dist[edgeList[i].v] > dist[edgeList[i].u] + costMat[edgeList[i].u][edgeList[i].v]) {
         return 1; 
      }
   }

   return 0;
}
// Author : Abhishek Sharma
void display(int *dist, int *pred) {
   for(int i = 0; i<V; i++)
      cout<<dist[i]<<" ";
}
// Abhisheks008
int main() {
   int source = 0;
   cin>>V;
   int dist[V], pred[V];
   for (int i = 0;i<V;i++){
           for (int j = 0;j<V;j++){
               cin>>costMat[i][j];    
        }
   }
   source = 0;
   bellmanFord(dist, pred, source);           
   display(dist, pred);
}
