# Binary Search 6 in C++
# Author ; Abhishek Sharma

#include<bits/stdc++.h>
using namespace std;
#define ll long long int
int main(){
        ll n;cin>>n;
        vector<ll> v(n+1);
        for(ll i=1;i<=n;i++)
            cin>>v[i];
        sort(v.begin(),v.end());
        ll q;cin>>q;
        while(q--){
            ll x;cin>>x;
            ll l=1,r=n;
            while(l<=r){
                ll mid=(l+r)/2;
                if(v[mid]<=x)
                    l=mid+1;
                else 
                    r=mid-1;
            }
            cout<<r<<endl;
        }
}
