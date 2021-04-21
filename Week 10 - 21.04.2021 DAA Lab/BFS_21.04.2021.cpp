// Design Analysis and Algorithms Lab coding comp Phase 1
// Breadth First Search using C++
// Code Contributed by, Abhishek Sharma



#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
#include <cstring>
 
using namespace std;
const int N = 1e3 + 3;
int arr[N][N];
int vis[N];
int par[N];
 
void init() {
    memset(vis, 0, N * sizeof(vis[0]));
    memset(par, -1, N * sizeof(par[0]));
}
 
void printPath(int d) {
    if (par[d] == -1) {
        cout << d;
        return;
    }
    printPath(par[d]);
    cout << " " << d;
}
 
int bfs(int source, int destination) {
    if (source == destination)
        return 0;
    vector<int> q;
    q.push_back(source);
    vis[source] = 1;
    int cost = 0;
    while (!q.empty()) {
        cost++;
        int sz = q.size();
        for (int k = 0; k < sz; ++k) {
            if (q[k] == destination) return cost - 1;
            for (int a = 0; a < N; ++a) {
                int curr = arr[q[k]][a];
                if (curr && !vis[a]) {
                    par[a] = q[k];
                    q.push_back(a);
                    vis[a] = 1;
                }
            }
        }
    }
    return cost;
}
 
int main() {
    int n, s, d, t;
    cin >> t;
    while (t--) {
        cin >> n;
        init();
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                cin >> arr[i][j];
            }
        }
        cin >> s >> d;
        cout << bfs(s, d) << endl;
        //cout<<endl;
        printPath(d);
        cout << endl;
    }
    return 0;
}
