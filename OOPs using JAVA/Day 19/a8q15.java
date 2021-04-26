// 15. Write a Java Program that Implement the Nested Try Statements. 
// Author : Abhishek Sharma, 2021
public class q15 {
    public static void main(String args[]){
        try {
            int a[] = { 1,2,3 };
            System.out.println(a[10]);
            try {
                int x = a[2] / 0;
            }
            catch (ArithmeticException f) {
                System.out.println(f);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}

/*
Output :
java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
*/
