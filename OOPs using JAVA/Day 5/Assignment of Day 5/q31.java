// Write a Java program to find the median of a given set of numbers.


import java.util.*;
// Author : Abhishek Sharma
public class q31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number"); 
        int a=sc.nextInt();
        double[] input=new double[a];
        System.out.println("enter "+a+" elements");
        for(int i=0;i<a;i++) 
        {
            input[i]=sc.nextDouble();            
        }
        double res=medianCal(a,input);
         System.out.println("Median :"+res);         
        }
        
    static double medianCal(int  n,double in[])
    {
        double m=0;        
        if(n%2==1)
        {
            m=in[((n+1)/2)-1];            
        }
        else
        {
            m=(in[n/2-1]+in[n/2])/2;            
        }
    return m;        
     }
}




// Output :
// enter a number
// 5
// enter 5 elements
// 2
// 4
// 5
// 6
// 7
// Median :5.0
