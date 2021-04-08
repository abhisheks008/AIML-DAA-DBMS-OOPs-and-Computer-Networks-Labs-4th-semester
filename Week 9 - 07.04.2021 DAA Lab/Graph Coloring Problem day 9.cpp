// DAA Lab 9 Week 9
// Graph Coloring problem using C++ 14
// Code contributed by, Abhishek Sharma, 2021


#include <bits/stdc++.h>
using namespace std;
#define rep(i,a,b) for(int i=(a);i<=(b);i++)
#define ll long long
#define pll pair<ll, ll>
#define pii pair<int,int>
#define pb push_back
#define F first
#define S second
#define mod 1000000007
#define maxn 100005
#define boost ios::sync_with_stdio(false);cin.tie(0)
#define fr freopen("source.txt","r",stdin),freopen("output.txt","w",stdout)
#define SET(a,b) memset(a,b,sizeof(a))

vector<int>g[maxn];
int vis[maxn],color[maxn],sz,cnt,f;

void dfs(int v,int c){
  if(vis[v]==1&&color[v]!=c){
    f=1;
    return;
  }
  else if(vis[v]==1){
    return;
  }
  vis[v]=1;
  color[v]=c;
  cnt+=c;
  sz++;
  for(int u:g[v]){
    dfs(u,1-c);
  }
}

int main(){
  boost;
  
  int t;
  cin>>t;
while(t--){
  f=0;
  int n,m,ans=0;
  cin>>n>>m;
  rep(i,1,n){
    vis[i]=0;
    g[i].clear();
    color[i]=0;
  }
  rep(i,1,m){
    int u,v;
    cin>>u>>v;
    g[u].pb(v);
    g[v].pb(u);
  }

  for(int i=1;i<=n;i++){
    if(vis[i]==0){
      sz=0;
      cnt=0;
      dfs(i,0);
      ans+=max(sz-cnt,cnt);
    }
  } 
  if(f==1)cout<<"NO\n";
  else cout<<ans<<endl;
}
  return 0;
}
