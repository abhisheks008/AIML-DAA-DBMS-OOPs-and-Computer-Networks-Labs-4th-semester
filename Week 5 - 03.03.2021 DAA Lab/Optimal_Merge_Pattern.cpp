// Author : Abhishek Sharma
// Optimal Merge Pattern using CPP language
// Design analysis and algorithm lab problems
// difficulty : medium
// score : 10


#include<bits/stdc++.h> 
using namespace std; 
int minComputation(int size, int files[]) 
{  
    priority_queue<int, vector<int>, 
        greater<int>> pq; 

    for(int i = 0; i < size; i++) 
    { 
        pq.push(files[i]); 
    } 
    int count = 0; 
    // Author : Abhishek Sharma
    while(pq.size() > 1) 
    { 
        int first_smallest = pq.top(); 
        pq.pop(); 
        int second_smallest = pq.top(); 
        pq.pop(); 
        
        int temp = first_smallest + second_smallest; 
        count += temp; 
        pq.push(temp); 
    } 
    return count; 
} 

int main() 
{ 
    int n = 6; 
    int files[] = { 5, 3, 2, 7, 9, 13 }; 
    // Author : Abhishek Sharma
    cout << minComputation(n, files); 
    return 0; 
} 
