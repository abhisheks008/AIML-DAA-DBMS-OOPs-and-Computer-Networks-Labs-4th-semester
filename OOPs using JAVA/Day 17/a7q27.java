// Q27. Write a Java Program to Reverse the String Using Both Recursion and Iteration.
import java.util.*;
//Author : Abhishek Sharma
class q27{
    public static String recursiveReverse(char []str){
    Stack<Character> st = new Stack<>();
    for(int i=0; i<str.length; i++)
        st.push(str[i]);

    for (int i=0; i<str.length; i++) {
        str[i] = st.peek();
        st.pop();
    }   
    return String.valueOf(str);
}

    public static void main(String []args){
        String str = "abhishek sharma";
        str = recursiveReverse(str.toCharArray());
        System.out.println(str);
    }
}

/*
Output :
amrahs kehsihba
*/
