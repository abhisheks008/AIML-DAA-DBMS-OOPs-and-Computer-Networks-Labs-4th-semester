// Q2. Write a Java program to show method overloading. 
// Author : Abhishek Sharma.

class Adder{  
    static int add(int a,int b)
        {
            return a+b;
        }  
    static int add(int a,int b,int c)
        {
            return a+b+c;
        }  
    }  
    class TestOverloading1{  
    public static void main(String[] args){  
    System.out.println(Adder.add(11,11));  
    System.out.println(Adder.add(11,11,11));  
    }
} 

/*
Output :
22
33
*/
