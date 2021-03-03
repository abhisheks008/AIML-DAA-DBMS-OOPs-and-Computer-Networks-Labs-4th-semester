// Author : Abhishek Sharma
// Optimal Merge Pattern Problem using JAVA
// difficulty : medium
// score : 10


import java.util.Scanner; 
import java.util.PriorityQueue; 
// Author : Abhishek Sharma
public class Solution { 

    static int minComputation(int size, int files[]) 
    { 
        // pythonpapa
        PriorityQueue<Integer> pq 
            = new PriorityQueue<>(); 

        for (int i = 0; i < size; i++) { 

            pq.add(files[i]); 
        } 
        // laalbaba
        int count = 0; 

        while (pq.size() > 1) { 

            int temp = pq.poll() + pq.poll(); 

            count += temp; 

            pq.add(temp); 
        } 
        //pythonpapa written JAVA code!
        return count; 
    } 
// driver code by pythonpapa
    public static void main(String[] args) 
    { 


        int size = 6; 

        int files[] = new int[] { 5,3,2,7,9,13 }; 

        System.out.println(minComputation(size, files)); 
    } 
} 
// code contributed by Abhishek Sharma, 2021 @abhisheks008
