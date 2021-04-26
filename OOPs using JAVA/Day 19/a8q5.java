/*
5. Write a program called Factorial.java that computes factorials and catches the result in an array of type long for reuse. The long type of variable has its own range. For example 20! Is as high as the range of long type. So check the argument passes and “throw an exception”, if it is too big or too small. 
• If x is less than 0 throw an IllegalArgumentException with a message “Value of x must be positive”. 
• If x is above the length of the array throw an IllegalArgumentException with a message “Result will overflow”. 
Here x is the value for which we want to find the factorial. 
*/
// Author : Abhishek Sharma, 2021
public class q5 {
    public static void calculateFactorial(long n) { 
        if (n < 0)
            throw new IllegalArgumentException("n must be positive"); 
        else if (n > 20)
            throw new IllegalArgumentException("n must be < 20"); 
        else{
            long z=n; 
            long fact=1; 
            while(n>1){
                fact*=n; 
                n--;
            }
            System.out.println("Factorial of "+z+" = "+fact);
        }
    }
    public static void main(String args[]){
        calculateFactorial(5); 
        calculateFactorial(21);
    }
}

/*
Output :
Factorial of 5 = 120
Exception in thread "main" java.lang.IllegalArgumentException: n must be < 20
*/
