// Q26. Write a Java Program to Delete All Repeated Words in String.
import java.util.*;
//Author : Abhishek Sharma
public class q26{ 
    public static void main(String args[]){
        System.out.println("Input String");
        String input="Java is is the best programming language";
        System.out.println(input);
        countWords(input);
    }
    static void countWords(String st)
    {
        String[] words = st.split("\\s");
        for (int i = 0; i < words.length; i++)
        {
            for (int j = 0; j < words.length; j++)
            {
                if (words[i].equals(words[j]))
                {
                    if (i != j)
                        words[i] = "";
 
                }
            }
        }
        System.out.println("Removing Duplicate words:\n");
        for (int i = 0; i < words.length; i++)
        {
            if (words[i] != "")
            {
                System.out.print(words[i]+" ");
            }
        }
    }
}

/*
Output :
Java is is the best programming language
Removing Duplicate words:

Java is the best programming language
*/
