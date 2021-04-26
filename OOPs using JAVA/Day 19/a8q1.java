// 1. Write a Java program to show the use of all keywords for exception handling. 
// Author : Abhishek Sharma, 2021
class q1 {
    public static void main(String[] args) {
        int a=50;   
        try {
            int sum=a/0;
        }
        catch(ArithmeticException e){
            System.out.println("Exception: "+ e); 
        }
        finally {
            System.out.println("Executing finally block");
        }
    }   
}

/*
Output :
Exception: java.lang.ArithmeticException: / by zero
Executing finally block
*/
