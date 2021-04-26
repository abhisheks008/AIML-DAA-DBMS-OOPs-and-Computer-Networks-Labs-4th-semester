// Q47. Write a Java Program to Verify a Class is StringBuffer Class Method. 

import java.util.*;
//Author : Abhishek Sharma
public class q47{  
    public static String concatWithString()    {  
        String t = "abhishek";  
        for (int i=0; i<10000; i++){  
            t = t + "sharma";  
        }  
        return t;  
    }  
    public static String concatWithStringBuffer(){  
        StringBuffer sb = new StringBuffer("abhishek");  
        for (int i=0; i<10000; i++){  
            sb.append("sharma");  
        }  
        return sb.toString();  
    }  
    public static void main(String[] args){  
        long startTime = System.currentTimeMillis();  
        concatWithString();  
        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");  
        startTime = System.currentTimeMillis();  
        concatWithStringBuffer();  
        System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");  
    }  
}


/*
Output :
Time taken by Concating with String: 262ms
Time taken by Concating with  StringBuffer: 1ms
*/
