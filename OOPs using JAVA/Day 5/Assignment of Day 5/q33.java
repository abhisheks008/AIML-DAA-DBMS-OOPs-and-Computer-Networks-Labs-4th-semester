// Write a Java program to find all the combinations of 1,2 and 3 using for loop.


import java.util.*;
// Author : Abhishek Sharma
public class q33 {
    public static void main(String[] args) {
        System.out.println("All the combinations of 1,2 and 3");
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                for(int k=1;k<=3;k++){
                    if(i!=j && i!=k && j!=k){
                            System.out.printf("%d %d %d\n", i, j, k);
                    }
                }
            }
        }      
    }   
}




// Output :
// All the combinations of 1,2 and 3
// 1 2 3
// 1 3 2
// 2 1 3
// 2 3 1
// 3 1 2
// 3 2 1
