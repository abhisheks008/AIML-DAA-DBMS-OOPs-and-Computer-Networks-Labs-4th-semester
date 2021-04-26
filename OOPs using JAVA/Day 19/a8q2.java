// 2. Write a Java program using try and catch to generate NegativeArrayIndex Exception and Arithmetic Exception. 
// Author : Abhishek Sharma, 2021
public class q2 { 
    public static void main(String[] args) {
        int arr[];
        try {
            arr=new int[-10];
        }
        catch(NegativeArraySizeException f){ 
            System.out.println("Exception "+f);
        }
        int a=50;
        try{
            int sum=a/0;
        }
        catch(ArithmeticException e){
            System.out.println("Exception: "+e);
        }
    }
}

/*
Output :
Exception java.lang.NegativeArraySizeException: -10
Exception: java.lang.ArithmeticException: / by zero
*/
