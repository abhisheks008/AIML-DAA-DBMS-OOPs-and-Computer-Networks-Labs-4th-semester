// Q49. Write a Java Program to Count a Group of Words in a String. 

import java.util.*;
//Author : Abhishek Sharma
public class q49 {  
    static int wordcount(String string)  
      {  
        int count=0;  
    
          char ch[]= new char[string.length()];     
          for(int i=0;i<string.length();i++)  
          {  
              ch[i]= string.charAt(i);  
              if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                  count++;  
          }  
          return count;  
      }  
    public static void main(String[] args) {  
        String string ="    India Is My Country";  
       System.out.println(wordcount(string) + " words.");   
    }  
}  
 
/*
Output :
4 words.
*/
