// 6. Write a class that keeps a running total of all characters passed to it (one at a time) and throws an exception if it is passed a non-alphabetic character. 
// Author : Abhishek Sharma, 2021
class NonAlphabeticException extends Exception{
    NonAlphabeticException(String s){
        super(s);
    }
}
class Alpha{
    public static void alpha(char a) throws NonAlphabeticException{
        if(a<97 || a>122){
            throw new NonAlphabeticException("NonAlphabeticException");
        }
    }
}
public class q6 {
    public static void main(String args[]){
        char[] a={'a','b','c','1'};
        int i=0;
        while(i<a.length){
            try {
                Alpha.alpha(a[i]);
            } 
            catch (NonAlphabeticException e) {
                System.out.println(e);
            }
            i++;
        }
        System.out.println("Rest");
    }
}

/*
Output :
NonAlphabeticException: NonAlphabeticException
Rest
*/
