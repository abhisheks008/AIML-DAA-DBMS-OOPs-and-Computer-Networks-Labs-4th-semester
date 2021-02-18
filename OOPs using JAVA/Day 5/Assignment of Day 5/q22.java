// Write a Java program to print all multiples of 10 in a given range.


import java.util.*;
// Author : Abhishek Sharma
public class q22 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the range : ");
       int num = sc.nextInt();
       for (int i=1; i<100; i++){
           int c = 10*i;
           if (c<num){
               System.out.println(c);
           }
           else{
               break;
           }
       }
       
    }
  }



// Output :
// Enter the range : 66
// 10
// 20
// 30
// 40
// 50
// 60
