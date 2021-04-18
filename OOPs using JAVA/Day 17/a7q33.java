// Q33. Write a Java Program to Display the Characters in Prime Position a Given String. 
import java.util.*;
//Author : Abhishek Sharma
class q33
{
    static boolean isPrime(int n)
    {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
    
        return true;
    }
    static void prime_index(String input)
    {
        int n = input.length();
        for (int i = 2; i <= n; i++)
            if (isPrime(i))

                System.out.println(input.charAt(i - 1));        
    }
    public static void main (String[] args)
    {
        String input = "Abhishek Sharma";       
        prime_index(input);
    }
}

/*
Output:
b
h
s
e
h
r
*/
