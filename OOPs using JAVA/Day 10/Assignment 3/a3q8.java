// Write a Java program to find the sum of diagonal elements in a 2D array.


import java.io.*; 
// Author : Abhishek Sharma
public class a3q8 { 

    static void printDiagonalSums(int [][]mat, 
                                        int n) 
    { 
        int principal = 0, secondary = 0; 
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) { 
    
                // Condition for principal 
                // diagonal 
                if (i == j) 
                    principal += mat[i][j]; 
    
                // Condition for secondary 
                // diagonal 
                if ((i + j) == (n - 1)) 
                    secondary += mat[i][j]; 
            } 
        } 
    
        System.out.println("Principal Diagonal : "
                                    + principal); 
                                    
        System.out.println("Secondary Diagonal : "
                                    + secondary); 
    } 

    // Driver code 
    static public void main (String[] args) 
    { 
        
        int [][]a = { { 1, 2, 3, 4 }, 
                    { 5, 6, 7, 8 }, 
                    { 1, 2, 3, 4 }, 
                    { 5, 6, 7, 8 } }; 
                    
        printDiagonalSums(a, 4); 
    } 
} 

/*
Output :
Principal Diagonal : 18
Secondary Diagonal : 18
*/
