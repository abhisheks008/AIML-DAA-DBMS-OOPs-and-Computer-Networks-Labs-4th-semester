// Write a Java program to enter n elements in an array and find smallest number among them.


import java.util.Scanner;
// Author : Abhishek Sharma
public class a3q10{  
    public static int getSmallest(int[] a, int total){  
    int temp;  
    for (int i = 0; i < total; i++)   
            {  
                for (int j = i + 1; j < total; j++)   
                {  
                    if (a[i] > a[j])   
                    {  
                        temp = a[i];  
                        a[i] = a[j];  
                        a[j] = temp;  
                    }  
                }  
            }  
           return a[0];  
    }  
    public static void main(String args[]){  
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the no. of elements : ");
    int z = sc.nextInt(); 
    int[] array = new int[100];
    System.out.print("Enter the elements : ");
    for (int i = 0; i<z;i++){
        array[i] = sc.nextInt();
    }
    System.out.println("Smallest: "+getSmallest(array,z));  
  
    }
} 

/*
Output :
Enter the no. of elements : 5
Enter the elements : 69
58
41
23
55
Smallest: 23
*/
