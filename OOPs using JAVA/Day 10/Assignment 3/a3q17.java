// Write a Java program to merge two float arrays. 

import java.util.Arrays;  
// Author : Abhishek Sharma
public class a3q17  
{  
public static void main(String[] args)   
{  
float[] firstArray = {23f,45f,12f,78f,4f,90f,1f};        
float[] secondArray = {77f,11f,45f,88f,32f,56f,3f};  
int fal = firstArray.length;        
int sal = secondArray.length;   
float[] result = new float[fal + sal];   
System.arraycopy(firstArray, 0, result, 0, fal);  
System.arraycopy(secondArray, 0, result, fal, sal);  
System.out.println(Arrays.toString(result));    
}  
}


// Output :
// [23.0, 45.0, 12.0, 78.0, 4.0, 90.0, 1.0, 77.0, 11.0, 45.0, 88.0, 32.0, 56.0, 3.0]
